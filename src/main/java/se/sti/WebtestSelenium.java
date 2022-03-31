package se.sti;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class WebtestSelenium {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriverManager.firefoxdriver().setup();
        WebDriverManager.safaridriver().setup();

        WebDriver driver;
        driver = new FirefoxDriver();
//        driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/March_31");

        System.out.println("Initial title: " + driver.getTitle());

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5000);

        WebElement wikiMainPageLogo = driver.findElement(By.id("p-logo"));
        wikiMainPageLogo.click();
        System.out.println("Current title: " + driver.getTitle());





    }
}
