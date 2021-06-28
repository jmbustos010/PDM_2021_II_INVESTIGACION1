package hn.edu.ujcv.pdm_2021_ii_investigacion1

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class OperacionesTest {

    var operacion = Operaciones()

    @Test
    fun operacionNotNull(){
        assertNotNull(operacion)
    }

    @Test
    fun calcularSubTotal() {
        assertEquals("200",operacion.CalcularSubTotal("2", "100"))
    }

    @Test
    fun calcularTotal() {
        assertEquals("230.0", operacion.CalcularTotal("200","15"))
    }
}