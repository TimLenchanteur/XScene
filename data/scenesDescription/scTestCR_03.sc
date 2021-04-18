<scene name : "Test subTree" >

	<object name : "Cube" shape : Cube />

	<node name : "tr" type : Transform type : translation x : 100 >
		<getSbtree name : "Cube" />
	</node>

</scene>