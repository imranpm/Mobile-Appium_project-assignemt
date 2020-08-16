package ecommerce.hybrid.beans;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

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

public class LoginPOM{
	
	public static AndroidDriver <AndroidElement> driver=null;
		
	public LoginPOM(AndroidDriver <AndroidElement> driver) throws MalformedURLException {

		this.driver=driver;
	}
	
	public void Clickdismiss() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.findElement(MobileBy.className("android.widget.Button")).click();
		
		//return c;
	}

	public void ClickonSignin() throws InterruptedException {
	
	driver.findElementByAndroidUIAutomator("text(\"Sign in\")").click();
	 }
	
	public void signinwithGoogle() throws InterruptedException {
		Thread.sleep(20000);	
		driver.findElementByAndroidUIAutomator("text(\"Continue with Google\")").click();
		}
	public void clickingonemail() throws InterruptedException {
		
		Thread.sleep(30000);
		
		driver.findElementByAndroidUIAutomator("text(\"pm imran\")").click();
	}
	
public void getStarted() throws InterruptedException {
	Thread.sleep(10000);
        //driver.findElementByAndroidUIAutomator("text(\"Get started\")").click();
	
	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(textMatches(\"Edit\").instance(0))")); 
	   driver.findElement(MobileBy.xpath("//*[@text='Edit' and @class='android.widget.TextView']")).click();
    }
    public void adultlearner() throws InterruptedException {
    	Thread.sleep(10000);
         driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Adult learner\"))").click();
	
}
   public void clickonclaculas() throws InterruptedException{
	   Thread.sleep(30000);
	   String name= driver.findElementByAndroidUIAutomator("text(\"Calculus 1\")").getText();
	   System.out.println(name);
	   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[8]/android.view.ViewGroup/android.view.ViewGroup[1]")).click();   
   }
    
   public void done(){
   
	   driver.findElement(By.className("android.widget.Button")).click();
}
   
   
   public void language() throws InterruptedException{
	   Thread.sleep(30000);
	   //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Select language\"))").click();
	   
	   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().className(\"android.view.ViewGroup\")).scrollIntoView(textMatches(\"Select language\").instance(0))")); 
	   driver.findElement(MobileBy.xpath("//*[@text='Select language' and @class='android.widget.TextView']")).click();
   }
   
   public void sellanguage() throws InterruptedException{
	   Thread.sleep(10000);
	  // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RadioButton")).click();
	   driver.findElementByAndroidUIAutomator("text(\"English\")").click();
	   
   }
   public void selectEnglish_NavigateBack() throws InterruptedException{
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RadioButton")).click();
	   Thread.sleep(1000);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().className(\"android.widget.ImageButton\")")).click();
	//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().className(\"android.widget.ImageView\")")).click();
	   
   }
   
   
   public void closeGrade() throws InterruptedException{
	   Thread.sleep(100);
	   driver.findElement(By.className("android.widget.ImageView")).click();
	   
   }
   
   }
   
   
   
