package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestJunitTicketMachine {

    @Test
    public void TesteClasseTrocoValorNotas() 
    {
        Troco ticketTroco = new Troco(189);
        
        assertEquals(100,ticketTroco.papeisMoeda[5].getValor());     
        assertEquals(50,ticketTroco.papeisMoeda[4].getValor());       
        assertEquals(20,ticketTroco.papeisMoeda[3].getValor());
        assertEquals(10,ticketTroco.papeisMoeda[2].getValor());
        assertEquals(5,ticketTroco.papeisMoeda[1].getValor());   
        assertEquals(2,ticketTroco.papeisMoeda[0].getValor());
    }
}
