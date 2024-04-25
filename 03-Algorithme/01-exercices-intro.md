# POUR FACILITER LE DEROULEMENT DU PSEUDO CODE ==> ENUMERER LES ETAPES UNE PAR UNE

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

# Exercice 1.4 : Calcul de l’aire et du volume d’une sphère
Lire le rayon R d’une sphère puis calculer et afficher :

- Son aire = 4 π R²
- Son volume = (4 π R³)/3

`resultat <-- 4 * 3.14 POW(rayon, 3)`

```
 VARIABLE
 numero est un NOMBRE ENTIER
 4 est un nombre REEL
 π est un NOMBRE REEL
 3 est un NOMBRE REEL
 resulatAire est un NOMBRE REEL
 resultatVolume est un NOMBRE REEL

 TRAITEMENT
    ECRIRE "saisissez votre nombre"
    LIRE nombre

    resultatAire <-- 4 * 3.14 * nombre² 
    resultatAire <-- 4 * 3.14 * POW(nombre, 2)

    resultatVolume <-- 4/3 * 3.14 * nombre³
    resultatVolume <-- 4 * 3.14 * POW(nombre, 3) / 3

RESULTAT
SI
resultatAire  
    ECRIRE "l'aire de votre sphère", est", resulatatAire",
SI
resultatVolume
    ECRIRE "le volume de votre sphère est de : ",
    LIRE resultatAire
    FIN SI 

```
# Exercice 1.5 : Calcul de la surface d’un secteur circulaire
Lire le rayon R d’un cercle et un angle A (en degré(s)).

Calculer et afficher :

L’ aire du secteur circulaire = (π R² A) / 360

VARIABLE
rayon est un NOMBRE ENTIER
corner est un NOMBRE ENTIER
π est un NOMBRE REEL
surfaceSecteur est un NOMBRE REEL

TRAITEMENT
    ECRIRE "Saisissez votre rayon"
    LIRE rayon
    ECRIRE "Saisissez l'angle"
    LIRE angle

    surfaceSecteur <-- Math.PI * Mathpow(rayon²) * corner / 360

RESULTAT
surfaceSecteur
ECRIRE "L'aire du secteur circulaire esr de: ", surfaceSecteur"
FIN SI
```
```

# Exercice 1.6 : Inversion de 2 valeurs

1- Lire 2 nombres entier A et B.
2- Afficher la valeur de A puis la valeur de B.
3- Mettre le contenu de A dans B et celui de B dans A.
4- Afficher à nouveau la valeur de A puis la valeur de B.


VARIABLE

nombreA est UN NOMBRE ENTIER
nombreB est UN NOMBRE ENTIER

TRAITEMENT
    ECRIRE "Veuillez entrer votre nombre" 
    LIRE le nombreA
    ECRIRE "Veuillez entrer votre nombre"
    LIRE le nombreB
  
    LIRE nombreB

    LIRE nombreA

    LIRE nombreB

    LIRE nombreA




```

