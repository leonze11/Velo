import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
		int x = fin-debut;
		double cout1=0.0;
		double cout2=0.0;
		if(!(x<0)&&(x<7)||((x<17)&& (x==17)&&(x<24)||!(x==24))) {
			if((debut>=0 && debut<7) && (fin>0 && fin<=7)) {
				System.out.println(x + " heure(s) au tarif horaire de 1.0 franc(s)");
				cout1=x;
			}
			if((debut>17 && debut<24) && (fin>17 && fin<=24)) {
				System.out.println(x+" heure(s) au tarif horaire de 1.0 franc(s)");
				cout1=x;
			}
			if(fin>17 && fin==19) {
				System.out.println(fin-17 +"heure(s) au tarif horaire de 1.0 franc(s)");
				cout1=fin-17;
			}
		}
		if((debut>7 && debut<17) && (fin>7 && fin<=17) && !(debut==10)) {
			System.out.println( x +"heure(s) au tarif horaire de 2.0 franc(s)");
			cout2=x*2;
		}
		if((x<=7) && (x==7) || (x<=17) && !(x==17)) {
			if(debut==10 && debut<=17) {
				System.out.println(17-debut+" heure(s) au tarif horaire de 2.0 franc(s)");
				cout2=(17-debut)*2.0;
			}
		}
			System.out.print("Le montant total à payer est de ");
			System.out.print(cout1+cout2);
			System.out.println(" franc(s)");
		
		if((debut>24||debut<0)||(fin>24 || fin<0)) {
			System.out.println("Les heures doivent être comprises entre 0 et 24 !");
		}
		if(debut>fin) {
			System.out.println("Bizarre, le debut de location est aprés la fin...");
		}
		if(debut==fin) {
			System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
		}
		 /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
          clavier.close();
    }
}

