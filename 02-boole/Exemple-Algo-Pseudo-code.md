#  j’irai me promener s’il fait plus de 25°C et qu’il ne pleut pas, ou si ma copine le veut.

**Soit les propositions** :
• P1 : " j’irai me promener " 
• P2 : " il fait plus de 25°C " 
• P3 : " il pleut " 
• P4 : " ma copine veut se promener "

Le problème se décrit par :
P1 est vraie si P2 est vraie ET P3 est fausse, ou si P4 est vraie.
Soit :
P1=(P2 ET NON P3) OU P4

## Algorithme (Pseudo code)

**Variables**

- `sePromener` est une BOOLEEN
- `ilFaitPlusDe25` est une BOOLEEN
- `ilPleut` est une BOOLEEN
- `maCopineVeutSePromener` est une BOOLEEN

**Traitement**

```
ECRIRE "Fait-il plus de 25 degrés"
LIRE ilFaitPlusDe25

ECRIRE "Pleut-il"
LIRE ilPleut

ECRIRE "est-ce que ma copine veut se promener
LIRE maCopineVeutSePromener

SI ilFaitPluseDe25 est `VRAI` ET ilPleut est `FAUX` OU maCopineVeutSePromener est `VRAI`
    sePromener <-- VRAI
    sePromener := VRAI  // notation alternative
SINON ALORS
    sePromener <-- FAUX
FIN SI

```

**RESULTAT**

SI sePromener est `VRAI` ALORS
    ECRIRE "Tu peux aller te promener"
SINON ALORS
    ECRIRE "Tu restes chez toi"
FIN SI

**FIN PROGRAMME**
