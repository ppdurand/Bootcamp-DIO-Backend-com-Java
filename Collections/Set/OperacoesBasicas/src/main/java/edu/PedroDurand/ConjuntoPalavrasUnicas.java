package edu.PedroDurand;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<PalavrasUnicas> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public Set<PalavrasUnicas> getPalavrasUnicasSet() {
        return palavrasUnicasSet;
    }
    @Override
    public String toString() {
        return "ConjuntoPalavrasUnicas{" +
                "palavrasUnicasSet=" + palavrasUnicasSet +
                '}';
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(new PalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra){
        for (PalavrasUnicas p : palavrasUnicasSet){
            if(p.getPalavra() == palavra){
                palavrasUnicasSet.remove(p);
                break;
            }
        }
    }

    public String verificarPalavra(String palavra){
        for(PalavrasUnicas p : palavrasUnicasSet){
            if(p.getPalavra() == palavra){
                return "A palavra " + palavra + " existe";
            }
        }
        return "Não existe";
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }
}
