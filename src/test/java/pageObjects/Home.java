package pageObjects;

import static utils.Utils.*;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.google.common.base.Converter;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import io.cucumber.java.pt.Quando;
import net.bytebuddy.asm.Advice.This;	
	
public class Home {
	
		
	//@FindBy(id = "//*[@id=\"switch-version-select\"]/option[4]")
	//private WebElement opcaoCombo;
		 
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement botaoLogin;
	
	@FindBy(id = "email_create")
	private WebElement campoEmail;
	
	@FindBy(id = "SubmitCreate")
	private WebElement botaoCriarLogin;
	
	@FindBy(id = "id_gender1")
	private WebElement radioBMr;
	
	@FindBy(id = "customer_firstname")
	private WebElement campoFirstName;
	
	@FindBy(id = "customer_lastname")
	private WebElement campoLastName;
	
	@FindBy(id = "passwd")
	private WebElement campoSenha;
	
	@FindBy(id = "days")
	private WebElement comboDias;
	
	@FindBy(id = "months")
	private WebElement comboMes;
	
	@FindBy(id = "uniform-years")
	private WebElement comboAno;
	
	@FindBy(id = "company")
	private WebElement campoCompany;
	
	@FindBy(id = "address1")
	private WebElement campoAddress1;
	
	@FindBy(id = "address2")
	private WebElement campoAddress2;
	
	@FindBy(id = "city")
	private WebElement campoCity;
	
	@FindBy(id = "phone_mobile")
	private WebElement campoMobilePhone;
	
	@FindBy(id = "submitAccount")
	private WebElement botaoRegistrar;
	
	@FindBy(id = "postcode")
	private WebElement campoPostalCode;
	
   public void acionarBotaoLogin() {
	   botaoLogin.click();				
   }
   
   public void informarCampoEmail(String email) {
	   campoEmail.sendKeys(email);
   }
   
   public void acionarBotaoCriarLogin() {
	   botaoCriarLogin.click();
   }
   
   public void clicarRBMr() {
	   radioBMr.click();
   }

   public void informarPrimeiroNome(String firstName) {
	   campoFirstName.sendKeys(firstName);
   }
   
   public void informarSegundoNome(String lastName) {
	   campoLastName.sendKeys(lastName);
   }
   
   public void informarSenha(String senha) {
	   campoSenha.sendKeys(senha);
   }
   
   public void selecionarDia() {
		comboDias.click();
	}
	
	public void selecionarOpcaoDia(Integer dia) {
		//opcaoCombo.click();
		Select dropDownElement = new Select(driver.findElement(By.id("days")));
	     dropDownElement.selectByValue(dia.toString());
	}
   
	public void selecionarMes() {
		comboMes.click();
	}
  
	public void selecionarOpcaoMes(String mes) {
		//opcaoCombo.click();
		Select dropDownElement = new Select(driver.findElement(By.id("months")));
	     dropDownElement.selectByValue(mes);
	}
	
	public void selecionarAno() {
		comboAno.click();
	}
  
	public void selecionarOpcaoAno(Integer ano) {
		//opcaoCombo.click();
		Select dropDownElement = new Select(driver.findElement(By.id("years")));
	     dropDownElement.selectByValue(ano.toString());
	}

	public void informarCompany(String company) {
		campoCompany.sendKeys(company);
	}
	
	public void informarAddress(String address1) {
		campoAddress1.sendKeys(address1);
	}
	
	public void informarAddress2(String address2) {
		campoAddress2.sendKeys(address2);
	}
	
	public void informarCity(String city) {
		campoCity.sendKeys(city);
	}
	
	public void selecionarOpcaoState(String state) {
		//opcaoCombo.click();
		Select dropDownElement = new Select(driver.findElement(By.id("id_state")));
	     dropDownElement.selectByValue(state);
	}
	
	public void informarPostalCode(String postalCode) {
		campoPostalCode.sendKeys(postalCode);
	}
	
	public void informarMobilePhone(String mobilePhone) {
		campoMobilePhone.sendKeys(mobilePhone);
	}
	
	public void acionarBotaoRegistrar() {
		botaoRegistrar.click();
	}
	
   public void realizarLogin(String email, String firstName, String lastName, String senha, Integer dia, String mes, Integer ano, 
		   String company, String address1, String address2, String city, String state, String mobilePhone){
	   acionarBotaoLogin(); 
	   informarCampoEmail(email);
	   acionarBotaoCriarLogin();
	   clicarRBMr();
	   informarPrimeiroNome(firstName);
	   informarSegundoNome(lastName);
	   informarSenha(senha);
	   selecionarDia();
	   selecionarOpcaoDia(dia);
	   selecionarMes();
	   selecionarOpcaoMes(mes);
	   selecionarAno();
	   selecionarOpcaoAno(ano);
	   informarCompany(company);
	   informarAddress(address1);
	   informarAddress2(address2);
	   informarCity(city);
	   selecionarOpcaoState(state);
	   informarMobilePhone(mobilePhone);
	   acionarBotaoRegistrar();
   	}
		
		
		
	}
