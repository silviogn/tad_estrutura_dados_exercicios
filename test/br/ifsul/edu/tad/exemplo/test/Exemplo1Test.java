package br.ifsul.edu.tad.exemplo.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import br.ifsul.edu.tad.exemplo.Exemplo1;

/**
 *
 * @author silvi
 */
public class Exemplo1Test {
    
    public Exemplo1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void somarNumerosTest() {
        Exemplo1 exemplo1 = new Exemplo1();
        assertEquals(10, exemplo1.somarNumeros(5, 5));        
    }
    
    @Test    
    public void somarNumerosTestAMenorZero(){
        Exemplo1 exemplo1 = new Exemplo1();
        assertEquals(0, exemplo1.somarNumeros(-5, 5));        
    }
    
    @Test    
    public void somarNumerosTestBMenorZero(){
        Exemplo1 exemplo1 = new Exemplo1();
        assertEquals(0, exemplo1.somarNumeros(5, -5));        
    }
    
    /*@Test
    public void somarNumerosTestFalha() {
        Exemplo1 exemplo1 = new Exemplo1();
        assertEquals(11, exemplo1.somarNumeros(5, 5));        
    }
    */
}
