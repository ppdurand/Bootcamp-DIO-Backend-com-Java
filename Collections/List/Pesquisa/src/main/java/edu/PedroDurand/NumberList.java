package edu.PedroDurand;

import java.util.ArrayList;
import java.util.List;

public class NumberList {
    private List<Integer> numberList;

    public NumberList() {
        this.numberList = new ArrayList<>();
    }

    public String addNumber(int number){
        numberList.add(number);

        return "Adicionado numero" + number;
    }

    public int calculateAmount(){
        int soma = 0;
        for(Integer i : numberList){
            soma += i;
        }
        return soma;
    }

    public int findHigherNumber(){
        int highernumber = 0;
        int repetition = 0;

        for(Integer i : numberList){
            if(repetition == 0){
                highernumber = i;
                repetition++;
            }
            else{
                if(i > highernumber){
                    highernumber = i;
                }
            }
        }
        return highernumber;
    }

    public int fingLowestNumber(){
        int lowestNumber = 0;
        int repetition = 0;

        for(Integer i : numberList){
            if(repetition == 0){
                lowestNumber = i;
                repetition++;
            }
            else{
                if(i < lowestNumber){
                    lowestNumber = i;
                }
            }
        }
        return lowestNumber;
    }

    public String showNumbers(){
        return numberList.toString();
    }

    @Override
    public String toString() {
        return "NumberList{" +
                "numberList=" + numberList +
                '}';
    }
}
