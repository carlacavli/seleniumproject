package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindbyTag {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/muberracavli/Desktop/TechnoStudy/chrome driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get( "https://www.seleniumeasy.com/test/basic-first-form-demo.html" );
        WebElement element = driver.findElement( By.tagName( "input" ) );
        WebElement sameElement = driver.findElement( By.cssSelector( "input" ) );

        System.out.println(element.getAttribute( "outerHTML" ));
        System.out.println("---------------------------------------");
        System.out.println(sameElement.getAttribute( "outerHTML" ));

        driver.quit();
    }
}