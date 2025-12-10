package pages;

import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class HomePage {
    private final Page homePage;
    private static final String SIGN_IN = "div.flyout-button-wrapper button[data-lid='hdr_signin']";

    public HomePage(Page page) {
        this.homePage = page;
    }
    public void navigateToSig() {

        homePage.locator(SIGN_IN).click();




    }
}
