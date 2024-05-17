# Facture de Photocopies 






```
CONSTANTES

P1 <-- est un REEL
P2 <-- est un REEL
P3 <-- est un REEL


VARIABLES

nbc est un ENTIER
montantfct est un NOMBRE REEL


TRAITEMENT

    ECRIRE "saisir le nomnbre de copies"
    LIRE nbc

    SI nbc <= 10
    ALORS
        montantfct <-- nbc * P1
    SINON SI nbc <= 30
    ALORS
        montantfct <-- 10 * P1 + (nbc - 10) * P2
    SINON
        montantfct <-- 10 * P1 +20 * P2 + (nbc - 30) * P3
    FIN SI

RESULTAT

    ECRIRE "A payer: ", montantfct, "€"
```


# CODE JAVA

## import java.util.Scanner;


# public class : App


    final static double P1 = 0.1;
    final static double P2 = 0.09;
    final static double P3 = 0.08;


    public static void main(String[] args) {


            int nbc;
            double montantfct;
            Scanner sc = new Scanner(System.in);

            System.out.println("Saisir le nombre de photocopies: ");
            nbc = sc.nextInt();

            if (nbc <= 10) {

                montantfct = nbc * App.P1;
            }

            




    }