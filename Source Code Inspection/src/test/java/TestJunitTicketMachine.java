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
        
        assertEquals(1,ticketTroco.papeisMoeda[5].getValor());     
        assertEquals(1,ticketTroco.papeisMoeda[1].getQuantidade());       
        assertEquals(1,ticketTroco.papeisMoeda[2].getQuantidade());
        assertEquals(1,ticketTroco.papeisMoeda[3].getQuantidade());
        assertEquals(1,ticketTroco.papeisMoeda[4].getQuantidade());   
        assertEquals(2,ticketTroco.papeisMoeda[5].getValor());
    }
}
