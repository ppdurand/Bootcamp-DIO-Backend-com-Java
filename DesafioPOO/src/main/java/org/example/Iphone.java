package org.example;

import org.example.internetBrowser.InternetBrowser;
import org.example.musicPlayer.MusicPlayer;
import org.example.telephone.Telephone;

public class Iphone implements MusicPlayer, Telephone, InternetBrowser {
    @Override
    public void showPage() {
        System.out.println("Mostrando pagina no iPhone");
    }

    @Override
    public void newTab() {
        System.out.println("Atendendo ligaão no iPhone");
    }

    @Override
    public void refreshPage() {
        System.out.println("Iniciando correio de voz no iPhone");
    }

    @Override
    public void playSong() {
        System.out.println("Tocando música no iPhone");
    }

    @Override
    public void pauseSong() {
        System.out.println("Música pausada no iPhone");
    }

    @Override
    public void selectSong() {
        System.out.println("Selecionando música no iPhone");
    }

    @Override
    public void call(String name) {
        System.out.printf("Ligar para %s no iPhone%n", name);
    }

    @Override
    public void answerCall() {
        System.out.println("Atendendo ligaão no iPhone");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Iniciando correio de voz no iPhone");
    }
}
