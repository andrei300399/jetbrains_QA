import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory

class MainPage(private val driver: WebDriver) {

    @FindBy(css = ".projectName a")
    private lateinit var projectsButton: WebElement

    @FindBy(css = ".Header__login--25")
    private lateinit var loginButton: WebElement

    init {
        PageFactory.initElements(AjaxElementLocatorFactory(driver, 15), this)
    }

    fun openOpenSourceProjects() {
        projectsButton.click()
    }

    fun goToLogin() {
        loginButton.click()
    }


}