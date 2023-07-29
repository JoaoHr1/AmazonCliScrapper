package dev.joao.amazonCliScrapper.linkShortner;

import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;

import java.io.*;
import java.net.*;

public class ShortLink {

    public String Shorter(String link) {
        String url = "https://gotiny.cc/api";
        String jsonData = "{\"input\":\"" + link + "\"}";

            try {
                URL obj = new URL(url);
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                con.setRequestMethod("POST");
                con.setRequestProperty("Content-Type", "application/json");

                con.setDoOutput(true);
                OutputStream os = con.getOutputStream();
                os.write(jsonData.getBytes());
                os.flush();
                os.close();

                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                JSONArray jsonArray = new JSONArray(response.toString());

                if (jsonArray.length() > 0) {
                    String code = jsonArray.getJSONObject(0).getString("code");
                    return "https://gotiny.cc/" + code;
                } else {
                    System.out.println("Resposta vazia ou formato de JSON inválido.");
                }

            } catch (IOException | JSONException e) {
                e.printStackTrace();
            }
            return null;
        }
}

