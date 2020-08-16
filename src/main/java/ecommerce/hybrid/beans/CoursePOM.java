package ecommerce.hybrid.beans;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import ecommerce.hybrid.actions.Capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class CoursePOM{
	
	public static AndroidDriver <AndroidElement> driver=null;
	
	public CoursePOM(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
	}
	
	public void clickonclaculashomepage() throws InterruptedException{
		   Thread.sleep(30000);
		    //driver.findElementByAndroidUIAutomator("text(\"Calculus 1\")").click();
		    
		   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(textMatches(\"Calculus 1\").instance(0))")); 
		   driver.findElement(MobileBy.xpath("//*[@text='Calculus 1' and @class='android.widget.TextView']")).click();
		    
		    System.out.println("Clicked on calculas home page");
		 
	}
	
	public void gettakecoure() throws InterruptedException{
		   Thread.sleep(30000);
		    //driver.findElementByAndroidUIAutomator("text(\"Calculus 1\")").click();
		    
		   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(textMatches(\"Take Course Challenge\").instance(0))")); 
		  String actaul= driver.findElement(MobileBy.xpath("//*[@text='Take Course Challenge' and @class='android.widget.TextView']")).getText();
		
		  System.out.println(actaul);
		String   expected ="Take Course Challenge";
		Assert.assertEquals(expected, actaul);
		
		/*if (actaul.contains(expected)){
			System.out.println("*************Take Course Challenge is present ----->Test case pass");
}
		else {	
			System.out.println("*************Take Course Challenge is not present ----->Test case fail");
		}*/
		    
		    
		 
	}
	
	
}