package PagesTask2;

import io.netty.handler.codec.http.multipart.FileUpload;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ScreenShot6 {
    private WebDriver driver;

    public ScreenShot6(WebDriver driver) {
        this.driver = driver;
    }

    //public static void TakeScreenshot(String OrderScreenshot) throws IOException {
       //File File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // FileUtils.copyFile(File, new File("C:\\CodersLab_Kinga\WorkshopTasks"));
   // }
}