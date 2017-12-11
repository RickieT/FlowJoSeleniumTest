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

//file:///Users


public class CalculatorStory1 {


        @Test
        // Verify Page title to ensure test begins on proper page, the HTML does not designate a page title, so this test cannot pass until implemented

        public void CheckTitle() throws Exception {
            // -- Setup
            System.setProperty("webdriver.chrome.driver", "/Users/rickythornley/repo/FlowJoSeleniumTest/src/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get( "file:///users/rickythornley/repo/FlowJoSeleniumTest/html/Calc.html" );

            Assert.assertTrue("Error: Title is '" + driver.getTitle() + "', and should be Calc.html", driver.getTitle().startsWith("Calc"));


            driver.quit();
        }


        @Test
        // Test Case # 1: Verify the "=" sign, by it's existence, and functionality --
        // "Calculator should contain a clickable element containing an = with a corresponding id="equals" ".

        public void equalSignFunction() throws Exception {
            // -- Setup
            System.setProperty("webdriver.chrome.driver", "/Users/rickythornley/repo/FlowJoSeleniumTest/src/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get( "file:///users/rickythornley/repo/FlowJoSeleniumTest/html/Calc.html" );

            // -- Test
            Assert.assertTrue("Error: Title is '" + driver.getTitle() + "', and does not contain Farts", driver.getTitle().startsWith("Selenium Farts"));

            driver.quit();
        }







}
