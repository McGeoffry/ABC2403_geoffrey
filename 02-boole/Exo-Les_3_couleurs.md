Soient 3 couleurs:

Cb 	= 	couleur de base
Cad1 	= 	1ère couleur additionnelle 
Cad2 	= 	2ème couleur additionnelle 
Cr 	= 	couleur résultat

Pour chacune des affirmations suivantes, vous présenterez:
•	La table de vérité à partir des propositions données
•	L'expression booléenne simplifiée. Pour cet énoncé, vous disposez des fonctions logiques ET (.), OU (+) et NON ( )

# I.	Le résultat attendu est Cr = couleur très claire.
Cr est de type "très claire" si les 2 couleurs additionnelles sont blanches. Le blanc étant exclu de cette catégorie, la couleur de base ne doit pas être blanche

## Propositions

- P1 : Cr = très claire
- P2 : cb = bleu
- P3 : Cad1 = blanc
- P4 : Cad2 = blanc 

| Entrée | Entrée | Entrée |  | Sortie |
| --- | --- | --- | --- | --- |
| P2 | P3 | P4 | = | P1 |
| 0 | 0 | 0 | = | 0 |
| 1 | 1 | 1 | = | 1 |
| 1 | 0 | 0 | = | 0 |
| 1 | 0 | 1 | = | 0 |
| 1 | 1 | 0 | = | 0 |
| 0 | 0 | 1 | = | 0 |
| 0 | 1 | 0 | = | 0 |

## Expression algébrique correspondante

P1 est `VRAI` si P3 est `VRAI` et si P4 est `VRAI`

`P1 = P3 . P4`

### Algorithme simplifié

VARIABLES
P1 est BOOLEEN
P3 est BOOLEEN
P4 est BOOLEEN

TRAITEMENT

SI P est `VRAI` ET P4 est `VRAI` ALORS
Ecrire 'La couleur est très claire