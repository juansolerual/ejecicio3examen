package ual.hmis.ejercicio3examen;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class Ejercicio3Test {

	@ParameterizedTest 
	@CsvSource({"0,'error'","1,'lunes'","2,'martes'","3,'miercoles'","4,'jueves'","5,'viernes'","6,'sabado'","7,'domingo'","8,'error'"})
	void testDiaSemana(int diaSemana, String diaEsperado) {
		Ejercicio3 e = new Ejercicio3();
		assertTrue(Integer.class.isInstance(diaSemana));
		assertTrue(String.class.isInstance(diaEsperado));

		assertEquals(diaEsperado, e.diaSemana(diaSemana));
	}

}