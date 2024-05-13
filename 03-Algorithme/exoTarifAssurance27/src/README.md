# Exercice 2.7 : Tarif Assurance
Une compagnie d’assurance automobile propose à ses clients quatre familles de tarifs identifiables par une couleur, du moins au plus onéreux :

Tarifs bleu, vert, orange et rouge.
Le tarif dépend de la situation du conducteur :

Un conducteur de moins de 25 ans et titulaire du permis depuis moins de deux ans, se voit attribuer le tarif rouge, si toutefois il n’a jamais été responsable d’accident. Sinon, la compagnie refuse de l’assurer.

Un conducteur de moins de 25 ans et titulaire du permis depuis plus de deux ans, ou de plus de 25 ans mais titulaire du permis depuis moins de deux ans a le droit au tarif orange s’il n’a jamais provoqué d’accident, ou le tarif rouge s’il a été repsonsable d’un accident, sinon il est refusé.

Un conducteur de plus de 25 ans titulaire du permis depuis plus de deux ans bénéficie du tarif vert s’il n’est à l’origine d’aucun accident et du tarif orange pour un accident, du tarif rouge pour deux accidents, et refusé au-delà

De plus, pour encourager la fidélité des clients acceptés, la compagnie propose un contrat de la couleur immédiatement la plus avantageuse s’il est assuré depuis plus de cinq ans. Ainsi, s’il satisfait à cette exigence, un client normalement “vert” devient “bleu”, un client normalement “orange” devient “vert”, et le “rouge” devient orange.

Ecrire l’algorithme permettant de saisir les données nécessaires (sans contrôle de saisie) et de traiter ce problème. Avant de se lancer à corps perdu dans cet exercice, on pourra réfléchir un peu et s’apercevoir qu’il est plus simple qu’il n’en a l’air (cela s’appelle faire une analyse !)…

```
VARIABLE 
ansPermis est un NOMBRE ENTIER
age est un NOMBRE ENTIER
accident est un ENTIER

TRAITEMENT
SI 
ansPermis <= 2 ET age < 25 ET accident = 0 )ALORS
ECRIRE "Vous êtes au tarif rouge"
SINON SI
(ansPermis > 2 ET age < 25) OU ( age > 25 ET ansPermis <= 2 Et accident = 0) ALORS
ECRIRE  "Vous êtes au tarif orange"
SINON SI
(ansPermis > 2 ET age < 25) OU ( age > 25 ET ansPermis <= 2 Et accident = 1) ALORS
SINON
ECRIRE "Vous êtes refusé"
SINON SI
(ans Permis > 2 ET age > 25 ET accident = 0) ALORS
ECRIRE "Vousêtes au tarif vert"
SINON SI
(ans Permis > 2 ET age > 25 ET accident = 1) ALORS
ECRIRE "Vousêtes au tarif orange"
SINON SI
(ans Permis > 2 ET age > 25 ET accident = 2) ALORS
ECRIRE "Vous êtes au tarif rouge"
SINON
ECRIRE "Vous êtes refusé" 


RESULTAT


```