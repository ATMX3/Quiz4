import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class FormsPage {
    SelenideElement forms = $(By.xpath("//div[@class='card-body']/h5[text()='Forms']"));
    SelenideElement practiceForm = $(By.xpath("//span[@class='text'][text()='Practice Form']"));

    public void formsClick(){
        forms.scrollTo();
        forms.click();
    }

    public void practiceFormClick(){
        practiceForm.click();
    }
}