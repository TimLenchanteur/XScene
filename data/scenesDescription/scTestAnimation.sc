<scene name : "Test Animation" >

	<define anim : a1 type : tr stop : (0,-100,0) time : 4 />

	<define anim : a2 type : tr stop : (0,-100,0) start : 4 time : 4 />

	<define anim : a3 type : rot ang : 50 time : 4 />

	<define anim : a4 type : rot ang : 50 start : 4 time : 4 />

	<define anim : a5 type : sc size : 0.5 time : 4 />

	<define anim : a6 type : sc size : 2 time : 4 />

	<define anim : a7 type : sc size : 0.5 start : 4 time : 4 />

	<node name : "Animations" type : Group>

		<node name : "tr0" type : Transform type : translation x : -200 anim : a1 >			
			<node name : "rot0" type : Transform type : rotation angle : 0 anim : a3 >
				<node name : "sc0" type : Transform type : scale ratio : 1 anim : a5 >
					<object name : "Cube" shape : Cube />
				</node>
			</node>
		</node>

		<node name : "tr1" type : Transform type : translation x : -100 anim : a1 >			
				<object name : "Cube1" shape : Cube />
		</node>

		<node name : "tr2" type : Transform type : translation x : -100 y : 100 anim : a2>			
			<object name : "Cube2" shape : Cube /> 
		</node>

		<node name : "tr3" type : Transform type : translation y : -100 >			
			<node name : "rot3" type : Transform type : rotation angle : 0 axeX : 1 axeY : 1 anim : a3 >
				<object name : "Cube3" shape : Cube />
			</node>
		</node>
			
		<node name : "rot4" type : Transform type : rotation angle : 0 axeY : 1 axeZ : 1 anim : a4 >
			<object name : "Cube4" shape : Cube />
		</node>

		<node name : "tr5" type : Transform type : translation x : 100 y : 100 >
			<node name : "sc5" type : Transform type : scale ratio :1 anim : a5 >
				<object name : "Cube5" shape : Cube />
			</node>
		</node>

		<node name : "tr6" type : Transform type : translation x : 100 >			
			<node name : "sc6" type : Transform type : scale ratio :1 anim : a6 >
				<node name : "sc7" type : Transform type : scale ratio :1 anim : a7 >
					<object name : "Cube6" shape : Cube />
				</node>
			</node>
		</node>

	</node>

</scene>	