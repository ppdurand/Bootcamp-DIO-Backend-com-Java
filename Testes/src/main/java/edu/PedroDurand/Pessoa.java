package edu.PedroDurand;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {
    private String name;
    private LocalDate dataNascimento;

    public Pessoa(String name, LocalDate dataNascimento) {
        this.name = name;
        this.dataNascimento = dataNascimento;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public int getIdade(){
        return (int) ChronoUnit.YEARS.between(dataNascimento, LocalDate.now());
    }
}
