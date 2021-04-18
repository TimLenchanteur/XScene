<scene name : "Test Cone" >

	<node name : "Cones" type : Group>


		<node name : "tr2" type : Transform type : translation x : -200 >			
			<node name : "rot1" type : Transform type : rotation angle : -90 axeX : 1 >				
				<object name : "Cone0" shape : Cone base : 50 />
			</node>
		</node>

		<node name : "tr3" type : Transform type : translation x : -100 >			
			<node name : "rot2" type : Transform type : rotation angle : -90 axeX : 1 >				
				<object name : "Cone1" shape : Cone height : 50 />
			</node>
		</node>

		<node name : "rot3" type : Transform type : rotation angle : -90 axeX : 1 >				
				<object name : "Cone2" shape : Cone />
		</node>

		<node name : "tr4" type : Transform type : translation x : 100 >
			<node name : "rot4" type : Transform type : rotation angle : -60 axeX : 1 >				
				<object name : "Cone3" shape : Cone slices : 4 />
			</node>
		</node>

		<node name : "tr5" type : Transform type : translation x : 200 >
			<node name : "rot5" type : Transform type : rotation angle : -60 axeX : 1 >				
				<object name : "Cone4" shape : Cone stack : 1 />
			</node>
		</node>

	</node>

</scene>