package javaScriptCalculator.tests;


import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import sun.rmi.runtime.Log;
import static org.junit.Assert.assertTrue;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;




public class CalculatorStory1 {


        @Test
        public void firstTest() throws Exception {
            System.setProperty("webdriver.chrome.driver", "/Users/rickythornley/repo/DOrg2-Automated-Tests/drivers/chrome/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get( "http://compendiumdev.co.uk/selenium" );

            Assert.assertEquals( "This should start with Selenium Simplified",  "Selenium Simplified book and ebook on Automated Web Testing with Java and Selenium RC", driver.getTitle());

            driver.quit();
        }







}
