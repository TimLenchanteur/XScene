<scene name : "Test Sphere" >

	<node name : "Spheres" type : Group>


		<node name : "tr2" type : Transform type : translation x : -300 >			
			<object name : "Sphere0" shape : Sphere rad : 25 />
		</node>

		<node name : "tr3" type : Transform type : translation x : -150 >			
			<object name : "Sphere1" shape : Sphere slices : 6 />
		</node>

		<object name : "Sphere2" shape : Sphere />

		<node name : "tr4" type : Transform type : translation x : 150 >
			<node name : "rot" type : Transform type : rotation angle : 90 axeX : 90 >				
				<object name : "Sphere3" shape : Sphere stack : 2 />
			</node>
		</node>

	</node>

</scene>