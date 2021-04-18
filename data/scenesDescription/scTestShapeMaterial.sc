<scene name : "Test Shape material" >

	<define mat : red  Ka : (1,0,0) />

	<define mat : ifsic  textFile : "logo.png" />

	<define shape : triangle 
		<vertex (0,0.5,0)/>
		<vertex (-0.5,-0.5,0)/>
		<vertex (0.5,-0.5,0)/>
		<normal (0,1,0)/>
		<normal (-1.41,-1.41,0)/>
		<normal (1.41,-1.41,0)/>
		<txtCoord (0,0)/>
		<txtCoord (1,0)/>
		<txtCoord (0,1)/>
		<face s1 : 0/0/0 s2 : 1/1/1 s3 : 2/2/2 />
	/>

	<define shape : cube 
		// Cube du bas en partant du vertex devant gauche dans l'ordre des aiguille d'une montre
		<vertex (-0.5,-0.5,0.5)/>
		<vertex (-0.5,-0.5,-0.5)/>
		<vertex (0.5,-0.5,-0.5)/>
		<vertex (0.5,-0.5,0.5)/>
		// Cube du haut en partant du vertex devant gauche dans l'ordre des aiguille d'une montre
		<vertex (-0.5,0.5,0.5)/>
		<vertex (-0.5,0.5,-0.5)/>
		<vertex (0.5,0.5,-0.5)/>
		<vertex (0.5,0.5,0.5)/>
		<normal (-0.866,-0.866,0.866)/>
		<normal (-0.866,-0.866,-0.866)/>
		<normal (0.866,-0.866,-0.866)/>
		<normal (0.866,-0.866,0.866)/>
		<normal (-0.866,0.866,0.866)/>
		<normal (-0.866,0.866,-0.866)/>
		<normal (0.866,0.866,-0.866)/>
		<normal (0.866,0.866,0.866)/>
		<txtCoord (0,0)/>
		<txtCoord (1,0)/>
		<txtCoord (0,1)/>
		<txtCoord (1,1)/>
		// Face Avant
		<face s1 : 0/0/0 s2 : 3/3/1 s3 : 4/4/2 />
		<face s1 : 3/3/1 s2 : 7/7/3 s3 : 4/4/2 />
		// Face Gauche
		<face s1 : 0/0/1 s2 : 1/1/0 s3 : 4/4/3 />
		<face s1 : 1/1/0 s2 : 5/5/2 s3 : 4/4/3 />
		// Face Droite
		<face s1 : 3/3/0 s2 : 2/2/1 s3 : 7/7/2 />
		<face s1 : 2/2/1 s2 : 6/6/3 s3 : 7/7/2 />
		// Face Arriere
		<face s1 : 2/2/0 s2 : 1/1/1 s3 : 6/6/2 />
		<face s1 : 6/6/2 s2 : 1/1/1 s3 : 5/5/3 />
		// Face du bas
		<face s1 : 0/0/0 s2 : 1/1/2 s3 : 3/3/1 />
		<face s1 : 1/1/2 s2 : 2/2/3 s3 : 3/3/1 />
		// Face du haut
		<face s1 : 4/4/0 s2 : 5/5/2 s3 : 6/6/3 />
		<face s1 : 4/4/0 s2 : 7/7/1 s3 : 6/6/3 />
	/>

	<node name : "sc" type : Transform type : scale ratio : 100 >
		<object name : "Triangle" shape : Defined name : triangle mat : red />
	</node>

	<node name : "tr" type : Transform type : translation x : 150 >
		<node name : "sc2" type : Transform type : scale ratio : 100>
			<object name : "cube" shape : Defined name : cube mat : ifsic/>
		</node>
	</node>

</scene>