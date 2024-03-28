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
}
