package io.github.some_example_name;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import model.*;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends Game {
    @Override
    public void create() {
        setScreen(new FirstScreen());
    }

    public void Test(){
        ClassePersonnage guerrier = new ClassePersonnage("Guerrier", ClassePersonnage.Type.GUERRIER, 1.5, 1.0, 1.3, 2, 2);
        ClassePersonnage mage = new ClassePersonnage("Mage", ClassePersonnage.Type.MAGE, 1.3, 0.5, 0.5, 6, 6);
        ClassePersonnage archer = new ClassePersonnage("Archer", ClassePersonnage.Type.ARCHER, 1.25, 0.75, 0.75, 10, 10);
        ClassePersonnage voleur = new ClassePersonnage("Voleur", ClassePersonnage.Type.VOLEUR, 1.5, 0.25, 0.25, 15, 15);

        Personnage Patrik = new Personnage("L'étoile", "Patrik", guerrier);
        Personnage Bob = new Personnage("L'éponge", "Bob", mage);
        Personnage Carlo = new Personnage("Le Calamar", "Carlo", archer);
        Personnage Crabs = new Personnage("Monsieur", "Crabs", voleur);


        Patrik.afficherStats();

        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");

        Bob.afficherStats();

        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");

        Carlo.afficherStats();

        System.out.println("");
        System.out.println("----------------------");
        System.out.println("");


        Crabs.afficherStats();
    }

    public static void main(String[] args) {

    }
}

