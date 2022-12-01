package Xpath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.LibGlobal;

public class LandingPage extends LibGlobal {
	    
	    public LandingPage() {
	    
	        
	    PageFactory.initElements(driver, this);
	    }

	    @FindBy(id = "TWMobile")
	    private WebElement  mobileNo;
	    
	    @FindBy(id = "g-otp")
	    private WebElement getOtp;
	    
	    @FindBy(id = "codeBox1")
	    private WebElement otp1;
	    
	    @FindBy(id = "codeBox2")
	    private WebElement otp2;
	    
	    @FindBy(id = "codeBox3")
	    private WebElement otp3;
	    
	    @FindBy(id = "codeBox4")
	    private WebElement otp4;
	    
	    @FindBy(id = "codeBox5")
	    private WebElement otp5;
	    
	    @FindBy(id = "codeBox6")
	    private WebElement otp6;
	    
	    @FindBy(xpath = "//a[text()='Submit']")
	    private WebElement otpSubmit;
	    
	    @FindBy(id= "TWPincode")
	    private WebElement pincode;
	    
	    @FindBy(xpath = "//li[@class='pin_code']")
	    private WebElement pcodeclick;
	    
	    @FindBy(xpath = "//input[@id='TWPanNumber']")
	    private WebElement panNo;
	    
	    @FindBy(id = "TWFatherName")
	    private WebElement fathersName;
	    
	    @FindBy(id = "TWEmailId")
	    private WebElement emailId;
	    
	    @FindBy(className = "float-select")
	    private WebElement residenceType;
	    
	    @FindBy(id = "TWDurMonth")
	    private WebElement  twMonth;
	    
	    @FindBy(id = "TWEmpType")
	    private WebElement emptype;
	    
	    @FindBy(id = "TWMonthSalary")
	    private WebElement monthSalary;
	    
	    @FindBy(id = "TWManFac")
	    private WebElement manufacturer;
	    
	    @FindBy(name = "model_name")
	    private WebElement twModel;
	    
	    @FindBy(id = "eClick")
	    private WebElement editClick;
	    
	    @FindBy(id = "cValue")
	    private WebElement loanAmt;
	    
	    @FindBy(xpath = "//a[text()='Submit']")
	    private WebElement  submit;
	    
	    @FindBy(id = "TWCustomerName")
	    private WebElement CustomerName;
	    
	    @FindBy(id = "TWGdr")
	    private WebElement Gender;
	    
	    @FindBy(id = "datepicker")
	    private WebElement Date;
	    
	  
	    @FindBy(xpath = "//select[@class=\"ui-datepicker-year\"]")
	    private WebElement Year;

	    @FindBy(xpath = "//select[@data-handler=\"selectMonth\"]")
	    private WebElement Month;
	  
	    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[6]/a")
	    private WebElement Date15;
	    
	    public WebElement getDate15() {
			return Date15;
		}

		public WebElement getYear() {
			return Year;
		}

		public WebElement getMonth() {
			return Month;
		}

		public WebElement getDate() {
			return Date;
		}

		public WebElement getCustomerName() {
			return CustomerName;
		}

		public WebElement getGender() {
			return Gender;
		}

		public WebElement getMobileNo() {
	        return mobileNo;
	    }

	    public WebElement getGetOtp() {
	        return getOtp;
	    }

	    public WebElement getOtp1() {
	        return otp1;
	    }

	    public WebElement getOtp2() {
	        return otp2;
	    }

	    public WebElement getOtp3() {
	        return otp3;
	    }

	    public WebElement getOtp4() {
	        return otp4;
	    }

	    public WebElement getOtp5() {
	        return otp5;
	    }

	    public WebElement getOtp6() {
	        return otp6;
	    }

	    public WebElement getOtpSubmit() {
	        return otpSubmit;
	    }

	    public WebElement getPincode() {
	        return pincode;
	    }
	    
	    public WebElement getPcodeclick() {
	        return pcodeclick;
	    }

	    public WebElement getPanNo() {
	        return panNo;
	    }

	    public WebElement getFathersName() {
	        return fathersName;
	    }

	    public WebElement getEmailId() {
	        return emailId;
	    }

	    public WebElement getResidenceType() {
	        return residenceType;
	    }

	    public WebElement getTwMonth() {
	        return twMonth;
	    }

	    public WebElement getEmptype() {
	        return emptype;
	    }

	    public WebElement getMonthSalary() {
	        return monthSalary;
	    }

	    public WebElement getManufacturer() {
	        return manufacturer;
	    }

	    public WebElement getTwModel() {
	        return twModel;
	    }

	    public WebElement getEditClick() {
	        return editClick;
	    }

	    public WebElement getLoanAmt() {
	        return loanAmt;
	    }

	    public WebElement getSubmit() {
	        return submit;
	    }

		
		}
	    

	

