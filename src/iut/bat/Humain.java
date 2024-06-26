package iut.bat;

import java.util.ArrayList;
import java.util.List;

public class Humain implements Consommation {
	private String nom;
    private String prenom;
    private int age;
    private List<Humain> amis;
    
    public Humain(String nom, String prenom, int age) {
    	this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.amis = new ArrayList<>();
    }
    
    public void details() {
    	System.out.print(nom + " " + prenom + " - " + age + " ans");
    }
    
    public String toString() {
        return nom + " " + prenom + " - " + age + " ans";
    }
    
    public void manger() {
        System.out.println("Je mange.");
    }
    
    public void boire() {
        System.out.println("Je bois.");
    }
    
    public void ami(Humain ami, int duree) {
        if (!this.amis.contains(ami)) {
            this.amis.add(ami);
            ami.ami(this, duree);
            System.out.println(this.prenom + " ami avec " + ami.prenom + " pour " + duree + " jours.");
        } else {
            System.out.println(this.prenom + " déjà ami avec " + ami.prenom + ".");
        }
    }
    
    public void ami(Humain ami) {
        ami(ami, 100);
    }
    
    public List<Humain> getAmis() {
        return amis;
    }
    
    public void setAmis(List<Humain> amis) {
        this.amis = amis;
    }
}
