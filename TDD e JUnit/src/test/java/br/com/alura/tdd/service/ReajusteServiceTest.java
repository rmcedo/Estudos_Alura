package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	private ReajusteService service;
	private Funcionario func;

	
	
	@BeforeEach
	public void inicializar() {

		this.service = new ReajusteService();
		this.func = new Funcionario("Rafael", LocalDate.now(), new BigDecimal("1000.00"));
	}

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		
		service.concederReajuste(func, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("1030.00"), func.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDeQuinzePorcentoQuandoDesempenhoForBom() {

		service.concederReajuste(func, Desempenho.BOM);
		assertEquals(new BigDecimal("1150.00"), func.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDeVintePorcentoQuandoDesempenhoForOtimo() {

		service.concederReajuste(func, Desempenho.OTIMO);
		assertEquals(new BigDecimal("1200.00"), func.getSalario());
	}

}
