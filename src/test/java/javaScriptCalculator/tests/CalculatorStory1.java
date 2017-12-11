package javaScriptCalculator.tests;


import com.sun.xml.internal.bind.v2.model.core.ID;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

        public void equalSignByID() throws Exception {
            // -- Setup
                System.setProperty("webdriver.chrome.driver", "/Users/rickythornley/repo/FlowJoSeleniumTest/src/drivers/chromedriver");
                WebDriver driver = new ChromeDriver();
                driver.get( "file:///users/rickythornley/repo/FlowJoSeleniumTest/html/Calc.html" );

            // -- Test
                driver.findElement(By.id("equals"));

            driver.quit();
        }

        @Test
        // Make sure the addition function works properly
        public void AdditionCheck() throws Exception {
        // -- Setup
            System.setProperty("webdriver.chrome.driver", "/Users/rickythornley/repo/FlowJoSeleniumTest/src/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get( "file:///users/rickythornley/repo/FlowJoSeleniumTest/html/Calc.html" );


        // -- Test
            driver.findElement(By.id("one")).click();
            System.out.println("Click on One: Success");
            driver.findElement(By.id("add")).click();
            System.out.println("Click on Add Success");
            driver.findElement(By.id("two")).click();
            System.out.println("Click on Two: Success");
            driver.findElement(By.id("equals")).click();
            System.out.println("Click on Equals: Success");
            String display = driver.findElement(By.id("output")).getAttribute("value");
            assertEquals("Output is " + display, "3", display);


        driver.quit();
    }
        @Test
        // Make sure the Subtraction function works properly
        public void SubtractionCheck() throws Exception {
        // -- Setup
            System.setProperty("webdriver.chrome.driver", "/Users/rickythornley/repo/FlowJoSeleniumTest/src/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get( "file:///users/rickythornley/repo/FlowJoSeleniumTest/html/Calc.html" );


        // -- Test
            driver.findElement(By.id("five")).click();
            System.out.println("Click on Five: Success");
            driver.findElement(By.id("subtract")).click();
            System.out.println("Click on Subtract: Success");
            driver.findElement(By.id("three")).click();
            System.out.println("Click on Three: Success");
            driver.findElement(By.id("equals")).click();
            System.out.println("Click on Equals: Success");
            String display = driver.findElement(By.id("output")).getAttribute("value");
            assertEquals("Output is " + display, "2", display);


        driver.quit();
        }

        @Test
        // Make sure the Division function works properly
        public void DivisionCheck() throws Exception {
        // -- Setup
            System.setProperty("webdriver.chrome.driver", "/Users/rickythornley/repo/FlowJoSeleniumTest/src/drivers/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get( "file:///users/rickythornley/repo/FlowJoSeleniumTest/html/Calc.html" );


        // -- Test
            driver.findElement(By.id("one")).click();
            System.out.println("Click on One: Success");
            driver.findElement(By.id("zero")).click();
            System.out.println("Click on Zero: Success");
            driver.findElement(By.id("divide")).click();
            System.out.println("Click on Divide: Success");
            driver.findElement(By.id("two")).click();
            System.out.println("Click on Two: Success");
            driver.findElement(By.id("equals")).click();
            System.out.println("Click on Equals: Success");
            String display = driver.findElement(By.id("output")).getAttribute("value");
            assertEquals("Output is " + display, "5", display);

        driver.quit();
        }

        @Test
        // Make sure the Multiply function works properly
        public void MultiplyCheck() throws Exception {
            // -- Setup
                System.setProperty("webdriver.chrome.driver", "/Users/rickythornley/repo/FlowJoSeleniumTest/src/drivers/chromedriver");
                WebDriver driver = new ChromeDriver();
                driver.get( "file:///users/rickythornley/repo/FlowJoSeleniumTest/html/Calc.html" );


            // -- Test
                driver.findElement(By.id("one")).click();
                System.out.println("Click on One: Success");
                driver.findElement(By.id("multiply")).click();
                System.out.println("Click on Add Success");
                driver.findElement(By.id("two")).click();
                System.out.println("Click on Two: Success");
                driver.findElement(By.id("equals")).click();
                System.out.println("Click on Equals: Success");
                String display = driver.findElement(By.id("output")).getAttribute("value");
                assertEquals("Output is " + display, "2", display);


        driver.quit();
        }



        @Test
            // Tests all #'s exist and can be clicked, as well as that the screen be cleared afterward.
            public void InputAndclearCheck() throws Exception {
            // -- Setup
                System.setProperty("webdriver.chrome.driver", "/Users/rickythornley/repo/FlowJoSeleniumTest/src/drivers/chromedriver");
                WebDriver driver = new ChromeDriver();
                driver.get( "file:///users/rickythornley/repo/FlowJoSeleniumTest/html/Calc.html" );


            // -- Test
                driver.findElement(By.id("one")).click();
                System.out.println("Click on One: Success");
                driver.findElement(By.id("two")).click();
                System.out.println("Click on Two: Success");
                driver.findElement(By.id("three")).click();
                System.out.println("Click on Three: Success");
                driver.findElement(By.id("one")).click();
                System.out.println("Click on Four: Success");
                driver.findElement(By.id("two")).click();
                System.out.println("Click on Five: Success");
                driver.findElement(By.id("three")).click();
                System.out.println("Click on Six: Success");
                driver.findElement(By.id("seven")).click();
                System.out.println("Click on Seven: Success");
                driver.findElement(By.id("eight")).click();
                System.out.println("Click on Eight: Success");
                driver.findElement(By.id("nine")).click();
                System.out.println("Click on Nine: Success");
                driver.findElement(By.id("zero")).click();
                System.out.println("Click on Zero: Success");
                driver.findElement(By.id("clear")).click();
                System.out.println("Click on Clear: Success");
                String display = driver.findElement(By.id("output")).getAttribute("value");
                assertEquals("Output is " + display, "", display);

        driver.quit();
        }


        @Test
        // Verify values with decimals can also be calculated as expected
        public void DecimalCheck() throws Exception {
            // -- Setup
                System.setProperty("webdriver.chrome.driver", "/Users/rickythornley/repo/FlowJoSeleniumTest/src/drivers/chromedriver");
                WebDriver driver = new ChromeDriver();
                driver.get("file:///users/rickythornley/repo/FlowJoSeleniumTest/html/Calc.html");


            // -- Test
                driver.findElement(By.id("five")).click();
                System.out.println("Click on Five: Success");
                driver.findElement(By.id("divide")).click();
                System.out.println("Click on Divide: Success");
                driver.findElement(By.id("two")).click();
                System.out.println("Click on Two: Success");
                driver.findElement(By.id("equals")).click();
                System.out.println("Click on Equals: Success");
                driver.findElement(By.id("multiply")).click();
                System.out.println("Click on Multiply: Success");
                driver.findElement(By.id("three")).click();
                System.out.println("Click on Three: Success");
                driver.findElement(By.id("equals")).click();
                System.out.println("Click on Equals: Success");
                String display = driver.findElement(By.id("output")).getAttribute("value");
                assertEquals("Output is " + display, "7.5", display);

        driver.quit();
        }

        @Test
        // Verify multiple functions can be used as part of an equation, and proper answer is calculated.
        public void CheckAllFunctionsInOneEquasion() throws Exception {
            // -- Setup
                System.setProperty("webdriver.chrome.driver", "/Users/rickythornley/repo/FlowJoSeleniumTest/src/drivers/chromedriver");
                WebDriver driver = new ChromeDriver();
                driver.get( "file:///users/rickythornley/repo/FlowJoSeleniumTest/html/Calc.html" );


            // -- Test
                driver.findElement(By.id("one")).click();
                System.out.println("Click on One: Success");
                driver.findElement(By.id("add")).click();
                System.out.println("Click on Add: Success");
                driver.findElement(By.id("two")).click();
                System.out.println("Click on Two: Success");
                driver.findElement(By.id("multiply")).click();
                System.out.println("Click on Multiply: Success");
                driver.findElement(By.id("three")).click();
                System.out.println("Click on Three: Success");
                driver.findElement(By.id("divide")).click();
                System.out.println("Click on Divide: Success");
                driver.findElement(By.id("two")).click();
                System.out.println("Click on Two: Success");
                driver.findElement(By.id("equals")).click();
                System.out.println("Click on Equals: Success");
                String display = driver.findElement(By.id("output")).getAttribute("value");
                assertEquals("Output is " + display, "4", display);

        driver.quit();
        }
    }







