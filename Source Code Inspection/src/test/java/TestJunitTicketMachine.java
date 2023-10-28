package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestJunitTicketMachine {
    /*
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
    */
    private TicketMachine ticketMachine;
    @Before
    public void setUp() {
        ticketMachine = new TicketMachine(100);
    }

    @Test
    //teste para verificar a insercao se um valor valido
    public void testInserirValidQuantia() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(100);  
        assertEquals(100, ticketMachine.getSaldo());
    }

    @Test
    public void testGetTroco() throws PapelMoedaInvalidaException {
        assertEquals(-100, ticketMachine.getTroco());
    }
 
    @Test
    //teste para verificar a impressao com saldo suficiente
    public void testImprimirTicketWithSufficientBalance() throws SaldoInsuficienteException,PapelMoedaInvalidaException {
        ticketMachine.inserir(100);  
        String ticket = ticketMachine.imprimir();
        String resposta = "*****************\n";
        resposta += "*** R$ 100,00 ****\n";
        resposta += "*****************\n";
        assertEquals(resposta, ticket);
        assertEquals(0, ticketMachine.getSaldo());
    }

    @Test(expected = PapelMoedaInvalidaException.class)
    //teste para verificar a insercao de valores invalidos na maquina
    public void testInserirInvalidQuantia() throws PapelMoedaInvalidaException {
        ticketMachine.inserir(17);  
    }
}
