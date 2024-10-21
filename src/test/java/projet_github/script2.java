package projet_github;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class script2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		driver.manage().window().fullscreen();
		// Utiliser une variable
		WebElement variable_search = driver.findElement(By.name("q"));
		variable_search.sendKeys("voiture 2024");
		//Permet d'imiter la touche "Entrer" après la saisie
		variable_search.submit();

	}

}
