package edu.PedroDurand.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String  titulo, String descricao, int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
        this.setTitulo(titulo) ;
        this.setDescricao(descricao);
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    protected int getCargaHoraria() {
        return cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                '}';
    }
}
