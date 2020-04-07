package br.com.derekszabo.javaseleniumpuro.testes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;

import br.com.derekszabo.javaseleniumpuro.core.SetDriver;
import br.com.derekszabo.javaseleniumpuro.pages.CorinthiansPage;

public class TesteCorinthians {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = SetDriver.configurarDriver();

		// Quero abrir o site do Corinthians
		driver.get("https://www.corinthians.com.br/");

		// Ir na seção de Ingressos - Não Sócio
		driver.findElement(CorinthiansPage.ingressos).click();
		driver.findElement(CorinthiansPage.ingressoNaoSocio).click();

		// Verifico se fui direcionado a pagina correta
		 List<String> abas = new ArrayList<>(driver.getWindowHandles());
		 driver.switchTo().window(abas.get(1));
		 String currentUrl = driver.getCurrentUrl();
		if (currentUrl.contains("ingressoscorinthians.com.br")) {
			System.out.println("Estou na Página Correta!");
		}

		Thread.sleep(5000);
		driver.quit();

	}

}
