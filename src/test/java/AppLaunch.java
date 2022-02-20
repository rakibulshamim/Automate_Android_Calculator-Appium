import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class AppLaunch {
    public static AndroidDriver driver;
    public static AppLaunch instance;

    public AppLaunch() throws MalformedURLException, InterruptedException {
        setUp();
    }

    public static AppLaunch getInstance() throws IOException, InterruptedException {
        if (instance == null) {
            instance = new AppLaunch();
        }
        return instance;
    }

    public void setUp() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Device");
        cap.setCapability("platformName", "Android");
        cap.setCapability("uuid", "14cade879904");
        cap.setCapability("appPackage", "com.google.android.calculator");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");
        cap.setCapability("autoGrantPermissions", true);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, cap);
        Thread.sleep(1000);
    }
}
