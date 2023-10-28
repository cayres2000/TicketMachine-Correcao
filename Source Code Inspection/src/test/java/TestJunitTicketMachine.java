package br.calebe.ticketmachine.core;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author unifvgago
 */
public class JUnitTest {
    
    @Test
    public void testClasseTroco() 
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
