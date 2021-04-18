# XScene
 Language de description de scene 3D



**Timothée DURGEAUD**

Documentation Xscene

Ce document a pour rôle de présenter une spécification du langage Xscene,

langage réalisé dans le cadre d’un projet pour le cours de Compilation pour

l’Imagerie Numérique de l’ESIR. Il vient compléter un rapport concernant la

création de ce langage.

Dans ce document nous reviendrons donc plus en détail sur les différentes

fonctionnalités du langage, sa structure et sa compilation via une application

tierces.

**1) Structure du langage**

Xscene repose sur un principe similaire à XML. Des entité sont décrites dans des balises.

En fonction de l’entité, des options sont proposé pour compléter sa description.

Trois types de balises sont proposé par le langage, les balises complète, les balises de

description et les balises de fin.

Les balises de description et de fin sont connectés l’une à l’autre. La balise de description

permet la description d’une entité en elle même et la balise de fin met fin à cette

description. Entre ces deux balises peuvent se trouver d’autres balises, celle-ci décrivent

les entités filles de l’entité décrite dans la balise de description qui les contient. Une

entité fille doit forcément finir sa description avant la fin de la description de son entité

mère. Ces balises ne peuvent pas exister seulement par elles-même, elles doivent

forcément contenir des balises complète, soit directement soit via les enfants de l’entité.

Ces deux balises se présente sous la forme suivante :


<entité options > : balise de description

</entité> : balise de fin


Les balises complète sont des balises décrivant des entité ne pouvant pas contenir

d’enfant. Elle peuvent exister sans les balises précédentes où être filles des entités

décrite par celle-ci.

Ces balises se présente sous la forme suivante :


<entité options />



L’encapsulation des balises indique la relation entre les entités. Deux entités soeur

peuvent par exemple subir la même transformation si celle-ci est affecté à l’un de leur

ancêtre (parent, grand-parent, etc..).

Un document Xscene est composé de 4 partie :

● Corps du document :

	○ Le contenu de la scène décrite

● Définition d’entités :

	○ Partie facultative

	○ Définition d’entités appartenant à la scène mais n’étant pas contenu dans le langage par défaut

	○ Se trouve au début du corps du document

● Définition de la scène :

	○ Définition de la scène en elle même avec des entité du langage ou définit par l’utilisateur

	○ Se trouve après la définition d’entités

● Commentaires :
	
	○ Peuvent être partout dans le document

	○ Syntaxe : // commentaire ou /\*commentaire\*/


**2) Eléments du langage**

Les balises permettent la définition d’entité appartenant à la scène, celle-ci sont décrit par

des éléments du langage Xscene.

**I. Pré-requis**

Les options permettant de décrire une entité nécessite généralement l’utilisation

de certains type. Leur syntaxe est la suivante :

Type

Description

Syntaxe

Exemples

Constante

Entier ou flottant pouvant être INT ou FLOAT

négatif

ex 1 : 1.0

ex 2 : -2

ex 3 : 3

ex 4 : 3e4

(1.0,1.0,2.1)

Vect3D

Vecteur de dimension 3 dont (constante,constante,

constante)

les valeurs sont associés

5





dans l’ordre à x, y et z

Vect2D

Vecteur de dimension 3 dont (constante,constante)

les valeurs sont associés

(1,1)

dans l’ordre à x, y et z

String

ID

Chaine de caractère, définit

entre guillemets

“text”

text

“Hello

World”

Hello

Chaine de caractère sans

espace ne contenant que des

lettres ou des chiffres

Dans la suite lorsque la syntaxe présentera un type il sera mis en italique pour préciser

qu’il doit être remplacé par la syntaxe qui lui est propre.

**II. Scene**

Partie du document associés : Corps du documents

Définition : elément permettant l’initialisation de la scène il contient l'entièreté du

document. Un document Xscene se doit de commencer par une balise de

définition de scène et de finir par une balise de fin de scène. L’élément ne peut

apparaître qu’une fois par scène.

Syntaxe :

<scene name : String>

Corps du document

</scene>

Avec String le nom de la scène.

**III. Define**

Partie du document associés : Définition d’entités

Définition : elément permettant la définition d’élément qui ne sont pas contenu par

défaut dans le langage. Il est contenu dans une balise complète. Il peut créer 3

type d’élément.

Syntaxe par type :

6





A. Material

Définition : Définition d’un nouveau matériau que l’on pourra associé à une

géométrie dans la scène.

Syntaxe : <define mat : ID **options** />

Avec ID un identifiant par lequel l’élément sera plus tard appelé.

Les options disponible pour ce type sont les suivante, elles sont données

dans l’ordre par lequel elle doivent être appelées, si elles ne sont pas

appelés, elle prendront leur valeur par défaut :

Option

Définition

Statut

Valeur par

défaut

Syntaxe

Exemple

colorTypeINT Variable précisant

que les valeurs

Non

obligatoire

false

colorTypeIN

<define mat : m1

T

colorTypeINT />

des couleurs

déclarés se

trouvent dans

l’intervalle [0,256]

au lieu de [0,1]

Couleur

Couleur ambiente

associé au

matériau, ses

Non

obligatoire

(1,1,1)

Ka : Vect3D

<define mat : m1

ambiante

Ka : (0,1,0) />

(blanc ou

valeurs doivent se

trouver dans [0,1]

ou [0,256] en

fonction de

noir si

colorTypeIN

T est activé)

colorTypeINT

Couleur

Couleur diffuse

associé au

Non

obligatoire

Valeur de la

Kd : Vect3D

Ks : Vect3D

<define mat : m1

diffuse

couleur

Kd : (0,1,0) />

matériau, ses

valeurs doivent se

trouver dans [0,1]

ou [0,256] en

fonction de

ambiante

colorTypeINT

Couleur

Couleur spéculaire Non

associé au

matériau, ses

Valeur de la

<define mat : m1

Spéculaire

obligatoire

couleur

Ks : (0,1,0) />

ambiante

valeurs doivent se

trouver dans [0,1]

7





ou [0,256] en

fonction de

colorTypeINT

Indice de

Indice de

Non

obligatoire

1.0

shine :

<define mat : m1

spécularité

spécularité du

matériau, doit être

compris dans

[0,128]

constante

shine : 128 />

Chemin vers

Chemin vers une

texture associé au obligatoire

matériau. La

texture doit être un

fichier contenant

une image

Non

null

textFile :

<define mat : m1

une texture

String

textX :

textFile :

(Pas de

“image.bmp”/>

texture

associé)

Taille X de la Taille de la texture Obligatoire

1.0

<define mat : m1

texture

selon l’axe X

seulement

avec

utilisation de

textY,

constante

textFile :

“image.bmp” textX

: 2.0 textY : 3.0/>

disponible

seulement

avec textFile

Taille Y de la Taille de la texture Obligatoire

1.0

textY :

<define mat : m1

texture

selon l’axe Y

seulement

avec

constante

textFile :

“image.bmp” textX

: 2.0 textY : 3.0/>

utilisation de

textY,

disponible

seulement

avec textFile

B. Shape

Définition : Définition d’une nouvelle géométrie que l’on pourra associé à

la scène.

Syntaxe : <define shape **options** />

Les options disponible pour ce type sont les suivante, elles sont données

dans l’ordre par lequel elle doivent être appelées, si elles ne sont pas

appelés, elle prendront leur valeur par défaut. Les options séparés par la

ligne en pointillé ne peuvent pas être utilisés ensemble :

8





Option

Définition

Statut

Valeur par

défaut

Syntaxe

Exemple

Chemin

.obj contenant une

fichier obj description d’une ou

plusieurs géométries

Chemin vers un fichier Obligatoire

Aucune

objectFile :

<define shape

vers un

si l’on

n’utilise pas

son

String

objectFile :

“Object.obj” />

alternative

Identifiant Identifiant de la

Obligatoire

si l’on

n’utilise pas

son

Aucune

Aucune

Aucune

Aucune

: ID

<define shape :

géométrie créée

triangle

<vertex (0,0.5,0)/>

alternative

<vertex

Vertexs

Définition de vertex

associé à la nouvelle

géométrie, contenue

dans des balises

complète

1 définition

minimum

obligatoire

dans cette

alternative

<vertex

(-0.5,-0.5,0)/>

<vertex

vect3D/>

(0.5,-0.5,0)/>

<normal (0,1,0)/>

<normal

Normals

Définition de normals

associé à la nouvelle

géométrie, contenue

dans des balises

complète

1 définition

minimum

obligatoire

dans cette

alternative

<normal

vect3D/>

(-1.41,-1.41,0)/>

<normal

(1.41,-1.41,0)/>

Coordonn Définition de

1 définition

minimum

obligatoire

dans cette

alternative

<txtCoord

ées de

coordonnées de

vect3D/>

<txtCoord (0,0)/>

<txtCoord (1,0)/>

<txtCoord (0,1)/>

<face s1 : 0/0/0 s2 :

textures

texture associé à la

nouvelle géométrie,

contenue dans des

balises complète

Faces

Définition de 3 vertice

associé à la nouvelle

1 définition

minimum

Aucune

<face s1 :

constante/c

onstante/co

nstante

s2 :

constante/c

onstante/co

nstante

s3 :

constante/c

onstante/co

nstante

/>

1/1/1 s3 : 2/2/2 />

/>

géométrie formant une obligatoire

face de celle-ci,

dans cette

alternative

contenue dans des

balises complète.

Chaque vertices

contient dans l’ordre,

le numéro de la

définition d’un vertex,

le numéro de la

définition d’une vertex,

le numéro de la

définition d’une

coordonnées de

9





texture, dans l’ordre

dans lesquels elles ont

été définis plus tôt.

C. Animation

Définition : Définition d’une transformation que l’on pourra associé à une

géométrie de la scène.

Syntaxe : <define anim : ID **options** />

Avec ID un identifiant par lequel l’élément sera plus tard appelé.

Les options disponible pour ce type sont les suivante, elles sont données

dans l’ordre par lequel elle doivent être appelées, si elles ne sont pas

appelés, elle prendront leur valeur par défaut. Les options séparés par la

ligne en pointillé ne peuvent pas être utilisés ensemble :

Option

Définition

Statut

Valeur par

défaut

Syntaxe

Exemple

Type

Spécifie que

l’animation créée

sera de type

translation

Obligatoire

si l’on

n’utilise pas

ses

Aucune

type : tr

<define

Translatio

anim:a1 type

n

: tr stop :

(0,1,0) … />

alternatives

Point visé

Point vers lequel la

transformation va

guider ses fils

Obligatoire

pour cette

alternative

Aucune

Aucune

stop : vect3D

type : rot

Type

Spécifie que

l’animation créée

Obligatoire

si l’on

<define

Rotation

anim:a1 type

sera de type rotation n’utilise pas

: rot ang : 20

ses

… />

alternatives

Angle

Angle duquel la

rotation aura tourné pour cette

à la fin de

l’animation

Obligatoire

Aucune

Aucune

ang :

constante

alternative

Type Scale Spécifie que

l’animation créée

sera de type scale

Obligatoire

si l’on

n’utilise pas

type : sc

<define

anim:a1 type

: sc size : 2 …

10





ses

/>

alternatives

Ratio

Ratio par lequel la

Obligatoire

Aucune

Size :

mise à l’échelle aura pour cette

augmenté à la fin de alternative

l’animation

constante

Options finales commune pour les 3 alternatives

Temps de

Temps à partir

duquel l’animation

va commencé, en

seconde.

Non

obligatoire

0

start :

<define

départ

constante

time :

anim:a1 type

: rot start :

20 … />

Durée de

Durée de l’animation Obligatoire

Aucune

<define

l’animation , en seconde.

constante

anim:a1 type

: sc size : 2

time : 3 />

**IV. Node**

Partie du document associés : Définition de la scène

Définition : elément permettant la description d’un noeud du graphe de scène.

Ses fils peuvent être des node, object ou sub-tree mais doivent se finir par un

object ou sub-tree.

Syntaxe :

<node name : String **options** >

…

</node>

Avec String une chaine de caractère par lequel l’élément sera plus tard appelé.

Options par type :

A. Group

Définition : Définition d’une relation entre les enfants du noeud.

Syntaxe : <node name : String type : Group/>

11





B. Transform

Définition : Définition d’une transformation sur les enfants du noeud.

Syntaxe par type :

\1. Rotation

Définition : Définition d’une rotation sur les enfants du noeud.

Syntaxe : <node name : String type : Transform type :

rotation **options** />

Les options disponible pour ce type sont les suivante, elles sont

données dans l’ordre par lequel elle doivent être appelées, si elles

ne sont pas appelés, elle prendront leur valeur par défaut :

Option

Définition

Statut

Valeur par

défaut

Syntaxe

Exemple

angle

Angle duquel les

enfants du noeud

vont tourner

Obligatoire

Aucune

angle :

<node name : “rot”

constante

type : Transform

type : rotation

angle : 20 >

axe X

Valeur x du

vecteur selon

lequel l’angle

s’effectue

Non

obligatoire

1.0 si aucun

axeX :

<node name : “rot”

axe n’est

constante

axeY :

type : Transform

défini, 0

type : rotation

sinon

angle : 20

axeX : 2 >

axe Y

Valeur y du

vecteur selon

lequel l’angle

s’effectue

Non

obligatoire

0

<node name : “rot”

constante

type : Transform

type : rotation

angle : 20

axeY : 1 >

axe Z

Valeur z du

vecteur selon

lequel l’angle

s’effectue

Non

obligatoire

0

“”

axeZ :

<node name : “rot”

constante

anim : ID

type : Transform

type : rotation

angle : 20

axeZ : 1 >

Animation

Animation associé Non

à la transformation obligatoire

récupéré par son

<node name : “rot”

type : Transform

type : rotation

angle : 20

identifiant

12





anim : a1 >

\2. Translation

Définition : Définition d’une translation sur les enfants du noeud.

Syntaxe : <node name : String type : Transform type :

translation **options** />

Les options disponible pour ce type sont les suivante, elles sont

données dans l’ordre par lequel elle doivent être appelées, si elles

ne sont pas appelés, elle prendront leur valeur par défaut :

Option

Définition

Statut

Valeur par

défaut

Syntaxe

Exemple

X

Valeur x du

vecteur direction

de la translation

Non

obligatoire

0

0

0

“”

x : constante <node name : “tr”

type : Transform

type : translation

x : 1 >

Y

Valeur y du

vecteur direction

de la translation

Non

obligatoire

y : constante <node name : “tr”

type : Transform

type : translation

y : 1 >

Z

Valeur z du

vecteur direction

de la translation

Non

obligatoire

z : constante <node name : “tr”

type : Transform

type : translation

z : 1 >

Animation

Animation associé Non

à la transformation obligatoire

récupéré par son

anim : ID

<node name : “tr”

type : Transform

type : translation

anim : a1 >

identifiant

\3. Scale

Définition : Définition d’une mise à l’échelle sur les enfants du

noeud.

13





Syntaxe : <node name : String type : Transform type :

scale **options** />

Les options disponible pour ce type sont les suivante, elles sont

données dans l’ordre par lequel elle doivent être appelées, si elles

ne sont pas appelés, elle prendront leur valeur par défaut. Les

options séparés par la ligne en pointillé ne peuvent pas être

utilisés ensemble :

Option

Définition

Statut

Valeur par

défaut

Syntaxe

Exemple

Ratio globale Ratio sur tous les

axes selon lequel

les enfant du

Non

obligatoire

0

ratio :

<node name : “sc”

constante

type : Transform

type : scale

noeud vont

ratio : 2 >

changer de taille

Ratio par axe Ratio des axes

choisis selon

Non

obligatoire

(0,0,0)

ratioXYZ :

<node name : “sc”

vect3D

type : Transform

lequel les enfant

du noeud vont

type : scale

ratioXYZ : (2,0,1) >

changer de taille

Options finales commune pour les 2 alternatives

Animation

Animation associé Non

à la transformation obligatoire

récupéré par son

“”

anim : ID

<node name : “sc”

type : Transform

type : scale

anim: a1 >

identifiant

**V. Object**

Partie du document associés : Définition de la scène

Définition : elément permettant la description d’une géométrie appartenant à la

scène

Syntaxe : <object name : String **options** />

Avec String une chaine de caractère par lequel l’élément sera plus tard appelé.

Options par type :

14





A. Cône

Définition : Définition d’un cône.

Syntaxe : <object name : String shape : Cone **options** />

Les options disponible pour ce type sont les suivante, elles sont données

dans l’ordre par lequel elle doivent être appelées, si elles ne sont pas

appelés, elle prendront leur valeur par défaut :

Option

Définition

Statut

Non

Valeur par

défaut

Syntaxe

Exemple

Taille de la

Rayon définissant

le cercle formant la obligatoire

base du cône

25

base :

<object

base

constante

name:”cone”

shape : Cone

base : 50 />

<object

Hauteur

Hauteur du cône

Non

obligatoire

25

height :

constante

slices : INT

name:”cone”

shape : Cone

height: 50 />

<object

Nombre de

Nombre de

subdivision du

cône autour de

l’axe Z.

Non

obligatoire

100

subdivision

name:”cone”

autour de

shape : Cone

l’axe Z.

slices : 4 />

<object

Nombre de

Nombre de

subdivision du

cône le long de

l’axe Z.

Non

obligatoire

20

stack : INT

mat : ID

subdivision

name:”cone”

le long de

shape : Cone

l’axe Z.

stack : 2 />

<object

Matériau

Associé un

Non

obligatoire

Matériau

matériau par son

identifiant à la

géométrie

blanc

name:”cone”

shape : Cone

mat : m1/>

B. Cube

Définition : Définition d’un cube.

Syntaxe : <object name : String shape : Cube **options** />

15





Les options disponible pour ce type sont les suivante, elles sont données

dans l’ordre par lequel elle doivent être appelées, si elles ne sont pas

appelés, elle prendront leur valeur par défaut :

Option

Définition

Statut

Valeur par

défaut

Syntaxe

Exemple

Taille du

Taille du cube

selon toute les

dimensions

Non

obligatoire

50

size :

<object

cube

constante

name:”cube”

shape : Cube

size : 25 />

<object

Matériau

Associé un

Non

obligatoire

Matériau

mat : ID

matériau par son

identifiant à la

géométrie

blanc

name:”cube”

shape : Cube

mat : m1/>

C. Cylinder

Définition : Définition d’un cylindre.

Syntaxe : <object name : String shape : Cylinder **options** />

Les options disponible pour ce type sont les suivante, elles sont données

dans l’ordre par lequel elle doivent être appelées, si elles ne sont pas

appelés, elle prendront leur valeur par défaut :

Option

Définition

Statut

Non

Valeur par

défaut

Syntaxe

Exemple

Taille de la

Rayon définissant

le cercle formant la obligatoire

base du cylindre

50

base :

<object name:”cyl”

base

constante

shape : Cylinder

base : 25 />

Taille du

Rayon définissant

le cercle formant le obligatoire

sommet du

Non

50

top :

<object name:”cyl”

sommet

constante

height :

shape : Cylinder

top : 25 />

cylindre

Hauteur

Nombre de

Hauteur du

cylindre

Non

obligatoire

50

<object name:”cyl”

constante

shape : Cylinder

height: 25/>

Nombre de

subdivision du

Non

obligatoire

100

slices : INT

<object name:”cyl”

subdivision

shape : Cylinder

16





autour de

cylindre autour de

l’axe Z.

slices : 4 />

l’axe Z.

Nombre de

Nombre de

Non

obligatoire

20

stack : INT

mat : ID

<object name:”cyl”

subdivision

subdivision du

cylindre le long de

l’axe Z.

shape : Cylinder

le long de

stack : 2 />

l’axe Z.

Matériau

Associé un

Non

obligatoire

Matériau

<object name:”cyl”

matériau par son

identifiant à la

géométrie

blanc

shape : Cylinder

mat : m1/>

D. Sphere

Définition : Définition d’une sphère.

Syntaxe : <object name : String shape : Sphere **options** />

Les options disponible pour ce type sont les suivante, elles sont données

dans l’ordre par lequel elle doivent être appelées, si elles ne sont pas

appelés, elle prendront leur valeur par défaut :

Option

Définition

Statut

Valeur par

défaut

Syntaxe

Exemple

Rayon

Rayon de la sphère Non

obligatoire

50

rad :

<object name:”sp”

constante

shape : Sphere

rad : 25 />

Nombre de

Nombre de

Non

obligatoire

100

slices : INT

<object name:”sp”

subdivision

subdivision de la

sphère autour de

l’axe Z.

shape : Sphere

autour de

slices : 4 />

l’axe Z.

Nombre de

Nombre de

Non

obligatoire

100

stack : INT

mat : ID

<object name:”sp”

subdivision

subdivision de la

sphère le long de

l’axe Z.

shape : Sphere

le long de

stack : 2 />

l’axe Z.

Matériau

Associé un

Non

obligatoire

Matériau

<object name:”sp”

matériau par son

identifiant à la

géométrie

blanc

shape : Sphere

mat : m1/>

17





E. Teapot

Définition : Définition d’une théière.

Syntaxe : <object name : String shape : Teapot **options** />

Les options disponible pour ce type sont les suivante, elles sont données

dans l’ordre par lequel elle doivent être appelées, si elles ne sont pas

appelés, elle prendront leur valeur par défaut :

Option

Définition

Statut

Valeur par

défaut

Syntaxe

Exemple

Taille de la

Taille de la théière Non

50

size :

<object name:”tpt”’

théière

selon toute les

dimensions

obligatoire

constante

shape : Teapot

size : 25 />

Matériau

Associé un

Non

obligatoire

Matériau

mat : ID

<object name:”tpt”

matériau par son

identifiant à la

géométrie

blanc

shape : Teapot

mat : m1/>

F. Tetrahedron

Définition : Définition d’un tetrahedron.

Syntaxe : <object name : String shape : Tetrahedron **options** />

Les options disponible pour ce type sont les suivante, elles sont données

dans l’ordre par lequel elle doivent être appelées, si elles ne sont pas

appelés, elle prendront leur valeur par défaut :

Option

Définition

Statut

Valeur par

défaut

Syntaxe

Exemple

Matériau

Associé un

Non

obligatoire

Matériau

mat : ID

<object name:”tet”

matériau par son

identifiant à la

géométrie

blanc

shape :

Tetrahedron

mat : m1/>

18





G. Torus

Définition : Définition d’un torus.

Syntaxe : <object name : String shape : Torus **options** />

Les options disponible pour ce type sont les suivante, elles sont données

dans l’ordre par lequel elle doivent être appelées, si elles ne sont pas

appelés, elle prendront leur valeur par défaut :

Option

Définition

Statut

Valeur par

défaut

Syntaxe

Exemple

Rayon

Rayon total du

Torus

Non

obligatoire

10

inRad :

<object name:”tor”

interne

constante

shape : Torus

inRad : 15/>

Rayon

Rayon des cercles Non

25

100

outRad :

<object name:”tor”

externe

formant le torus

obligatoire

constante

sides : INT

shape : Torus

outRad : 30/>

Nombre de

Nombre de

Non

<object name:”tor”

subdivision

subdivision par

cercle composant

le torus

obligatoire

shape : Torus

par cercle

sides : 25/>

Nombre de

Nombre de cercle

composant le torus obligatoire

Non

15

rings : INT

mat : ID

<object name:”tor”

cercle

shape : Torus

rings: 4 />

Matériau

Associé un

Non

obligatoire

Matériau

<object name:”tor”

matériau par son

identifiant à la

géométrie

blanc

shape : Torus

mat : m1/>

H. Defined

Définition : Lien vers une géométrie défini par l’utilisateur.

Syntaxe : <object name : String shape : Defined **options** />

Les options disponible pour ce type sont les suivante, elles sont données

dans l’ordre par lequel elle doivent être appelées, si elles ne sont pas

appelés, elle prendront leur valeur par défaut :

19





Option

Définition

Statut

Valeur par

défaut

Syntaxe

Exemple

Nom de

Nom de l’objet que Obligatoire

l’on cherche à

récupérer

Aucune

name : ID

<object name:”def”

l’objet

shape : Defined

name : o1 />

Matériau

Associé un

Non

obligatoire

Matériau

mat : ID

<object name:”def”

matériau par son

identifiant à la

géométrie

blanc

shape : Defined

name : o1

mat : m1/>

**VI. Sub-Tree**

Partie du document associés : Définition de la scène

Définition : elément permettant de copier un noeud ou un objet déjà créer.

Syntaxe : <getSbtree name : String />

Avec String une chaine de caractère par lequel l’élément est appelé.

**3) Compilation**

Afin d’afficher une scène à partir d’un document Xscene, il faudra créer une application

utilisant openGL 1.0, la librairie lib3D, la librairie antlr et les classes permettant la

compilation du langage, GraphSceneLexer et GraphSceneParser.

L’application devra avoir deux partie relative au langage :

**Initialisation de la scène**

**Rendu de la scène**

**-**

**-**

**I. Initialisation**

Afin d’initialiser une scène il faut pouvoir accéder à un fichier contenant sa

description et compiler ce fichier. Pour cela on utilise le lexer et parser du

langage.

Syntaxe :

FileReader reader = new FileReader(“Chemin vers le fichier") ;

20





GraphSceneLexer lexer = new GraphSceneLexer(new

ANTLRReaderStream(reader));

GraphSceneParser parser = new GraphSceneParser(new

CommonTokenStream(lexer)) ;

L’objet parser contient alors les informations de la compilation du fichier. On

pourra alors récupérer la racine du graphe de scène. Celle-ci sera du type Group

de la librairie lib3D.

Syntaxe : Group m\_root = parser.graph();

L’objet m\_root contient alors la racine du graphe de scene.

Dans le cas où l’on utilise des texture il sera aussi nécessaire de récupérer la

librairie de matériaux associer à la scène et de les enregistrer dans openGL.

Syntaxe :

final GL2 gl = glDrawable.getGL().getGL2();

materialLib = parser.materialLib;

materialLib.registerTextures(gl) ;

On a alors tout les éléments pour rendre la scène dans l’application.

ex :

public void init(GLAutoDrawable glDrawable) {

final GL2 gl = glDrawable.getGL().getGL2();

// On recupere le chemin vers la scène

System.out.println("Quelle scène souhaitez-vous charger ? ");

Scanner sc = new Scanner(System.in);

String t\_sceneName = sc.nextLine();

sc.close();

try {

// Compilation du fichier contenant la scène

FileReader reader = new

FileReader("data/scenesDescription/"+t\_sceneName+".sc"

) ;

GraphSceneLexer lexer = new GraphSceneLexer(new

ANTLRReaderStream(reader));

21





GraphSceneParser parser = new GraphSceneParser(new

CommonTokenStream(lexer)) ;

// On recupère la racine du graphe

m\_root = parser.graph();

// On recupere la librairie de matériaux

materialLib = parser.materialLib;

System.out.println("You just started the scene " +

parser.sc\_name);

materialLib.setTexturePath("data");

materialLib.registerTextures(gl) ; // Charge et enregistre

les textures au niveau d'OpenGL

}

catch (Exception e) {

System.out.println("ERROR "+e.getMessage());

}

}

**II. Rendu**

Le rendu sera effectué chaque frame. Si la scène contient des animations il faudra

alors la mettre à jour à chaque rendu.

Syntaxe : m\_root.update();

On pourra alors effectuer le rendu de la scène.

Syntaxe : m\_root.draw(glDrawable);

On peut alors lancer l’application et l’on obtient un rendu de la scène se mettant à

jour chaque frame et pouvant contenir des textures sur des géométries.

ex :

public void display(GLAutoDrawable glDrawable) {

// Maj de la scene

m\_root.update();

// rendu de la scene

m\_root.draw(glDrawable);

}

22

