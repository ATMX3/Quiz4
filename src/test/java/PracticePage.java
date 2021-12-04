import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PracticePage {

    SelenideElement firstName = $("#firstName");
    SelenideElement lastName = $("#lastName");
    SelenideElement gender_male = $("label[for='gender-radio-1']");
    SelenideElement gender_female = $("label[for='gender-radio-2']");
    SelenideElement gender_other = $("label[for='gender-radio-3']");
    SelenideElement mobileNumber = $("#userNumber");
    SelenideElement submit = $("#submit");
    String actual_firstName = "";
    String actual_lastName = "";
    String actual_gender  = "";
    String actual_mobileNumber = "";


    public void enterFirstName(String first_name){
        actual_firstName=first_name;
        firstName.sendKeys(first_name);


    }

    public void enterLastName(String last_name){
        actual_lastName=last_name;
        lastName.sendKeys(last_name);

    }
    public void clickGender(String gender){
        actual_gender=gender;
        if(gender.equals("Male")){
            gender_male.click();
        }
        if(gender.equals("Female")){
            gender_female.click();
        }
        if(gender.equals("Other")){
            gender_other.click();
        }

    }
    public void enterMobileNumber(String mobile_number){
        actual_mobileNumber=mobile_number;
        mobileNumber.sendKeys(mobile_number);

    }
    public void clickSubmit(){
        submit.scrollTo();
        submit.click();
    }





}