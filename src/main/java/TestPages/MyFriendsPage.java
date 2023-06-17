package TestPages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
public class MyFriendsPage extends AbstractPage {
    @FindBy(xpath = "//span[@lj-ml=\"friendsfeed.link.reply\"]")
    private WebElement comment;
    @FindBy(xpath = "//*[@id=\"body6849\"]")
    private WebElement textArea;

    public MyFriendsPage(WebDriver driver) {
        super(driver);
    }

    public MyFriendsPage makeAComment(){
        Actions moveToElement = new Actions(getDriver());
        moveToElement.moveToElement(comment).moveToElement(textArea).click(textArea).sendKeys("test3").sendKeys(Keys.ENTER).build().perform();
        return this;
    }
}
