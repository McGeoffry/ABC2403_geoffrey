# Exercice 1.1 : Hello World
Ecrire un programme qui affiche “Hello World !”.

```
ECRIRE "Hello World"
```
# Exercice 1.2 : Hello you
L’utilisateur est invité à saisir son prénom dans la console.

Le programme affiche “Bonjour “ suivi du prénom saisi.

```
VARIABLES
prenom est une CHAINE DE CARACTERES

TRAITEMENT
    ECRIRE "Saisissez votre prénom"
    LIRE prenom
    ECRIRE "bonjour prenom", prenom, "."
    FIN SI
```
Alternative avec contrôle sur la logueur du prénom

```
VARIABLES
    prenom est une CHAINE DE CARACTERES

TRAITEMENT
    ECRIRE "Saisissez votre prénom"
    LIRE prenom
    SI prenom.LONGUEUR > 2 ALORS
        ECRIRE "bonjour prenom", prenom, "."
    SINON
        ECRIRE "prenom invalide"
    FIN SI
```

# Exercice 1.3 : Calcul de la moyenne de 2 nombres
L’utilisateur est invité à saisir 2 nombres entier.

Le programme calcule la moyenne des 2 nombres et affiche le résultat sous forme de nombre décimal.

```
VARIABLES
12 est un NOMBRE ENTIER
81 est un NOMBRE ENTIER
46.5 est un NOMBRE REEL

TRAITEMENT
    ECRIRE "Saisissez 12"
    LIRE 12
    ECRIRE "Saisissez 81"
    LIRE 81
    
    moyenne <-- (12 + 81) / 2 

    RESULTAT

    ECRIRE "La moyenne de 12 et 81 est : 46.5"
FIN SI
```
```
VARIABLES
nombreUn est un NOMBRE ENTIER
nombreDeux est un NOMBRE ENTIER
resultat est un NOMBRE REEL

TRAITEMENT
    ECRIRE "Saisissez un premier nombre"
    LIRE nombreUn
    ECRIRE "Saisissez un second nombre"
    LIRE nombreDeux
    
    moyenne <-- (nombreUn + nombreDeux) / 2 
    
    RESULTAT
    
    ECRIRE "La moyenne de", nombreUn", et", nombreDeux", est", moyenne"
FIN SI
```