package edu.PedroDurand;

import edu.PedroDurand.dominio.Bootcamp;
import edu.PedroDurand.dominio.Curso;
import edu.PedroDurand.dominio.Dev;
import edu.PedroDurand.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        Curso c = new Curso("Java Backend", "Java Básico", 10);
        Curso c2 = new Curso("API em C#", "API REST com .NET", 8);

        Mentoria m = new Mentoria("Ajuda", "Ajjuda com exercicio",
                LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Trilha Backend", "Conteudos para backend");
        bootcamp.getConteudos().add(c);
        bootcamp.getConteudos().add(c2);
        bootcamp.getConteudos().add(m);
        System.out.println(c.calcularXp()) ;

        Dev dev = new Dev("Pedro");
        dev.inscreverBootcamp(bootcamp);
        System.out.println(dev.getConteudoInscritos());
        dev.progredir();
        System.out.println(dev.getConteudoInscritos());
        System.out.println(dev.getConteudosConcluidos());
        System.out.println(dev.calcularTotalXp());
        dev.progredir();
        System.out.println(dev.calcularTotalXp());

    }


}