<scene name : "Test Torus" >

	<node name : "Torus" type : Group>


		<node name : "tr2" type : Transform type : translation x : -200 >						
			<object name : "Torus0" shape : Torus inRad : 15 />
		</node>

		<node name : "tr3" type : Transform type : translation x : -100 >			
			<object name : "Torus1" shape : Torus outRad : 40 />
		</node>

		<object name : "Torus2" shape : Torus />

		<node name : "tr4" type : Transform type : translation x : 100 >
			<node name : "rot" type : Transform type : rotation angle : 90 >
				<object name : "Torus3" shape : Torus sides : 2 />
			</node>
		</node>

		<node name : "tr5" type : Transform type : translation x : 200 >
			<object name : "Torus4" shape : Torus rings : 4 />
		</node>

	</node>

</scene>