<scene name : "Test basique 1" >

	<node name : "Rond sur carre" type : Group>
				
		<object name : "Cube" shape : Cube size : 50 />
		<node name : "tr1" type : Transform type : translation y : 50>
			<object name : "Sphere" shape : Sphere rad : 25 />
		</node>

	</node>

	<node name : "tr2" type : Transform type : translation x : -100 >
		<object name : "Cylindre" shape : Cylinder base : 50 top : 50 height : 50 />
	</node>

</scene>