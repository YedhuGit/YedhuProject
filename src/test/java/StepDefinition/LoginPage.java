package StepDefinition;

import io.github.bonigarcia.wdm.WebDriverManager;
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

}

    public static void main(String[] args) {
alertTest();
    }
}
