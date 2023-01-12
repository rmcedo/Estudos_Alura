package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {

		BonusService service = new BonusService();
		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Rafael", LocalDate.now(), new BigDecimal("25000"))));
		
		
		/*//TRY-CATCH é útil quando precisamos checar se a mensagem de erro é realmente aquela que esperavamos
		try {
			service.calcularBonus(new Funcionario("Rafael", LocalDate.now(), new BigDecimal("25000")));
			fail("Não deu a exception!");
		} catch (Exception e) {
			assertEquals("Funcionario com salario maior que R$10000 não pode receber bonus", e.getMessage());
		}*/
	}

	@Test
	void bonusDeveriaSer10PorCentoDoSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rafael", LocalDate.now(), new BigDecimal("2500")));

		assertEquals(new BigDecimal("250.00"), bonus);
	}

	@Test
	void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Rafael", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.00"), bonus);
	}

}
