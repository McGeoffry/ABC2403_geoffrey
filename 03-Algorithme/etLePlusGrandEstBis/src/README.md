Exercice 3.7 : Et le plus grand est… encore.
Réécrire l’algorithme précédent, mais cette fois-ci on ne connaît pas d’avance combien l’utilisateur souhaite saisir de nombres. La saisie des nombres s’arrête lorsque l’utilisateur entre un zéro.




```
VARIABLE

saisie est un NOMBRE ENTIER
nombre est un NOMBRE ENTIER
nombreMax est un NOMBRE ENTIER

TRAITEMENT

ECRIRE "Saisissez un nombre(0 pour arrêter)"
LIRE nombre
FAIRE
SI nombre > nombreMax ALORS
nombreMax = nombre

TANT QUE
nombre != 0 ALORS
ECRIRE "Le plus grand nombre est: " + nombreMax

FIN

```