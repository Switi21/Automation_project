import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezone {
public static void main (String [] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\eclipse programs\\Automation_project\\Drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D62971744990%26hvpone%3D%26hvptwo%3D%26hvadid%3D486457213133%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D16726154084876849026%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062096%26hvtargid%3Dkwd-360364908437%26hydadcr%3D5619_2175799%26gclid%3DCj0KCQiAkZKNBhDiARIsAPsk0WjBwoDu6nD-ZEYg9Q64pBD8qY2AOdSM_XXyFkOrb_67kGdCXD4q0HgaAlapEALw_wcB&prevRID=8H1MMWMRNYRB61YHR6FN&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("riya");
driver.findElement(By.xpath("//input[@placeholder='Mobile number']")).sendKeys("9689475345");
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("riya1@gmail.com");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Riya@123");
driver.findElement(By.xpath("//input[@id='continue']")).click();
Thread.sleep(1000);
}
}
