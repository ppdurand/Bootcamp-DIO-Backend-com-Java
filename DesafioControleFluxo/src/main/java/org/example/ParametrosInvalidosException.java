package org.example;

public class ParametrosInvalidosException extends RuntimeException {
    public ParametrosInvalidosException(String message) {
        super(message);
    }

    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
    }
}
