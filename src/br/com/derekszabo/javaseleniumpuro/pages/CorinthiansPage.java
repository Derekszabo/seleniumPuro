package br.com.derekszabo.javaseleniumpuro.pages;

import org.openqa.selenium.By;

public class CorinthiansPage {

	public static By ingressos = By.xpath("//a[@class='ct-submenu-trigger'][contains(text(),'Ingressos')]");
	public static By ingressoNaoSocio = By.xpath("//div[@class='ct-submenu']//a[contains(text(),'Venda - Não-sócio')]");
	public static By popUp = By.xpath("//div[@id='slick-slide01']//p[contains(text(),'Tendo em vista a pandemia do coronavírus (Covid-19')]");
	

}
