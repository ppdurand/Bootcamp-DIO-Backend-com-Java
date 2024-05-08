package org.example.musicPlayer;

public class IPod implements MusicPlayer {

    @Override
    public void playSong() {
        System.out.println("Tocando música no iPod");
    }

    @Override
    public void pauseSong() {
        System.out.println("Música pausada no iPod");
    }

    @Override
    public void selectSong() {
        System.out.println("Selecionando música no iPod");
    }

}
