package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestJunitTicketMachine {

    @Test
    public void TesteClasseTroco() 
    {
        Troco ticketTroco = new Troco(189);
        
        assertEquals(ticketTroco.papeisMoeda[5], 1);     
        assertEquals(ticketTroco.papeisMoeda[4], 1);       
        assertEquals(ticketTroco.papeisMoeda[3], 1);
        assertEquals(ticketTroco.papeisMoeda[2], 1);
        assertEquals(ticketTroco.papeisMoeda[1], 1);   
        assertEquals(ticketTroco.papeisMoeda[0], 2);
    }
}
