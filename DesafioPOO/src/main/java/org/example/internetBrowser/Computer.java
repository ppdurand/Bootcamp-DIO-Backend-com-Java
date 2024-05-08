package org.example.internetBrowser;

public class Computer implements InternetBrowser {
    @Override
    public void showPage() {
        System.out.println("Mostrando pagina no computador");
    }

    @Override
    public void newTab() {
        System.out.println("Abrindo nova guia no computador");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando pagina no computador");
    }
}
