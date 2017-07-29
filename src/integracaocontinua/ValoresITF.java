package integracaocontinua;

public interface ValoresITF {

    boolean inserir(int v); // insere um valor
    int deletar(int i); // remove/retorna valor indice i
    int tamanho(); // retorna quantidade de valores armazenados
    double media(); // retorna média de valores armazenados
    int maiorValor(); // retorna maior valor armazenado
    int menorValor(); //retorna o menor valor armazenado
    
}
