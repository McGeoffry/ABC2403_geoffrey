## Exercice 2.3 : Ma catégorie au Football
Écrire un algorithme qui demande à l’utilisateur de saisir un âge et l’informe ensuite à quelle catégorie il appartient :

Trop jeune : Moins de 5 ans
Débutant : De 5 à 6 ans
Poussin : De 7 à 8 ans
Benjamin : De 9 à 10 ans
Pupille : De 11 à 12 ans
Minime : De 13 à 14 ans
Cadet : De 15 à 16 ans
Junior : De 17 à 18 ans
Sénior : De 19 à 34 ans
Vétéran : 35 ans et +

```
VARIABLE

age est un NOMBRE ENTIER
categorie est une CHAINE DE CARACTERE


TRAITEMENT

	ECRIRE "saisissez votre age"
	LIRE age
SI age < 5 ALORS
	categorie : = "trop jeune"
	
SINON SI age <= 6 ALORS
	categorie : = 'débutant'
SINON SI age <= 8 ALORS
	categorie : = 'poussin'
SINON SI age <= 10 ALORS
	categorie : = 'benjamin'
SINON SI age <= 12 ALORS
	categorie : = 'pupille'
SINON SI age <= 14 ALORS
	categorie : = 'minime'
SINON SI age <= 16 ALORS
	categorie : = 'cadet'
SINON SI age <= 18 ALORS
   categorie : =  'Junior'
SINON SI age <= 34 ALORS
	categorie : = 'sénior'
SINON
	categorie : = 'vétéran'
FIN SI



RESULTAT

```