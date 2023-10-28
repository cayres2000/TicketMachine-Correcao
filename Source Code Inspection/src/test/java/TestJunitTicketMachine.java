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
    
    @Test
    public void TesteClasseTrocoQuantidade() 
    {
        Troco ticketTroco = new Troco(189);
        
        assertEquals(100,ticketTroco.papeisMoeda[5].getQuantidade());     
        assertEquals(50,ticketTroco.papeisMoeda[4].getQuantidade());       
        assertEquals(20,ticketTroco.papeisMoeda[3].getQuantidade());
        assertEquals(10,ticketTroco.papeisMoeda[2].getQuantidade());
        assertEquals(5,ticketTroco.papeisMoeda[1].getQuantidade());   
        assertEquals(2,ticketTroco.papeisMoeda[0].getQuantidade());
    }
    /*
    @Test
    public void TesteClasseTicketMachine() 
    {
        TicketMachine ticketMachine = new TicketMachine(10);
        ticketMachine.inserir(20);
        
        String result = "*****************\n";
        result += "*** R$ 20,00 ****\n";//Corrigido
        result += "*****************\n";

        assertEquals(result,ticketMachine.imprimir());
    }*/
}
