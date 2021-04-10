import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterMethod
import org.testng.annotations.BeforeMethod

import org.testng.Assert.*
import org.testng.annotations.Test

class LoginPageTest {


    private lateinit var driver: WebDriver
    private lateinit var loginPage: LoginPage
    private lateinit var mainPage: MainPage

    @BeforeMethod
    fun setUp() {
        driver = ChromeDriver()
        loginPage = LoginPage(driver)
        loginPage.open()
    }

    @Test
    fun testlogin() {
        loginPage.loginAsGuest()
        mainPage = MainPage(driver)
        mainPage.openOpenSourceProjects()
        mainPage.goToLogin()
    }

    @AfterMethod
    fun tearDown() {
        driver.quit()
    }
}