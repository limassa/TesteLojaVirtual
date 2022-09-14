package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import java.awt.peer.LabelPeer;

import org.junit.rules.TestRule;
import org.junit.validator.PublicClassValidator;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.jv.Nalika;
import cucumber.runtime.Utils;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.Home;
import static utils.Utils.*;

public class HomeSteps {
	
	Home lp = new Home();
	
	
	@Quando("clicar no botao OK")
	public void acionarBotaoOkCookies() {
		Na(Home.class).acionarBotaoOkCookies();
	}
	
	@And("clicar no Menu Vagas")
	public void acionarMenuVagas() {
		Na(Home.class).acionarMenuVagas();
	}
	
	@And("digite a empresa {string}")
	public void informarEmpresaVaga(String empresaVaga) {
		Na(Home.class).digitarCampoEmpresa(empresaVaga);
	}
	
	@And("clicar no botao Buscar")
	public void acionarBotaoVagaEmpresa() {
		Na(Home.class).acionarBotaoVagaEmpresa();
		
	}
	
	@And("clicar no botao Ver Vaga")
	public void acionarBotaoVerVaga() {
		Na(Home.class).acionarBotaoVerVaga();
	}
	
	@And("clicar no botao Tenho Interesse")
	public void acionarBotaoTenhoInteresse() {
		Na(Home.class).acionarBotaoTenhoInteresse();
	}
	
	
	/*
	@And("informar o email {string}")
	public void informarEmail(String email) {
		Na(Home.class).informarCampoEmail(email);
	}
	
	@And("clicar no botao Criar Login")
	public void clicarBotaoCriarLogin() {
		Na(Home.class).acionarBotaoCriarLogin();
	}
	
	@And("selecionar a opcao Title")
	public void selecionarOpcaoTitle() {
		Na(Home.class).clicarRBMr();
	}
	
	@And("informar o First Name {string}")
	public void informarFirstName(String firstName) {
		Na(Home.class).informarPrimeiroNome(firstName);
	}
	
	@And("informar o Last Name {string}")
	public void informarLastName(String lastName) {
		Na(Home.class).informarSegundoNome(lastName);
	}
	
	@And("informar o Password {string}")
	public void informarSenha(String senha) {
		Na(Home.class).informarSenha(senha);
	}
	
	@And("clicar no combo Dia")
	public void selecionarOpcao() {
		Na(Home.class).selecionarDia();
	}
	
	@And("selecionar o Dia {int}")
	public void mudarData(Integer dia) {
		Na(Home.class).selecionarOpcaoDia(dia);
	}
	
	@And("clicar no combo Mes")
	public void selecionarComboMes() {
		Na(Home.class).selecionarMes();
	}
	
	@And("selecionar o Mes {string}")
	public void mudarMes(String mes) {
		Na(Home.class).selecionarOpcaoMes(mes);
	}
	
	@And("selecionar o ano {int}")
	public void mudarAno(Integer ano) {
		Na(Home.class).selecionarOpcaoAno(ano);
	}
	
	@And("informar a Company {string}")
	public void informarCompany(String company) {
		Na(Home.class).informarCompany(company);
	}
	
	@And("informar o Address {string}")
	public void informarAddress(String address) {
		Na(Home.class).informarAddress(address);
	}
	
	@And("informar o Address2 {string}")
	public void informarAddress2(String address2) {
		Na(Home.class).informarAddress2(address2);
	}
	
	@And("informar City {string}")
	public void informarCity(String city) {
		Na(Home.class).informarCity(city);
	}
	
	@And("selecionar o State {string}")
	public void mudarState(String state) {
		Na(Home.class).selecionarOpcaoState(state);
	}
	
	@And("informar o Postal Code {string}")
	public void informarPostalCode(String postalCode) {
		Na(Home.class).informarPostalCode(postalCode);
	}
	
	@And("informar Mobile Phone {string}")
	public void informarMobilePhone(String mobilePhone) {
		Na(Home.class).informarMobilePhone(mobilePhone);
	}
	
	@And("clicar no botao Registrar")
	public void clicarBotaoRegistrar() {
		Na(Home.class).acionarBotaoRegistrar();
	}
	*/
}
