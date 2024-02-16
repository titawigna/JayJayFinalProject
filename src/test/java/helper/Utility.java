package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


import java.io.File;
import java.time.Duration;

public class Utility {
    public static File getJSONSchemaFile(String jsonFileName) {
        return new File("src/test/java/helper/JSONSchemaData/" + jsonFileName);
    }

    public static String generateRandomEmail() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        String email = "";
        String temp = RandomStringUtils.randomAlphanumeric(10);
        email = temp.toLowerCase() + "@testdata.com";
        email.toLowerCase();
        return email;
    }

    public static WebDriver driver;

    public static void startDriver() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public static void quitDriver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    public static String generateRandomUsername() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_";
        String temp = RandomStringUtils.randomAlphanumeric(4);
        username = "username" + temp.toLowerCase();
        username.toLowerCase();
        return username;
    }

    public static String username, username100;
    public static void setterUsername(String x) {
        username = x;
    }
    public static String getterUsername() {
        return username;
    }


    public static String generateRandomUsername100() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_";
        String temp = RandomStringUtils.randomAlphanumeric(92);
        username = "username" + temp.toLowerCase();
        username.toLowerCase();
        return username;
    }
    public static void setterUsername100(String y) {
        username100 = y;
    }
    public static String getterUsername100() {
        return username100;
    }


}
