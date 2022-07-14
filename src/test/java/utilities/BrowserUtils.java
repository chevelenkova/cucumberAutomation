package utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {
    public static void switchWindowAndVerify(String expectedUrl,String expectedTittle){
        Set<String> allWindows = Driver.getDriver().getWindowHandles();
        for(String each : allWindows){
            Driver.getDriver().switchTo().window(each);
            if(Driver.getDriver().getCurrentUrl().contains(expectedUrl)){
                System.out.println("driver.getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
                break;
            }
        }
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("Title verification failed",actualTitle.contains(expectedTittle));

    }
    public static void verifyTittle(WebDriver driver,String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle,"Title verification failed");
    }

    public static void waitForInvisibility(WebElement element){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public static String[] convertListOfWebElementsToListOfStrings(List<WebElement> webElementList){
        String [] listOfStrings = new String[webElementList.size()];
        for(int i=0;i<webElementList.size();i++){
           listOfStrings[i] = webElementList.get(i).getText();
        }
        return listOfStrings;

    }
}
