package Pages;

import Common.actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;



public class homePage extends actions {
    private WebDriver driver;
    public homePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20),this);

    }

    @FindBy(xpath="//div[@class='app_logo']")
    static WebElement titlelabel;

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    static WebElement addCartBtn;



}
