import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class instalTest {

    private WebDriver driver;

    @BeforeAll
    public static void setUpAll() {
        System.setProperties("webdriver.crome.driver", "./driver/win/chromedriver.exe");
    }

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void terDown() {
        driver.quit();
        driver = null;
    }

    @Test
    public void test() {
        driver.get("www.www.www");
        driver.findElement(By.cssSelector("[type='text']")).sendKeys("name");
        driver.findElement(By.cssSelector("[type='tel']")).sendKeys("123123123");
// поиск с помощью test-id        driver.findElement(By.cssSelector("[data-test-id = 'name'] input")).sendKeys("name");
//        List<WebElement> textFields = driver.findElements(By.className("class__name"));
//        textFields.get(0).sendKeys("Dima");
//        textFields.get(1).sendKeys("phonne");
        driver.findElement(By.className("classname_checkbox")).click());
        driver.findElement(By.tagName("button")).click();
        String actText = driver.findElement(By.className("alert-success")).getText().trim();//;
        String expText = "vashauspeshno";
        assertEquals(expText, actText);
        driver.close();
        driver.quit();
    }
}
