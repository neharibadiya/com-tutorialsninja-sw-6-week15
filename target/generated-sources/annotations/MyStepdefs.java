import com.tutorialsninja.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyStepdefs {
    @Given("I am on Home page")
    public void iAmOnHomePage() {
    }

    @When("Mouse hover on “Desktops” Tab and click")
    public void mouseHoverOnDesktopsTabAndClick() {
        new HomePage().clickOnDesktopLink();
    }

    @And("call selectMenu method and pass the menu = Show All Desktops")
    public void callSelectMenuMethodAndPassTheMenuShowAllDesktops() {
        new HomePage().selectMenu("Show All Desktops");
    }

    @Then("Verify the text ‘Desktops’")
    public void verifyTheTextDesktops() {
        Assert.assertEquals(new HomePage().getVerifyText(), "Desktops", "Error Message not displayed");
    }

    @When("Mouse hover on “Laptops & Notebooks” Tab and click")
    public void mouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().clickOnLaptopNotebooksLink();
    }

    @And("call selectMenu method and pass the menu = Show All Laptops & Notebooks")
    public void callSelectMenuMethodAndPassTheMenuShowAllLaptopsNotebooks() {
        new HomePage().selectMenu("Show All Laptops & Notebooks");
    }

    @Then("Verify the text ‘Laptops & Notebooks’")
    public void verifyTheTextLaptopsNotebooks() {
        Assert.assertEquals(new HomePage().getVerifyText1(), "Laptops & Notebooks", "Error Message not displayed");
    }

    @When("Mouse hover on “Components” Tab and click")
    public void mouseHoverOnComponentsTabAndClick() {
            new HomePage().clickOnComponentsLink();
    }

    @And("call selectMenu method and pass the menu = Show All Components")
    public void callSelectMenuMethodAndPassTheMenuShowAllComponents() {
        new HomePage().selectMenu("Show All Component");
    }

    @Then("Verify the text ‘Components’")
    public void verifyTheTextComponents() {
        Assert.assertEquals(new HomePage().getVerifyText2(), "Components", "Error Message not displayed");
    }
}
