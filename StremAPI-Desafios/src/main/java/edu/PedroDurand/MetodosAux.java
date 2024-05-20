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
    public Integer quadrado(Integer numero){
      Integer quadrado;
      return quadrado = numero * numero;
    }

    public boolean primo(Integer numero){
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
