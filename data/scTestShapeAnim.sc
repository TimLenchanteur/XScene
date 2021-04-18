<scene name : "Test Shape Animation" >
	<define mat : poteau textFile : "poteau.bmp" textX : 1 textY : 1 />
	<define mat : cloture textFile : "cloture.bmp" textX : 1 textY : 1 />

	<define shape objectFile : "data/barriere03.obj"/>

	<define anim : a1 type : rot ang : 90 start : 5 time : 5 />
	<define anim : a2 type : tr stop:(53,32,0) start : 5 time : 5 />


	<node name : "barriere" type : Group>
		<object name : "poteau" shape : Defined name : poteau mat : poteau/>
		<node name : "tr" type : Transform type : translation anim : a2>
			<node name : "rot" type : Transform type : rotation angle : 0 axeZ : 1 anim : a1>
				<object name : "barre" shape : Defined name : barre mat : cloture/>
			</node>
		</node>
	</node>

</scene>	