package model;

public class ClassePersonnage {

    public String nom;
    public Type type;

    public double pourcentAttaque;
    public double pourcentDefense;

    public double pourcentPdV;

    public int pourcentVitesse;
    public int pourcentVitesseAttaque;


    public enum Type {
        GUERRIER,
        MAGE,
        ARCHER,
        VOLEUR
    }


    // Constructeur

    public ClassePersonnage(String cNom, Type cType, double cPourcentAttaque, double cPourcentDefense, double cPourcentPdV, int cPourcentVitesse, int cPourcentVitesseAttaque) {
        this.nom = cNom;
        this.type = cType;
        this.pourcentAttaque = cPourcentAttaque;
        this.pourcentDefense = cPourcentDefense;
        this.pourcentPdV = cPourcentPdV;
        this.pourcentVitesse = cPourcentVitesse;
        this.pourcentVitesseAttaque = cPourcentVitesseAttaque;
    }

    // Opérations

}
