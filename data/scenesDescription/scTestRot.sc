<scene name : "Test Rotations" >

	<node name : "Rotations" type : Group>

		<node name : "tr0" type : Transform type : translation x : -400 >			
			<node name : "rot0" type : Transform type : rotation angle : 80  >
				<object name : "Cube" shape : Cube />
			</node>
		</node>

		<node name : "tr1" type : Transform type : translation x : -300 >			
			<node name : "rot1" type : Transform type : rotation angle : -80  axeX : 1 >
				<object name : "Cube1" shape : Cube /> 
			</node>
		</node>

		<node name : "tr2" type : Transform type : translation x : -200 >			
			<node name : "rot2" type : Transform type : rotation angle : -80 axeY : 1 >
				<object name : "Cube2" shape : Cube />
			</node>
		</node>

		<node name : "tr3" type : Transform type : translation x : -100 >			
			<node name : "rot3" type : Transform type : rotation angle : -80 axeZ : 1 >
				<object name : "Cube3" shape : Cube />
			</node>
		</node>

		<node name : "rot4" type : Transform type : rotation angle : -90 axeX : 1 axeY : 1 >
			<object name : "Cube4" shape : Cube />
		</node>

		<node name : "tr4" type : Transform type : translation x : 100 >			
			<node name : "rot5" type : Transform type : rotation angle : -90 axeX : 1 axeZ : 1 >
				<object name : "Cube5" shape : Cube />
			</node>
		</node>

		<node name : "tr5" type : Transform type : translation x : 200 >			
			<node name : "rot6" type : Transform type : rotation angle : -90 axeY : 1 axeZ : 1 >
				<object name : "Cube6" shape : Cube />
			</node>
		</node>

		<node name : "tr7" type : Transform type : translation x : 300 >			
			<node name : "rot7" type : Transform type : rotation angle : -90 axeX : 1 axeY : 1 axeZ : 1 >
				<object name : "Cube7" shape : Cube />
			</node>
		</node>

	</node>

</scene>
