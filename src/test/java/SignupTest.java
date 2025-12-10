import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.LocatorAssertions;
import org.junit.jupiter.api.Test;
import pages.AccountEntries;


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class SignupTest extends PlaywrightRunner {
    @Test
    public void signupTest() {

        page.setDefaultTimeout(20000);
        page.navigate( "https://www.bestbuy.com/home?intl=nosplash");
        homePage.navigateToSig();
        accountNavigationPage.sigInOption(AccountEntries.SIGN_IN);
        createAccountPage.createAccount();


    }

}
