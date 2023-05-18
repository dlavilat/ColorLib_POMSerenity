package com.tallerconpatron.certificacion.colorlib.definition;

import com.tallerconpatron.certificacion.colorlib.common.BasePage;
import com.tallerconpatron.certificacion.colorlib.step.TaskAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition extends BasePage {

    private String user;
    private String password;

    @Steps
    TaskAction taskAction;

    @Given("I enter with my credentials")
    public void iEnterWithMyCredentials(io.cucumber.datatable.DataTable dataTable) {
        this.user = dataTable.cell(1,0);
        this.password = dataTable.cell(1,1);
    }

    @When("I proceed with the authentication")
    public void iProceedWithTheAuthentication() {
        try{
            taskAction.openApp();
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
}
