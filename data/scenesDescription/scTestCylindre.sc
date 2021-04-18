<scene name : "Test Cylindre" >

	<node name : "Cylindres" type : Group>


		<node name : "tr2" type : Transform type : translation x : -200 >						
			<object name : "Cylindre0" shape : Cylinder base : 25 />
		</node>

		<node name : "tr3" type : Transform type : translation x : -100 >			
			<object name : "Cylindre1" shape : Cylinder top : 25 />
		</node>

		<object name : "Cylindre2" shape : Cylinder />

		<node name : "tr4" type : Transform type : translation x : 100 >
			<object name : "Cylindre3" shape : Cylinder height : 25 />
		</node>

		<node name : "tr5" type : Transform type : translation x : 200 >
			<object name : "Cylindre4" shape : Cylinder slices : 4 />
		</node>

		<node name : "tr6" type : Transform type : translation x : 300 >
			<object name : "Cylindre5" shape : Cylinder stack : 1 />
		</node>

	</node>

</scene>