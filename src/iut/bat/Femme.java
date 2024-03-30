package iut.bat;

public class Femme extends Humain {
    public Femme(String nom, String prenom, int age) {
       super(nom, prenom, age);
    }   
    
    public static void main(String[] args) {
        Femme manitra = new Femme("RAVEL", "Manitra", 20);
        Homme rina = new Homme("RAVEL", "Rina", 25);
        
        rina.ami(manitra);
        
        System.out.println("Amis de Manitra : " + manitra.getAmis());
        System.out.println("Amis de Rina : " + rina.getAmis());
    }
}
