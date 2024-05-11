package edu.PedroDurand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Inteiros> numberList;

    public OrdenacaoNumeros() {
        this.numberList = new ArrayList<>();
    }

    public void addNumber(int number){
        numberList.add(new Inteiros(number));
    }

    public List<Inteiros> ascendingOrder(){
        List<Inteiros> crescente = new ArrayList<>(numberList);
        Collections.sort(crescente);

        return crescente;
    }

    public List<Inteiros> descendingOrder(){
        List<Inteiros> descendente = new ArrayList<>(numberList);
        Collections.sort(descendente, Collections.reverseOrder());

        return descendente;
    }
}
