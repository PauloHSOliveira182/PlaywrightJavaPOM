import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.AccountNavigationPage;
import pages.CreateAccountPage;
import pages.HomePage;


import java.util.ArrayList;
import java.util.Arrays;


public class  PlaywrightRunner  {
    protected Page page;
    protected Browser browser;
    protected BrowserContext browserContext;
    protected static Playwright playwright;
    protected CreateAccountPage createAccountPage;
    protected HomePage homePage;
    protected AccountNavigationPage accountNavigationPage;

        @BeforeAll
    public static void init(){
        playwright = Playwright.create();
    }

    @BeforeEach
    public void setUp() {

        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        browserContext = browser.newContext(new Browser.NewContextOptions().setPermissions(Arrays.asList("geolocation")));
        page = browser.newPage();
        createAccountPage = new CreateAccountPage(page);
        homePage = new HomePage(page);
        accountNavigationPage = new AccountNavigationPage(page);
    }
    @AfterEach
    public void closePages() {
        browserContext.close();
        browser.close();

    }


}
