package test.java.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;

public class LoginSteps {
    @Dado("the user is on the login screen")
    public void userIsOnLoginScreen() {
        // Implement the navigation to the login screen here
    }

    @Quando("the user fills in the {string} field with {string}")
    public void fillFieldWith(String field, String value) {
        // Implement filling the specified field with the given value
    }

    @Quando("the user clicks the {string} button")
    public void clickButton(String button) {
        // Implement clicking the specified button
    }

    @Então("the system should redirect to the menu screen")
    public void systemRedirectsToMenuScreen() {
        // Implement verification for redirection to the menu screen
    }

    @Então("the system should display an error message")
    public void systemDisplaysErrorMessage() {
        // Implement verification for displaying an error message
    }
}
