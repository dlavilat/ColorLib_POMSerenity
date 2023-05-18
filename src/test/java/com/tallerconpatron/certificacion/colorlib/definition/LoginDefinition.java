package com.tallerconpatron.certificacion.colorlib.definition;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.step.TaskAction;
import com.tallerconpatron.certificacion.colorlib.step.TaskNavigateMenu;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition extends BasePage {

    private String user;
    private String password;

    @Steps
    TaskAction taskAction;
    @Steps
    TaskNavigateMenu taskNavigateMenu;

    @Given("I enter with my credentials")
    public void iEnterWithMyCredentials(io.cucumber.datatable.DataTable dataTable) {
        this.user = dataTable.cell(1,0);
        this.password = dataTable.cell(1,1);
    }

    @When("I proceed with the authentication")
    public void iProceedWithTheAuthentication() {
        try{
            taskAction.openPage();
            taskAction.singIn(this.user,this.password);
        }catch (NullPointerException e){
            System.out.println("NullPointerException thrown!");
        }
    }

    @Then("go to the main view of the page")
    public void goToTheMainViewOfThePage() {
        try {
            taskAction.verifySingIn();
        }catch (NullPointerException e){
            System.out.println("NullPointerException thrown!");
        }
    }

    @And("enter submenu form validations")
    public void enterSubmenuFormValidations() {
        taskNavigateMenu.ingresarMenuForm();
        taskNavigateMenu.ingresarMenuFormValidation();
    }

    @And("Check the title of the form on the screen")
    public void checkTheTitleOfTheFormOnTheScreen() {
    }

    @And("fill out information")
    public void fillOutInformation() {
    }

    @And("clic button Validate")
    public void clicButtonValidate() {
    }

    @Then("all fields will be empty")
    public void allFieldsWillBeEmpty() {
    }
}
