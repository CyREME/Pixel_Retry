package model;

import java.util.ArrayList;
import java.util.List;

public class Personnage {

    // Attributs
    public String nom;
    public String prenom;
    public ClassePersonnage classe;
    public List<Equipement> equipements;

    public int level;
    public int pdv;
    public int attaquePersonnage;
    public int defensePersonnage;
    public int vitesse;
    public int vitesseAttaque;


    // Constructeur

    public Personnage(String nom, String prenom, ClassePersonnage classe) {
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.equipements = new ArrayList<>();
        this.pdv = 1;
        this.level = 1;

        updateStats();
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }



    public ClassePersonnage getClasse() {
        return this.classe;
    }

    public void setClasse(ClassePersonnage classe) {
        this.classe = classe;
    }



    public List<Equipement> getEquipements() {
        return this.equipements;
    }

    public void setEquipements(List<Equipement> equipements) {
        this.equipements = equipements;
    }



    public void setPdV(){
        double pdv_temp = (1 + ( (5 * level) / 100)) * this.classe.pourcentPdV;
        this.pdv = (int) Math.floor(pdv_temp);
    }

    public int getPdV() {
        return this.pdv;
    }

    public void setLevel(int level){
        this.level = level;
        // Modifier pour que les pv s'ajuste quand on monte de niveau

    }

    public int getLevel(){
        return this.level;
    }

    public void setVitesse(int vitesse){
        double vitesse_temp = (1 + ( (5 * level) / 100)) * this.classe.pourcentVitesse;
        this.vitesse = vitesse;
    }

    public double getVitesse(){
        return this.vitesse;
    }

    public void setVitesseAttaque(int vitesseAttaque){
        double vitesseAttaque_temp = (1 + ( (5 * level) / 100)) * this.classe.pourcentVitesseAttaque;
        this.vitesseAttaque = vitesseAttaque;
    }

    public double getVitesseAttaque(){
        return this.vitesseAttaque;
    }

    public void setDegatPersonnage(){
        double degatPersonnage_temp = (1 + ( (5 * level) / 100)) * this.classe.pourcentAttaque;
        this.attaquePersonnage = (int) Math.floor(degatPersonnage_temp);
    }

    public int getDegatPersonnage(){
        return this.attaquePersonnage;
    }

    public void setDefensePersonnage(){
        double defense_temp = (1 + ( (5 * level) / 100)) * this.classe.pourcentDefense;
        this.defensePersonnage = (int) Math.floor(defense_temp);
    }

    public int getDefensePersonnage(){
        return this.defensePersonnage;
    }





    // Opérations
    public void equiper(Equipement equipement) {
        this.equipements.add(equipement);
    }

    public void attaquer(Personnage cible) {
        int degats = 0;
        for (Equipement equipement : this.equipements) {
            degats += equipement.getBonusAttaque();
        }
    }

    private void updateStats(){
        this.pdv = (int) Math.floor(10 * this.level * this.classe.pourcentPdV);
        this.attaquePersonnage = (int) Math.floor(this.level * this.classe.pourcentAttaque);
        this.defensePersonnage = (int) Math.floor(this.level * this.classe.pourcentDefense);
        this.vitesse = (int) Math.floor(this.level * this.classe.pourcentVitesse);
        this.vitesseAttaque = (int) Math.floor(this.level * this.classe.pourcentVitesseAttaque);
    }

    public void afficherStats() {
        System.out.println("Nom : " + this.nom);
        System.out.println("Prénom : " + this.prenom);
        System.out.println("Classe : " + this.classe.nom);
        System.out.println("Level : " + this.level);
        System.out.println("Vitesse : " + this.vitesse);
        System.out.println("Vitesse d'attaque : " + this.vitesseAttaque);
        System.out.println("Attaque : " + this.attaquePersonnage);
        System.out.println("Défense : " + this.defensePersonnage);
        System.out.println("Points de vie : " + this.pdv);
    }




}
