package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestJunitTicketMachine {
    private TicketMachine ticketMachine;
    private Troco ticketTroco;
    @Before
    public void InstanciandoClassesDeTeste() {
        ticketMachine = new TicketMachine(10);
        ticketTroco = new Troco(189);
    }
    
    @Test
    public void TesteClasseTrocoValorNotas() 
    {
        
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
        assertEquals(1,ticketTroco.papeisMoeda[5].getQuantidade());
        assertEquals(1,ticketTroco.papeisMoeda[4].getQuantidade());
        assertEquals(1,ticketTroco.papeisMoeda[3].getQuantidade());
        assertEquals(1,ticketTroco.papeisMoeda[2].getQuantidade());
        assertEquals(1,ticketTroco.papeisMoeda[1].getQuantidade());
        assertEquals(2,ticketTroco.papeisMoeda[0].getQuantidade());
    }

    @Test
    public void TesteClasseTicketMachineInserir() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(20);  
        assertEquals(20, ticketMachine.getSaldo());
    }
    
    @Test
    public void TesteClasseTicketMachineTroco() throws PapelMoedaInvalidaException {
        assertEquals(90, ticketMachine.getTroco());
    }
     
    @Test
    public void TesteClasseTicketMachineImprimir() throws SaldoInsuficienteException,PapelMoedaInvalidaException { 
        String resposta = "*****************\n";
        resposta += "*** R$ 20,00 ****\n";
        resposta += "*****************\n";
        assertEquals(resposta, ticketMachine.imprimir());
        assertEquals(10, ticketMachine.getSaldo());
    }
}
