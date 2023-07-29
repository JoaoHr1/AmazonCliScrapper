
# Amazon Cli Scrapper 
[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)

Confira de forma ágil e fácil diversos produtos oferecidos pelo site Amazon.com.br utilizando apenas o seu terminal!

## Rodando localmente

Clone o projeto

```bash
  git clone https://github.com/JoaoHr1/amazonCliScrapper.git
```

Entre no diretório

```bash
  cd amazonCliScrapper
```

Compile o projeto

```bash
  mvn clean-package
```

Inicie o aplicativo

```bash
  mvn spring-boot:run
```


## Lista de comandos disponíveis

| Comando  | Descrição |
| :---------- | :-----------------------------|
| 1 | `Retorna uma lista de computadores` |
| 2 | `Retorna uma lista de celulares` |
| 3 | `Retorna uma lista de nooteboks` |
| 4 produto | `Retorna um produto especifico` |


## Demonstração 

```
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
| 
| Produto: Smartphone Motorola Moto G23 4G 128GB 4GB RAM Grafite
| Preço: R$1.018,00
| Link: https://www.amazon.com.br/Smartphone-Motorola-Moto-128GB-Grafite/dp/B0BSXQZQ3J/ref=sr_1_23?crid=YYVVBP69OUX6&keywords=celular&qid=1690646335&sprefix=%2Caps%2C805&sr=8-23&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147
| 
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
| 
| Produto: Smartphone Xiaomi Redmi Note 12S Onyx Black 8GB Ram 256GB
| Preço: R$1.353,00
| Link: https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Black-256GB/dp/B0C3WJB8NK/ref=sr_1_24?crid=YYVVBP69OUX6&keywords=celular&qid=1690646335&sprefix=%2Caps%2C805&sr=8-24&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147
| 
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
| 
| Produto: Smartphone Xiaomi Poco M5 128GB 6Gb Black no Brasil - Preto
| Preço: R$1.016,00
| Link: https://www.amazon.com.br/Smartphone-Xiaomi-128GB-Black-Brasil/dp/B0BD64QF6F/ref=sr_1_25?crid=YYVVBP69OUX6&keywords=celular&qid=1690646335&sprefix=%2Caps%2C805&sr=8-25&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147
| 
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
```


## Tecnologias utilizadas

* Java 17
* Spring-Shell
* Maven
* Jsoup


## Feedback 

Caso queira contribuir com ideias ou sugestões, entre em contato comigo
[@JoaoHr1](https://www.github.com/JoaoHr1)

