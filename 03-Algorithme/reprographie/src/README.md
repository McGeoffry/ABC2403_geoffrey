# xercice 2.5 : Réprographie
Un magasin proposant un service de Réprographie facture 0.10€ les 10 premières photocopies, 0.09€ les vingt suivants et 0.08 au delà.

Écrire l’algorithme qui demande à l’utilisateur de saisir le nombre de photocopies effectuées et affiche le montant de la facture correspondante.


VARIABLES

nbc est un ENTIER
facture est un NOMBRE REEL


TRAITEMENT

    ECRIRE "saisir le nomnbre de copies"
    LIRE nbc

    SI nbc <= 10
    ALORS
        facture <-- nbc * 0.09
    SINON SI nbc <= 30
    ALORS
        facture <-- 10 * 0.10 + (nbc - 10) * 0.08
    SINON
        facture <-- 10 * 0.10 +20 * 0.09 + (nbc - 30) * 0.08
    FIN SI

RESULTAT

    ECRIRE "A payer: ", facture, "€"
```

