# Exercice 2.4 : Je prédis l’avenir
Cet algorithme est destiné à prévenir l’avenir et il doit être infaillible !

Le programme demande à l’utilisateur de saisir 2 nombres entiers correspondant respectivement à des heures et des minutes. Le programme affichera ensuite l’heure qu’il sera 3 minutes plus tard.

Par exemple, si l’utilisateur saisit 23 puis 12 (correspondant à 23h12), le programme doit afficher Dans 3 minutes, il sera 23h15.

Si les nombres saisis par l’utilisateur sont “hors limite”, le programme affichera “Les données saisies sont invalides”

```
VARIABLE

h est un NOMBRE ENTIER
min est un NOMBRE ENTIER
hmin est un NOMBRE REEL



TRAITEMENT

	ECRIRE "Saisir heures"
	LIRE h
SI h > 12
	ECRIRE "Les données saisies sont invalides"
	ECRIRE "Saisir minutes"
	LIRE min
SI min > 59 ALORS
	ECRIRE "Les données saisies sont invalides"



RESULTAT

		hmin <-- min + 3
		
	ECRIRE "Dans 3 minutes, il sera ", h, h", min, "min" 

```