package pages;

import com.microsoft.playwright.Page;

public class AccountNavigationPage {
    private final Page accountNavigationPage;
    private static final String ACCOUNT_LINK_TEMPLATE = "//div[@class=\"shop-account-signin-create\"]//a[text() = '%s']";

    public AccountNavigationPage(Page page) {
        this.accountNavigationPage = page;

    }
    public void sigInOption(AccountEntries accountEntries) {
        accountNavigationPage.locator(String.format(ACCOUNT_LINK_TEMPLATE,accountEntries.getDisplayName())).click();
    }
}
