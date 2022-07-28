package Pacote;

import java.util.ArrayList;

public class Controle {

    public static ArrayList<Personagem> personagens = new ArrayList<Personagem>();
    public static ArrayList<Local> locais = new ArrayList<Local>();

    public Personagem you() {

        return personagens.get(personagens.size() - 1);
    }

    public Personagem yourMonster(int i) {

        return personagens.get(yourLocation().getMonstros().get(i) - 1);
    }

    public Local yourLocation() {

        return locais.get(you().getLocal() - 1);
    }

    public Local yourRouts(int i) {

        return locais.get(yourLocation().getRouts().get(i) - 1);
    }
}
