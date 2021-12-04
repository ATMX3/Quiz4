import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SubmittingPage{
    SelenideElement thanksForSubmitText = $("#example-modal-sizes-title-lg");
    SelenideElement studentName = $(By.xpath("//div[@class='table-responsive']/table/tbody/tr[1]/td[2]"));
    SelenideElement studentGender = $(By.xpath("//div[@class='table-responsive']/table/tbody/tr[3]/td[2]"));
    SelenideElement studentNumber = $(By.xpath("//div[@class='table-responsive']/table/tbody/tr[4]/td[2]"));
    public void thanksForSubmitTextVisible(){
        thanksForSubmitText.shouldBe(visible);
    }

    public String getName(){
        return studentName.getText();
    }
    public String getGender(){
        return studentGender.getText();
    }
    public String getNumber(){
        return studentNumber.getText();
    }
    public void checkName(String actual_firstName, String actual_lastName  ){
        Assert.assertEquals(actual_firstName + " " + actual_lastName, getName());

    }
    public void checkGender(String actual_gender ){
        Assert.assertEquals(actual_gender, getGender());

    }
    public void checkNumber(String actual_mobileNumber ){
        Assert.assertEquals(actual_mobileNumber, getNumber());
    }


}