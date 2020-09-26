package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.SimuladorInvestimentoPoupançaPage;
import testcases.BaseTest;

public class PreencherFormularioTests extends BaseTest{

	
	@Test
	public void preencherCamposCorretamenteParaVerResultados() {
		SimuladorInvestimentoPoupançaPage simuladorPage = new SimuladorInvestimentoPoupançaPage(null);
		
		simuladorPage.setValorAplicar();
		simuladorPage.setValorPoupar();
		simuladorPage.setTempoPoupar();
		simuladorPage.clickBtnSimulador();
		
		assertEquals(simuladorPage.getBloqueResultadoSimulador(), 
				"você terá guardado", "text incorrect");
	
	}
}
