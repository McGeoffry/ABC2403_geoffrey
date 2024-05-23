# Exercice 2a.5 : Ma bicyclette

Réalisez l’algorithme et le programme correspondant au texte ci-dessous :

S’il fait beau demain, j’irai faire une balade à bicyclette.

Je n’ai pas utilisé ma bicyclette depuis plusieurs mois, peut-être n’est-elle plus en parfait état de fonctionnement.

Si c’est le cas, je passerai chez le garagiste avant la balade. J’espère que les réparations seront immédiates sinon je devrai renoncer à la balade en bicyclette. Comme je veux de toute façon profiter du beau temps, si mon vélo n’est pas utilisable, j’irai à pied jusqu’à l’étang pour cueillir les joncs.

S’il ne fait pas beau, je consacrerai ma journée à la lecture. J’aimerais relire le 1er tome de Game of Thrones. Je pense posséder ce livre, il doit être dans la bibliothèque du salon.

Si je ne le retrouve pas, j’irai l’emprunter à la bibliothèque municipale. Si le livre n’est pas disponible, j’emprunterai un roman policier.

Je rentrerai ensuite directement à la maison.

Dès que j’aurai le livre qui me convient, je m’installerai confortablement dans un fauteuil et je me plongerai dans la lecture.

## Algorithme 

```
VARIABLES

beauTemps est un BOOLEEN
veloOk est un BOOLEEN
reparationsImmediates est un BOOLEEN
livrePossede est un BOOLEEN
livreDispoBibliotheque est un BOOLEEN

TRAITEMENT

SI beauTemps = VRAI ALORS
    ECRIRE "Je vais me balader"
    SI veloOk = VRAI ALORS
            ECRIRE "J'irai me balader à byciclette"
        SINON
            "J'irai chez lz garagiste"
        SI reparationsImmediates = VRAI ALORS
            ECRIRE "J'irai me balader à byciclette"   
    SINON 
            ECRIRE "J'irai cueillir des joncs"
        FIN SI
    FIN SI

SINON 
    ECRIRE "Je vais lire un livre"
        SI livrePossede = FAUX ALORS
            ECRIRE "Je vais à la bibliothèque"

            SI livreDispoBibliotheque = VRAI ALORS
                ECRIRE "Je rentre le lire"
            SINON  
                ECRIRE "j'empreinte un roman policier"
                ECRIRE "je rentre le lire dans le fauteuil"
            FIN SI
        FIN SI
FIN SI


RESULTAT 



```