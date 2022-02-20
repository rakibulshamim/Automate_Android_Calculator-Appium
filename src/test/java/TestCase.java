import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCase extends BasePage {

    @FindBy(id = "com.google.android.calculator:id/digit_4")
    MobileElement btn4;
    @FindBy(id = "com.google.android.calculator:id/digit_6")
    MobileElement btn6;
    @FindBy(id = "com.google.android.calculator:id/op_add")
    MobileElement btnPlus;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    MobileElement btnMultiply;
    @FindBy(id = "com.google.android.calculator:id/op_sqrt")
    MobileElement btnSquareRoot;
    @FindBy(id = "com.google.android.calculator:id/result_preview")
    MobileElement btnPreview;
    @FindBy(id = "com.google.android.calculator:id/clr")
    MobileElement btnClear;

    public TestCase() throws IOException, InterruptedException
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @Test
    public void addition() {
        btn4.click();
        btnPlus.click();
        btn6.click();
        Assert.assertEquals(btnPreview.getText(), "10");
        btnClear.click();
    }

    @Test
    public void multiplication() {
        btn4.click();
        btnMultiply.click();
        btn6.click();
        Assert.assertEquals(btnPreview.getText(), "24");
        btnClear.click();
    }

    @Test
    public void squareRoot() {
        btnSquareRoot.click();
        btn6.click();
        btn4.click();
        Assert.assertEquals(btnPreview.getText(), "8");
    }

    @AfterTest
    public void TearDown(){
        driver.closeApp();
    }
}