# Exercice 2.2 : Positif ou négatif (bis) ?

Écrire un algorithme qui demande à l’utilisateur de saisir 2 nombres entiers et l’informe ensuite si leur produit est positif ou négatif.


```
VARIABLE

nombre1 est un NOMBRE ENTIER
nombre2 est un NOMBRE ENTIER


TRAITEMENT

    ECRIRE "Veuillez saisir votre nombre"
    LIRE nombre1
SI nombre1 > 0 ALORS
    ECRIRE "nombre1 est positif"
SI nombre1 < 0 ALORS
    ECRIRE "nombre1 est négatif"
SI nombre1 = 0 ALORS
    ECRIRE "nombre1 n'est no positif, ni négatif"
ET
    ECRIRE "Veuillez saisir votre nombre" 
    LIRE nombre2
SI nombre2 > 0 ALORS
    ECRIRE "nombre2 est positif"
SI nombre2 < 0 ALORS
    ECRIRE "nombre2 est négatif"
SI nombre1 = 0 ALORS
    ECRIRE "nombre2 n'est no positif, ni négatif"
FIN SI
```