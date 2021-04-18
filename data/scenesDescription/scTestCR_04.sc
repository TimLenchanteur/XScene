<scene name : "Test Animation" >

	<define anim : a1 type : tr stop : (100,0,0) start : 4 time : 4 />

	<node name : "tr" type : Transform type : translation anim : a1 >
		<object name : "Cube" shape : Cube />
	</node>

</scene>	