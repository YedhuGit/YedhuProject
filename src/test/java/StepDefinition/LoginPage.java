package StepDefinition;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

static WebDriver driver;

public static void alertTest(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demo.automationtesting.in/Alerts.html");
    System.out.println("Yedhu");
    driver.findElement(By.linkText("SwitchTo")).click();
}
public static void frameTest(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    
}

    public static void main(String[] args) {
   frameTest();
    //alertTest();
    }
}
