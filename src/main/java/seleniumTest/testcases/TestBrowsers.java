package seleniumTest.testcases;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBrowsers {
    public static void main(String[] args) {
//        FF section
        System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("http://way2automation.com");
        firefoxDriver.close();

//        Chrome section
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://way2automation.com");
        chromeDriver.close();

//        IE section
//        DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
        DesiredCapabilities capabilities = new DesiredCapabilities("InternetExplorer", "21H2", Platform.valueOf("Windows10"));
        capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
        capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
        System.setProperty("webdriver.ie.driver", "C:\\Selenium\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
        InternetExplorerDriver internetExplorerDriver = new InternetExplorerDriver();
        internetExplorerDriver.get("http://way2automation.com");
        internetExplorerDriver.close();

//        Edge section
        System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("http://way2automation.com");
        edgeDriver.close();
    }
}
