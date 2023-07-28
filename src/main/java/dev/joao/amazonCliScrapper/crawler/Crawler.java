package dev.joao.amazonCliScrapper.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Crawler {
    public Crawler(String url) {

        try {
            System.out.println("Carregando lista de produtos...");
            Document document = Jsoup.connect(url).get();
            Elements titleItem = document.select(".s-result-item");

            for (Element element : titleItem) {
                Element priceElement = element.selectFirst(".a-price-whole");
                Elements descriptionElements = element.select(".a-size-base-plus.a-color-base.a-text-normal");
                Element priceFractionElement = element.selectFirst(".a-price-fraction");
                Element linkElement = element.selectFirst(".a-link-normal");

                if (priceElement != null && priceFractionElement != null && linkElement != null) {
                    String price = priceElement.text();
                    String description = descriptionElements.get(0).text();

                    String priceFraction = priceFractionElement.text();
                    String link = "https://www.amazon.com.br" + linkElement.attr("href");


                    if (descriptionElements.get(0).text().split("\\s+").length > 4) {
                        System.out.println("Produto: " + description);
                    } else {
                        System.out.println("Produto: " + description + " " + descriptionElements.get(1).text());
                    }
                    System.out.println("Preço: R$" + price + priceFraction);
                    System.out.println("Link: " + link);
                    System.out.println("-----------------------------");
                }
            }
            System.out.println("Fim da lista, carregue mais produtos digitando o comando novamente!" );
        } catch (IOException e) {
            Logger.getGlobal().log(Level.WARNING, "Erro ao carregar URL, tente novamente!");
        }
    }
}










