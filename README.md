# Projet-3---ES-querying-a-CV-bank -Nayani GEORGE CLEMENT & Octave MONVOISIN

Pour lancer le projet, dans un premier temps l'élasticSearch dans un terminal. Ensuite, il faut lancer à partir de l'intellij où se truve l'application Spring Boot.

Dans l'url, il suffira de taper : http://localhost:8080/ . 

On tombe une page HTML divise en deux partir.

La première partie est utilisable qu'après avoir mis au moins un CV de type PDF seulement dans la base de données.

La base de données du CV est créer de la façon suivante : "create table cv (id integer not null, description varchar(255), file blob, name varchar(255), tag varchar(255), primary key (id))"

Elle permet de sauvegarde le fichier PDF dans la base de données avec la variable file. 

Cependant, au moment de l'ajout, il va vous emmener une page dont le contenu "Succès". Il y a pas de bouton pou revenir en arrière. Cette page permet juste au client de savoir que le PDF a été pris en compte.

Dans la seconde partir, on pourra faire des recherche a base de tag. 

Dans la zone Search on mettra un tag comme par exemple contiennent "Java", il va chercher dans la base de données tous les Cvs qui continnent ce tag et va afficher le json.

