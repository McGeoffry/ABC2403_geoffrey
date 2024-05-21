#Exercice 3.6 : Et le plus grand est…
Érire un algorithme qui demande successivement 20 nombres à l’utilisateur, et qui lui inqique ensuite quel est le plus grand parmi ces 20 nombres.

Exemple de fonctionnement du programme :




```
VARIABLE

saisie est un NOMBRE ENTIER
leNombreMax est un NOMBRE ENTIER
nombre est un NOMBRE ENTIER


ECRIRE "saisissez 20 nombres "
POUR saisie = 1 ; saisie <= 20; saisie++
ECRIRE "nombre "+ saisie + ": "
SI nombre > leNombreMax ALORS
LeNombreMax = nombre

ECRIRE "Le plus grand nombre saisie est: " + leNombreMax

FIN