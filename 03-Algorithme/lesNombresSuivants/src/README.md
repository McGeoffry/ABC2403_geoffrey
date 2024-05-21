# Exercice 3.3 : Les nombres suivants
Écrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants.

Par exemple, si l’utilisateur entre le nombre 17, le programme affichera :

Les 10 nombres après 17 sont: 18, 19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 ,27

Écrire cet algorithme dans un premier temps avec une boucle tant que, puis écrivez une 2nde version avec une boucle pour.


```

## VARIABLES

saisie est UN NOMBRE ENTIER
nbDepart est un NOMBRE ENTIER


## TRAITEMENT

ECRIRE "Saisissez un nombre"
TANT QUE saisie <= 10 ALORS
ECRIRE "Les 10 nombres apres " + nbDepart + saisie + " " 
saisie++

FIN TANT
