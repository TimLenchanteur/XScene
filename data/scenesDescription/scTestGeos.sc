<scene name : "Test Geometries" >

	<node name : "Geos" type : Group>
				
		<node name : "tr1" type : Transform type : translation x : -300 >
			<node name : "rot" type : Transform type : rotation angle : -90 axeX : 1 >
				<object name : "Cone" shape : Cone />
			</node>
		</node>

		<node name : "tr2" type : Transform type : translation x : -200 >
			<object name : "Cube" shape : Cube />
		</node>

		<node name : "tr3" type : Transform type : translation x : -100 >
			<object name : "Cylindre" shape : Cylinder />
		</node>
	
		<object name : "Sphere" shape : Sphere />
		

		<node name : "tr4" type : Transform type : translation x : 100 >
			<node name : "sc" type : Transform type : scale ratio : 50>
				<object name : "Tetrahedron" shape : Tetrahedron />
			</node>
		</node>

		<node name : "tr5" type : Transform type : translation x : 220 >
			<object name : "Teapot" shape : Teapot />
		</node>


		<node name : "tr6" type : Transform type : translation x : 350 >
			<object name : "Torus" shape : Torus/>
		</node>

	</node>

</scene>