<scene name : "Test Shape" >
	
	<define mat : troncConifere  Ka : (0.6,0.6,0.6) Ks : (0.9,0.9,0.9) shine : 0 textFile : "tronc01.bmp" />
	<define mat : feuillageConifere Ka : (0.6,0.6,0.6) Ks : (0.9,0.9,0.9) shine : 0  textFile : "feuille02.bmp" />

	<define shape objectFile : "data/sapin02.obj"/>

	<node name : "Sapin" type : Group>
		<object name : "troncSapin" shape : Defined name : troncSapin mat : troncConifere/>
		<object name : "feuillageSapin" shape : Defined name : feuillageSapin mat : feuillageConifere/>
	</node>

</scene>
