package edu.PedroDurand;

public class MetodosAux {
    public Integer somaDigitos(Integer numero){
        int soma = 0;
        while (numero != 0) {
            soma += numero % 10;
            numero /= 10;
        }
        return soma;
    }
}
