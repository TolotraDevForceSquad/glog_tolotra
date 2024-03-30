package iut.bat;

public class Humain {
	private String nom;
    private String prenom;
    private int age;
    
    public Humain(String nom, String prenom, int age) {
    	this.nom = nom;
        this.prenom = prenom;
        this.age = age;
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
}
