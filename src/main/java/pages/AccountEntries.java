package pages;

public enum AccountEntries {

    CREATE_ACCOUNT("Create Account"),
    SIGN_IN("Sign In"),
    ACCOUNT("Account"),
    PURCHASES("Purchases");

    private String displayName;

    AccountEntries(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
