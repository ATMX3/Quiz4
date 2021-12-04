import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;

public class PagesTest
{
    @BeforeTest
    public void setUp(){
        open("https://demoqa.com/");
    }

    @Test
    public void testPage(){
        PracticePage practicePage = new PracticePage();
        FormsPage formsPage = new FormsPage();
        SubmittingPage submittingPage = new SubmittingPage();
        formsPage.formsClick();
        formsPage.practiceFormClick();
        practicePage.enterFirstName("Tornike");
        practicePage.enterLastName("Abuashvili");
        practicePage.clickGender("Male");
        practicePage.enterMobileNumber("0123456789");
        practicePage.clickSubmit();
        submittingPage.thanksForSubmitTextVisible();
        submittingPage.checkName(practicePage.actual_firstName,practicePage.actual_lastName);
        submittingPage.checkGender(practicePage.actual_gender);
        submittingPage.checkNumber(practicePage.actual_mobileNumber);

    }
}