package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ReusableMethods;

public class ProductPage {

    @FindBy(xpath = "//input[@type='text']")
    private WebElement searchBox;

    @FindBy(xpath = "//input[@aria-label='128 GB']")
    private WebElement storageCapacity;

    @FindBy(xpath = "//h3[text()='Color']")
    private WebElement color;

    @FindBy(xpath = "//input[@aria-label='Black']")
    private WebElement black;

    @FindBy(css = "input[aria-label='Minimum Value in $']")
    private WebElement minValue;

    @FindBy(css = "input[aria-label='Maximum Value in $']")
    private WebElement maxValue;

    @FindBy(xpath = "(//div/button)[7]")
    private WebElement okButtonMinMax;

    @FindBy(name = "_sadis")
    private WebElement radius;

    @FindBy(xpath = "(//div/button)[8]")
    private WebElement okButtonRadius;

    @FindBy(css = "button[class='s-item__watchheart-click']")
    private WebElement heart;

    @FindBy(linkText = "Watchlist")
    private WebElement linkWatchList;

    @FindBy(linkText = "View all items you are watching")
    private WebElement linkgotoWatchList;

    @FindBy(xpath = "//span[.='All Categories (1)']")
    private WebElement allCategories;

    public void searchBoxSendKey(String brand) {
        searchBox.sendKeys(brand + Keys.ENTER);
    }

    public void storageCapacityClick() {
        ReusableMethods.scrollIntoViewJS(storageCapacity);
        storageCapacity.click();
    }

    public void colorAndClick() {
        ReusableMethods.scrollIntoViewJS(color);
        color.click();
        black.click();
    }
    public void minAndMaxSendKeysAndButtonClick(){
        ReusableMethods.scrollIntoViewJS(minValue);
        minValue.sendKeys("10");
        maxValue.sendKeys("2000");
        okButtonMinMax.click();
    }

    public void selectRadiusMil(){
        ReusableMethods.scrollIntoViewJS(radius);
        ReusableMethods.selectByValue(radius,"1000");
        okButtonRadius.click();
    }


    public void heartClick(){
        ReusableMethods.scrollIntoViewJS(heart);
        heart.click();
    }


    public void watchListClick(){
        ReusableMethods.scrollIntoViewJS(linkWatchList);
       linkgotoWatchList.click();
       ReusableMethods.hover(linkgotoWatchList);
       linkgotoWatchList.click();
    }

    public void verifyAllCategories(){
        Assert.assertTrue(allCategories.isDisplayed());
    }
}
