# La lumière d'un véhicule s'éclaire si une des deux portes avant est ouverte (capteurs pd et pg à coupure de circuit) ou si l'interrupteur du plafonnier est appuyé.

Présentez:

•	Les propositions

•	La table de vérité

•	L'expression booléenne simplifiée

# I.Propositions


## Proposition 1

Le véhicule a la porte avant droite ouverte 

Le véhicule a une des porte fermée

Le véhicule a l'interrupteur du plafonnier non appuyé

## Proposition 2

Le véhicule a la porte avant gauche ouverte 

Le véhicule a une des porte fermée

Le véhicule a l'interrupteur du plafonnier non appuyé

## Proposition 3

Le véhicule a une la portes avant droite ouverte

Le véhicule a une des portes fermée

Le véhicule a l'interrupteur du plafonnier appuyé

## Proposition 4

Le véhicule a une la portes avant gauche ouverte

Le véhicule a une des portes fermée

Le véhicule a l'interrupteur du plafonnier appuyé

## Propositions 5

Le véhicule a les 2 portes avant ouvertes

Le véhicule a l'interrupteur du plafonnier non appuyé

## Proposition 6

Le véhicule a les 2 portes avant fermées

Le véhicule a l'interrupteur du plafonnier appuyé

## Propositions 7

Le véhicule a les 2 portes avant ouvertes

Le véhicule a l'interrupteur du plafonnier appuyé

# II.La table de vérité

| pd | pg | i | L |
| --- | --- | --- | ---- |
 0|0 |0|0|
 0|1 |0|1|
 1|0 |0|1|
 0|0 |1|1|
 1|1 |0|1|
 1|1 |1|1|
 0|1 |1|1|
 1|0 |1|1|

# L'expression booléenne simplifiée

L = (pd+pg)+i

