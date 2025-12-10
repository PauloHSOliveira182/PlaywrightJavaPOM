package pages;

import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CreateAccountPage {
    private final Page createAccountPage;
    private static final String FIRST_NAME = "input#firstName";
    private static final String LAST_NAME = "input#lastName";
    private static final String EMAIL = "input#email";
    private static final String PASSWORD = "input#fld-p1";
    private static final String CONFIRM_PASS = "input#reenterPassword";
    private static final String VALIDATION_MESSAGE = "span.c-input-error-message.cdi-input-success-message";
    private static final String PHONE = "input#phone";
    private static final String RECOVERY_CHECKBOX = "input#is-recovery-phone";
    //private static final String SUBMIT = "div.cia-form__controls button[type='submit']";


    public CreateAccountPage(Page page) {
        this.createAccountPage = page;
    }

    public void createAccount() {
        createAccountPage.locator(FIRST_NAME).fill("Paulo");
        createAccountPage.locator(LAST_NAME).fill("Oliveira");
        createAccountPage.locator(EMAIL).fill("teste@teste.com.br");
        createAccountPage.locator(PASSWORD).fill("teste@151630");
        createAccountPage.locator(CONFIRM_PASS).fill("teste@151630");

        assertThat(createAccountPage.locator(VALIDATION_MESSAGE))
                .hasText("Your passwords match!");
        createAccountPage.locator(PHONE).fill("1195037173");
        createAccountPage.locator(RECOVERY_CHECKBOX).check();
        assertThat(createAccountPage.locator(RECOVERY_CHECKBOX)).isChecked();
        // createAccountPage.locator(SUBMIT).click();




    }
}
