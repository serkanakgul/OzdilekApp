package org.example;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class StepImplementation extends BaseTest{

    @Step("Alisverise basla butonuna tıklanır")
    public void alisveriseBasla() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        MobileElement el1=appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/tv_startShoppingStore"));
        el1.click();

    }
    @Step("Kadın secenegine tiklanir")
    public void kadinaTikla() throws InterruptedException{
        TimeUnit.SECONDS.sleep(3);
        MobileElement el3=appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]"));
        el3.click();
    }
    @Step("Pantolona tikla")
    public void pantolonaTikla() throws InterruptedException{
        TimeUnit.SECONDS.sleep(3);
        MobileElement el4=appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView"));
        el4.click();
    }
    @Step("sayfa boyunca scroll et")
    public void scroll() throws InterruptedException {
        Dimension dimension = appiumDriver.manage().window().getSize();
        int start_x = (int) (dimension.width * 0.5);
        int start_y = (int) (dimension.height * 0.8);

        int end_x = (int) (dimension.width * 0.2);
        int end_y = (int) (dimension.height * 0.2);

        TouchAction touch = new TouchAction(appiumDriver);
        touch.press(PointOption.point(start_x, start_y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(end_x, end_y)).release().perform();
        //TimeUnit.SECONDS.sleep(3);
    }
    @Step("<Key> xpath'te bulunan sayfada görünen tüm ürünleri bul ve rastgele bir ürüne tıkla")
    public void findAllProducts(String Key){
        List<MobileElement> productList = appiumDriver.findElementsByXPath(Key);
        int size = productList.size();
        Random rnd = new Random();
        int randNum = rnd.nextInt(size);
        productList.get(randNum).click();

    }

    @Step("<Key> saniye bekle")
    public void bekle(int second){
        try {
            TimeUnit.SECONDS.sleep(second);
        }catch (InterruptedException e){
            System.out.println( e.getMessage());
        }
    }

    @Step("<Key> İd'li elemente tıkla")
    public void clickElementByid(String Key) {
        appiumDriver.findElement(By.id(Key)).click();
        System.out.println(Key + "Elementine tıklandı");
    }
    @Step("<Key> İd'li elemente <keyword> değerini yaz")
    public void SendkeyElementByid(String Key, String keyword) {
        appiumDriver.findElement(By.id(Key)).sendKeys(keyword);
        //sendKeys(By.id(Key),keyword);
        System.out.println(Key + "Elementine tıklandı");
    }

    @Step("<Key> Xpath'li elemente tıkla")
    public void clickElementByXPath(String Key) {
        appiumDriver.findElement(By.id(Key)).click();
        System.out.println(Key + "Elementine tıklandı");
    }

}