<scene name : "Test Mise à l'échelle" >

	<node name : "Mise à l'échelle" type : Group>

		<node name : "tr0" type : Transform type : translation x : -400 >			
			<node name : "sc0" type : Transform type : scale ratio : 2 >
				<object name : "Cube" shape : Cube />
			</node>
		</node>

		<node name : "tr1" type : Transform type : translation x : -300 >			
			<node name : "sc1" type : Transform type : scale ratio : -1.5 >
				<object name : "Cube1" shape : Cube />
			</node>
		</node>

		<node name : "tr2" type : Transform type : translation x : -200 >			
			<node name : "sc2" type : Transform type : scale ratio : 0.5 >
				<object name : "Cube2" shape : Cube />
			</node>
		</node>

		<node name : "tr3" type : Transform type : translation x : -100 >			
			<node name : "sc3" type : Transform type : scale  ratioXYZ : (1,1,0) >
				<object name : "Cube3" shape : Cube />
			</node>
		</node>

		<node name : "sc4" type : Transform type : scale ratio : 1 >
				<object name : "Cube4" shape : Cube />
		</node>

		<node name : "tr4" type : Transform type : translation x : 100 >			
			<node name : "sc5" type : Transform type : scale  ratioXYZ : (0,1,1) >
				<object name : "Cube5" shape : Cube />
			</node>
		</node>

		<node name : "tr5" type : Transform type : translation x : 200 >			
			<node name : "sc6" type : Transform type : scale ratioXYZ : (1,0,1) >
				<object name : "Cube6" shape : Cube />
			</node>
		</node>

		<node name : "tr7" type : Transform type : translation x : 300 >			
			<node name : "sc7" type : Transform type : scale  ratioXYZ : (2,1,1) >
				<object name : "Cube7" shape : Cube />
			</node>
		</node>

	</node>

</scene>