package edu.PedroDurand.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos;
    private Set<Conteudo> conteudosConcluidos;

    public Dev(String nome) {
        this.nome = nome;
        this.conteudoInscritos = new LinkedHashSet<>();
        this.conteudosConcluidos = new LinkedHashSet<>();
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudoInscritos.remove(conteudo.get());
            this.conteudosConcluidos.add(conteudo.get());
        }else{
            System.err.println("Voce nao tem conteudo pendente");
        }
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    protected String getNome() {
        return nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudosConcluidos);
    }
}
