import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory

class LoginPage(private val driver: WebDriver) {

    @FindBy(css = "a.auth-button-federated")
    private lateinit var guestButton: WebElement

    @FindBy(css = "\".header__logo\"")
    private lateinit var logo: WebElement

    init {
        PageFactory.initElements(AjaxElementLocatorFactory(driver, 15), this)
    }

    fun open() {

        driver.get("https://teamcity.jetbrains.com/")
    }



    fun loginAsGuest(){
        guestButton.click()
    }

}