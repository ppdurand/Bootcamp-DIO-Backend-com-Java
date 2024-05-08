package org.example.telephone;

public class SmartPhone implements Telephone{
    @Override
    public void call(String name) {
        System.out.printf("Ligar para %s no SmartPhone%n", name);
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo ligaão no SmartPhone");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Iniciando correio de voz no SmartPhone");
    }
}
