# Exercie 2.6 : Élections
Les élections législatives, en Guignolerie Septentrionale, obéissent à la règle suivante :

- Lorsque l’un des candidats obtient plus de 50% des suffrages, il est élu dès le premier tour.

- En cas de deuxième tour, peuvent participer uniquement les candidats ayant obtenu au moins 12.5% des voix au premier tour.
Vous devez écrire un algorithme qui permet la saisie des scores de quatre candidats au premier tour.

  Cet algorithme traitera ensuite le candidat numéro 1 (et uniquement lui) : il dira s’il est élu, battu, s’il se trouve en ballottage favorable (il participe au second tour en étant arrivé en tête à l’issue du premier tour) ou défavorable (il participe au second tour sans avoir été en tête au premier tour).


```

VARIABLE

candidat1 est un NOMBRE ENTIER
candidat2 est un NOMBRE ENTIER
candidat3 est un NOMBRE ENTIER
candidat4 est un NOMBRE ENTIER


TRAITEMENT

	ECRIRE "Score du candidat 1: "
	LIRE candidat 1
	ECRIRE "Score du candidat 2: "
	LIRE candidat 2
	ECRIRE "Score du candidat 3: "
	LIRE candidat 3
	ECRIRE "Score du candidat 4: "
	LIRE candidat 4




RESULTAT

SI score > 50 ALORS
ECRIRE "Candidat élu au 1er tour"
SINON IF score > 12.5 ALORS
ECRIRE "Candidat battu"
SINON SIU candidat1 > candidat2, candidat3, candidat4 ALORS
ECRIRE "Candidat en ballottage favorable
SINON
ECRIRE "Candidat en ballottage défavorable" 


```
