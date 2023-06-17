package TestPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage{
    @FindBy(xpath = "//a[contains(@class, \"s-header-item__link--login\")]")
    private WebElement signIn;
    @FindBy(xpath = "//span[@class=\"s-header-item-post--long\"]")
    private WebElement writeToBlog;
    @FindBy(xpath = "//span[contains(@class, \"s-nav-item__name\")]")
    private WebElement acconnt;
    @FindBy(xpath = "//a[contains(@class,\"s-header-item__link--friends\")]")
    private WebElement friendsButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage clicksignIn() {
        signIn.click();
        return this;
    }

    public MainPage clickwriteToBlog() {
        writeToBlog.click();
        return this;
    }

    public MainPage clickaccount() {
        acconnt.click();
        return this;
    }
    public MainPage clickFriendsButton() {
        friendsButton.click();
        return this;
    }
}
