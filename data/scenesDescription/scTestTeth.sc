<scene name : "Test Tetrahedron" >

	<node name : "Tetrahedron" type : Group>

		<node name : "tr3" type : Transform type : translation x : -100 >
			<node name : "sc" type : Transform type : scale ratio : 50 >
				<object name : "Tetrahedron1" shape : Tetrahedron />
			</node>
		</node>

		<object name : "Tetrahedron2" shape : Tetrahedron />

	</node>

</scene>