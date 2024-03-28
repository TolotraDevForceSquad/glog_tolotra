
Génie Logiciel Avancé

Travaux pratiques - Refactoring

Dans ce TP, il faudra utiliser au maximum les opérations de refactoring disponibles dans l'Eclipse. On utilisera le système de gestion de version SVN (Subversion) ou Git pour conserver l'historique des modifications (comment vous avez fait pour obtenir ce qu'on vous demande).

1. Créez un nouveau projet en Java sur l'Eclipse;

2. Dans le répertoire source, ajoutez un package lut.bad;

3. Créez une classe Homme ayant comme champs nom, prenom, age et des constructeurs;

4. Créez une classe Femme ayant les mêmes champs et des constructeurs;

5. Créez une classe Humain et modifiez Homme/Femme pour qu'elle soit leur classe parente;

6. Déplacez les attributs de Homme/Femme pour les placer dans le parent;

7. Dans la classe Humain, écrivez une méthode details() qui affiche le nom, prénom, et âge en utilisant un unique System.out.print;

8. Extrayez les paramètres affichés de la méthode précédente pour les placer dans une méthode toString();

9. Que se passe-t-il si vous voulez déplacer la méthode toString() vers les sous classes?

10. Ajoutez les méthodes manger() et boire() à la classe Humain;

11. Déplacez ces méthodes dans une interface Consommation;

12. Ajoutez une méthode ami(Humain) qui permet d'indiquer une amitié entre 2 humains;

13. Dans la classe Femme, créez une méthode main() qui instancie un Homme et une Femme, et déclare que l'un est ami de l'autre ;

14. Modifiez la signature d'ami pour qu'elle prenne un int en paramètre (la durée de l'amitié en jours) valant 100 par défaut.
