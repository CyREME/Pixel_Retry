package model;

public class Equipement {
    public String nom;
    public typeEquipement type;
    public int bonusAttaque;
    public int bonusDefense;

    public Equipement(String eNom, typeEquipement eType, int bonusAttaque, int bonusDefense) {
        this.nom = eNom;
        this.type = eType;
        this.bonusAttaque = bonusAttaque;
        this.bonusDefense = bonusDefense;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getBonusAttaque() {
        return bonusAttaque;
    }

    public void setBonusAttaque(int bonusAttaque) {
        this.bonusAttaque = bonusAttaque;
    }

    public int getBonusDefense() {
        return bonusDefense;
    }

    public void setBonusDefense(int bonusDefense) {
        this.bonusDefense = bonusDefense;
    }

}
