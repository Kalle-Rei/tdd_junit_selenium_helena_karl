package se.sti;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
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
        //driver = new FirefoxDriver();
         driver = new ChromeDriver();

        driver.get("https://en.wikipedia.org/wiki/March_31");

        //Initializing WebElement for code readability
        WebElement searchButton = driver.findElement(By.id("searchButton"));
        WebElement wikiMainPageLogo = driver.findElement(By.id("p-logo"));
        WebElement searchBox = driver.findElement(By.id("searchInput"));

        //Checking title change
        System.out.println("Initial title: " + driver.getTitle());

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        Thread.sleep(5000);

        wikiMainPageLogo = driver.findElement(By.id("p-logo"));
        wikiMainPageLogo.click();
        System.out.println("Current title: " + driver.getTitle());


        //Testing keyboard input in searchBox
        searchBox = driver.findElement(By.id("searchInput"));
        Thread.sleep(3000);

        searchBox.sendKeys("Cat");
        Thread.sleep(500);
        searchBox.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(500);
        searchBox.sendKeys(Keys.ENTER);

        // Search by pressing the search button instead of passing Keys.ENTER
        Thread.sleep(3000);
        wikiMainPageLogo = driver.findElement(By.id("p-logo"));
        wikiMainPageLogo.click();

        searchBox = driver.findElement(By.id("searchInput"));
        searchButton = driver.findElement(By.id("searchButton"));
        searchBox.sendKeys("Cat");
        Thread.sleep(500);
        searchButton.click();


        Thread.sleep(5000);
        driver.quit();

    }
}
