# Projet-3---ES-querying-a-CV-bank -Nayani GEORGE CLEMENT & Octave MONVOISIN

Pour lancer le projet, dans un premier temps démarrez ElasticSearch dans un terminal puis lancer le projet à partir de Intellij.

Depuis votre navigateur, accédez à http://localhost:8080/ . 

La page HTML affichée se divise en deux parties.

La première partie n'est utilisable qu'après avoir mis au moins un CV (au format pdf uniquement) dans la base de données.

La base de données de CV est créée de la façon suivante : "create table cv (id integer not null, description varchar(255), file blob, name varchar(255), tag varchar(255), primary key (id))"

Elle permet de sauvegarde les fichier PDF dans la base de données avec la variable file. 

Au moment de l'ajout, une page dont le contenu est "Succès" s'affichera. Il n'y a pas de bouton pou revenir en arrière, cette page permet juste au client de savoir que le PDF a été pris en compte.

Dans la seconde partie, on pourra faire des recherche à partir des tag. 

Dans la zone Search on mettra un tag comme par exemple "Java", le programme va chercher dans la base de données tous les CVs qui contiennent ce tag et va afficher le json.
