package dev.joao.amazonCliScrapper.commands;

import dev.joao.amazonCliScrapper.crawler.Crawler;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class CliCommands {

    @ShellMethod(key = "computador", value = "Busca uma lista de computadores no site da Amazon.")
    public void buscarPc() {
        Crawler crawler = new Crawler("https://www.amazon.com.br/s?k=computador&crid=YYVVBP69OUX6&sprefix=%2Caps%2C805&ref=nb_sb_ss_recent_1_0_recent%22");
    }

    @ShellMethod(key = "celular", value = "Busca uma lista de celulares no site da Amazon.")
    public void buscarCelular() {
        Crawler crawler = new Crawler("https://www.amazon.com.br/s?k=celular&crid=YYVVBP69OUX6&sprefix=%2Caps%2C805&ref=nb_sb_ss_recent_1_0_recent%22");
    }

    @ShellMethod(key = "notebook", value = "Busca uma lista de notebooks no site da Amazon.")
    public void buscarNotebook() {
        Crawler crawler = new Crawler("https://www.amazon.com.br/s?k=notebook&crid=YYVVBP69OUX6&sprefix=%2Caps%2C805&ref=nb_sb_ss_recent_1_0_recent%22");
    }

}
