package ecommerce.hybrid.testrunner;

import org.testng.annotations.Test;

import ecommerce.hybrid.actions.Capabilities;
import ecommerce.hybrid.beans.LoginPOM;
import ecommerce.hybrid.beans.CoursePOM;
import ecommerce.hybrid.beans.LogoutPOM;
import ecommerce.hybrid.utils.CaptureScreenshot;
import ecommerce.hybrid.utils.Ecommerce_Utils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.testng.Assert;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class HybridTestRunner extends Capabilities {

	public static AndroidDriver<AndroidElement> driver = null;
	public static LoginPOM loginPom = null;
	public static CoursePOM coursePOM = null;
	public static LogoutPOM shoppingCartPom = null;
	public static LogoutPOM logoutPom=null;
	public static Ecommerce_Utils eUtils = null;
	public static CaptureScreenshot captureScreenshot = null;

	@BeforeTest
	public void beforeTest() throws MalformedURLException {

		System.out.println("*****************  In BeforeTest *************");
		driver = Capabilities.capability();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		captureScreenshot = new CaptureScreenshot(driver);
		eUtils = new Ecommerce_Utils(driver);
		loginPom = new LoginPOM(driver);
		coursePOM = new CoursePOM(driver);
		shoppingCartPom = new LogoutPOM(driver);
	}

	@Test(priority = 0)
	public void TC01() {

		try {

			Thread.sleep(15000);
			loginPom.Clickdismiss();
			Thread.sleep(20000);
			loginPom.ClickonSignin();
			loginPom.signinwithGoogle();
			loginPom.clickingonemail();
			loginPom.language();
			loginPom.sellanguage();
			loginPom.selectEnglish_NavigateBack();
			

		} catch (Exception e) {

			e.printStackTrace();
			captureScreenshot.screenshot();
		}
	}

	@Test(priority = 1)
	public void TC02() {

		try {

			loginPom.getStarted();
			//loginPom.adultlearner();
			loginPom.clickonclaculas();
			loginPom.done();
			System.out.println("clicked on Done button");
			loginPom.adultlearner();
			loginPom.done();
			loginPom.closeGrade();
			
		} catch (Exception e) {

			e.printStackTrace();
			 captureScreenshot.screenshot();
		}
		
	}
		@Test(priority = 3)
		public void TC03() {

			try {
				Thread.sleep(15000);
				/*loginPom.Clickdismiss();
				Thread.sleep(20000);
				loginPom.ClickonSignin();
				loginPom.signinwithGoogle();
				loginPom.clickingonemail();*/
				coursePOM.clickonclaculashomepage();
				coursePOM.gettakecoure();
				
			} catch (Exception e) {

				e.printStackTrace();
				 captureScreenshot.screenshot();
			}
		
		
	}

	@AfterTest
	public void afterTest() throws InterruptedException {

		System.out.println("*****************  In AfterTest *************");
		/*logoutPom.gotoHome();
		logoutPom.gotoSettings();
		logoutPom.logOut();
		System.out.println("Logged out of the application!!!!!!!!!");
		driver.quit();*/
	}

}
