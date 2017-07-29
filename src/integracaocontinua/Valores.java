package integracaocontinua;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Valores implements ValoresITF{
    
    private final ArrayList<Integer> lista = new ArrayList();

    @Override
    public boolean inserir(int v) {
        // controlar valores > 0        
        if(lista.size()>=10 || v <= 0){            
            return false;  
        }        
        return this.lista.add(v);
           
    }

    @Override
    public int deletar(int valor) {
        
        if(lista.isEmpty()){
            return -1;
        }
        
        Integer indiceremovido = lista.indexOf(valor);        
        lista.remove(valor);
        return indiceremovido;
        
    }

    @Override
    public int tamanho() {
        return lista.size(); 
    }

    @Override
    public double media() {
        return lista.stream().mapToDouble(a -> a).average().orElse(-1);
    }

    @Override
    public int maiorValor() {
        return Collections.max(lista);
    }

    @Override
    public int menorValor() {
        return Collections.min(lista);      
    }
    
}
