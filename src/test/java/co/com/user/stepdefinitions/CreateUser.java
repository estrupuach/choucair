package co.com.user.stepdefinitions;

import co.com.user.model.CreateUserData;
import co.com.user.questions.Answer;
import co.com.user.task.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class CreateUser {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that Camilo wants automation the create new user in Utest$")
    public void thatCamiloWantsAutomationTheCreateNewUserInUtest(){
        OnStage.theActorCalled("Cristian").wasAbleTo(OpenUp.toUtestPage(), (Create.onThePage()));
    }


    @When("^he complete the form for create user$")
    public void heCompleteTheFormForCreateUser(List<CreateUserData> createUserData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(
                EnterDataF1.onTheForm(
                        createUserData.get(0).getStrFirsName(),
                        createUserData.get(0).getStrLastName(),
                        createUserData.get(0).getStrEmail()),
                EnterDataF2.onTheForm(
                        createUserData.get(0).getStrCity(),
                        createUserData.get(0).getStrPostalCode()),
                EnterDataF3.onTheForm(
                        createUserData.get(0).getStrMobile(),
                        createUserData.get(0).getStrModel(),
                        createUserData.get(0).getStrOperatingSystem()),
                EnterDataF4.onTheForm(
                        createUserData.get(0).getStrPassword(),
                        createUserData.get(0).getStrConfPassword())
        );

    }

    @Then("^he creates a new user in Utest$")
    public void heCreatesANewUserInUtest(List<CreateUserData> createUserData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(
                createUserData.get(0).getStrTitle()
        )));
    }
}
