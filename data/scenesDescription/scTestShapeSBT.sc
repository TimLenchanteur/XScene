<scene name : "Foret" >
	
	<define mat : troncConifere  Ka : (0.6,0.6,0.6) Ks : (0.9,0.9,0.9) shine : 0 textFile : "tronc01.bmp" />
	<define mat : feuillageConifere Ka : (0.6,0.6,0.6) Ks : (0.9,0.9,0.9) shine : 0  textFile : "feuille02.bmp" />

	<define mat : troncFeuillu Ka : (0.6,0.6,0.6) Ks : (0.9,0.9,0.9) shine : 0 textFile : "tronc02.bmp"/>
	<define mat : feuillageFeuillu  Ka : (0.6,0.6,0.6) Ks : (0.9,0.9,0.9) shine : 0 textFile : "feuille01.bmp" />

	<define mat : tronc  Ka : (0.7,0.5,0)  shine : 0 textFile : "tronc.bmp" />
	<define mat : feuillage Ka : (0,0.6,0) shine : 0 textFile : "feuille.bmp" />

	<define mat : herbe Ka : (0.6,0.6,0.6) Ks : (0.9,0.9,0.9) shine : 0 textFile : "herbe.bmp" />

	<define shape objectFile : "data/sapin02.obj"/>
	<define shape objectFile : "data/scene02.obj"/>
	<define shape objectFile : "data/test01mat.obj"/>

	<node name : "Bois" type : Group >

		<node name : "9 Arbre" type : Group >
		
			<node name : "3 Arbre" type : Group >
			
				// Objet composant le sapin
				<node name : "Sapin" type : Group>
					<object name : "troncSapin" shape : Defined name : troncSapin mat : troncConifere/>
					<object name : "feuillageSapin" shape : Defined name : feuillageSapin mat : feuillageConifere/>
				</node>

				// Objet composant le chene
				<node name : "tr1" type : Transform type : translation x : 150>
					<node name : "Chene" type : Group>
						<object name : "troncChene" shape : Defined name : troncChene mat : troncFeuillu/>
						<object name : "feuillageChene" shape : Defined name : feuillageChene mat : feuillageFeuillu/>
					</node>
				</node>

				// Objet composant un arbre lambda
				<node name : "tr2" type : Transform type : translation x : -150>
					<node name : "Arbre" type : Group >
						<object name : "arbre_tronc" shape : Defined name : arbre_tronc mat : tronc/>
						<object name : "arbre_feuillage" shape : Defined name : arbre_feuillage mat : feuillage/>
					</node>
				</node>

			</node>

			<node name : "Seed 1" type : Transform type : translation x : 80 >
				<node name : "rot1" type : Transform type : rotation angle : 20.0 axeY : 1>
					<getSbtree name : "3 Arbre" />
				</node>
			</node>

			<node name : "Seed 2" type : Transform type : translation x : -80 >
				<node name : "rot2" type : Transform type : rotation angle : -20.0 axeY : 1>
					<getSbtree name : "3 Arbre" />
				</node>
			</node>

		</node>

		<node name : "Seed 3" type : Transform type : translation x : 250 >
			<node name : "rot3" type : Transform type : rotation angle : 45 axeY : 1>
				<getSbtree name : "9 Arbre" />
			</node>
		</node>

		<node name : "Seed 4" type : Transform type : translation x : -250 >
			<node name : "rot4" type : Transform type : rotation angle : -60 axeY : 1>
				<getSbtree name : "9 Arbre" />
			</node>
		</node>

		<node name : "Seed 5" type : Transform type : translation x : 350>
			<node name : "rot5" type : Transform type : rotation angle : -80 axeY : 1>
				<getSbtree name : "9 Arbre" />
			</node>
		</node>

		<node name : "Seed 6" type : Transform type : translation x : -350 >
			<node name : "rot6" type : Transform type : rotation angle : 90 axeY : 1>
				<getSbtree name : "9 Arbre" />
			</node>
		</node>

	</node>

	<node name : "Bois Avant" type : Transform type : translation z : 300 >
		<node name : "rot7" type : Transform type : rotation angle : 180 axeY : 1>
			<getSbtree name : "Bois" />
		</node>
	</node>

	<node name : "Bois Arriere" type : Transform type : translation z : -300 >
		<node name : "rot8" type : Transform type : rotation angle : -180 axeY : 1>
			<getSbtree name : "Bois" />
		</node>
	</node>

	<object name : "Sol" shape : Defined name : Sol mat : herbe/>

</scene>	