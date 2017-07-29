package integracaocontinua;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ValoresTest {
    
    private Valores val;
    
    public ValoresTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        val = new Valores();
        val.inserir(5);
        val.inserir(12);
        val.inserir(1);
        val.inserir(30);
        val.inserir(152);
        val.inserir(6);        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inserir method, of class Valores.
     */
    @Test
    public void testInserir() {
        System.out.println("inserir");
        Valores instance = new Valores();
        boolean expResult = true;
        boolean result = instance.inserir(10);
        assertEquals(result, expResult);
    }

    /**
     * Test of deletar method, of class Valores.
     */
    @Test
    public void testDeletar() {
        System.out.println("deletar");
        
        Integer tamanho = val.tamanho();
        Integer resultadoEsperado = tamanho - 1; 
        
        val.deletar(5);
        
        Integer resultado = val.tamanho();
        assertEquals(resultadoEsperado, resultado);
        
       
    }

    /**
     * Test of tamanho method, of class Valores.
     */
    @Test
    public void testTamanho() {
        System.out.println("tamanho");
        
        Integer resultadoEsperado = 6;
        
        Integer resultado = val.tamanho();
        
        assertEquals(resultadoEsperado, resultado);   
        
    }

    /**
     * Test of media method, of class Valores.
     */
    @Test
    public void testMedia() {
        System.out.println("média");
        //206
        
        Double expected = 34.333333333333336;
        Double actual = val.media();
        //System.out.println(""+val.media());
        
        assertEquals(expected, actual);

    }

    /**
     * Test of maiorValor method, of class Valores.
     */
    @Test
    public void testMaiorValor() {
        System.out.println("maiorValor");
        
        Integer expected = 152;
        
        Integer actual = val.maiorValor();
        
        assertEquals(expected, actual);

    }

    /**
     * Test of menorValor method, of class Valores.
     */
    @Test
    public void testMenorValor() {
        System.out.println("menorValor");
        
        Integer expected = 1;
        
        Integer actual = val.menorValor();
        
        assertEquals(expected, actual);        

    }
    
}
