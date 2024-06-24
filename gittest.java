import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Resolution des fractions");
        // Demande a utilisateur d'entrer des nombres
        System.out.println("Veuillez entrer le numerateur de la fraction A: ");
        int n1 = scanner.nextInt();
        System.out.println("Veuillez entrer le denominateur de la fraction A: ");
        int d1 = scanner.nextInt();
        System.out.println("Veuillez entrer le numerateur de la fraction B: ");
        int n2 = scanner.nextInt();
        System.out.println("Veuillez entrer le denominateur de la fraction B: ");
        int d2 = scanner.nextInt();

        // Création de deux fractions
        FRAC frac1 = new FRAC(n1,d1);
        FRAC frac2 = new FRAC(n2,d2);

        // Affichage des fractions
        frac1.afficher();
        frac2.afficher();

        // Addition de fractions
        FRAC resultat = addFractions(frac1, frac2);
        System.out.print("Addition : ");
        resultat.afficher();

        // Soustraction de fraction

    }

    public static FRAC addFractions(FRAC frac1, FRAC frac2) {
        int numResultat = frac1.getNumerateur() * frac2.getDenominateur() +
                frac2.getNumerateur() * frac1.getDenominateur();
        int denResultat = frac1.getDenominateur() * frac2.getDenominateur();
        return new FRAC(numResultat, denResultat);
    }

    // Ajoutez d'autres méthodes pour la soustraction, la multiplication, la division, etc.

    public static class FRAC {
        private int numerateur;
        private int denominateur;

        public FRAC(int num, int deno) {
            this.numerateur = num;
            if (deno != 0) { // Correction de la condition avec des accolades
                this.denominateur = deno;
            }
        }

        public int getNumerateur() {
            return this.numerateur;
        }

        public int getDenominateur() {
            return this.denominateur;
        }

        public void setNumerateur(int n) {
            this.numerateur = n;
        }

        public void setDenominateur(int d) {
            if (d != 0)
                this.denominateur = d;
        }

        public void afficher() {
            System.out.println(this.numerateur + "/" +this.denominateur);

        }
    }
}