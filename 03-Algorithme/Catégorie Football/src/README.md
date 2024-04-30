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

age est un NOMBRE REEL


TRAITEMENT

	ECRIRE "saisir l'age souhaité"
	LIRE age
SI age < 5 ALORS
	ECRIRE "Il appartient à la catégorie 'trop jeune'"
SI age <= 6 ALORS
	ECRIRE "Il appartient à la catégorie 'débutant'"
SI age <= 8 ALORS
	ECRIRE "Il appartient à la catégorie 'poussin'"
SI age <= 10 ALORS
	ECRIRE "Il appartient à la catégorie 'benjamin'"
SI age <= 12 ALORS
	ECRIRE "Il appartient à la catégorie 'pupille'"
SI age <= 14 ALORS
	ECRIRE "Il appartient à la catégorie 'minime'"
SI age <= 16 ALORS
	ECRIRE "Il appartient à la catégorie 'cadet'"
SI age <= 18 ALORS
	ECRIRE "Il appartient à la catégorie 'sénior'"
SINON
	ECRIRE "Il appartient à la catégorie 'vétéran'"
FIN SI



RESULTAT

```