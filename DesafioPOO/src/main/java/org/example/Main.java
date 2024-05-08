package org.example;

import org.example.internetBrowser.Computer;
import org.example.internetBrowser.InternetBrowser;
import org.example.musicPlayer.IPod;
import org.example.musicPlayer.MusicPlayer;
import org.example.telephone.SmartPhone;
import org.example.telephone.Telephone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Funções do iPod: ");
        MusicPlayer ipod = new IPod();

        ipod.playSong();
        ipod.pauseSong();
        ipod.selectSong();
        System.out.println(" ");

        System.out.println("Funcões do Smartphone: ");
        Telephone smartphone = new SmartPhone();

        smartphone.call("Fulano");
        smartphone.answerCall();
        smartphone.startVoiceMail();
        System.out.println(" ");

        System.out.println("Funções do Computador: ");
        InternetBrowser pc = new Computer();

        pc.showPage();
        pc.newTab();
        pc.refreshPage();
        System.out.println(" ");

        System.out.println("Funções do iPhone: ");
        Iphone iphone = new Iphone();

        iphone.playSong();
        iphone.pauseSong();
        iphone.selectSong();
        iphone.call("Fulano");
        iphone.answerCall();
        iphone.startVoiceMail();
        iphone.showPage();
        iphone.newTab();
        iphone.refreshPage();
    }
}