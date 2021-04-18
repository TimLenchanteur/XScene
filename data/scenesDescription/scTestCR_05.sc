<scene name : "Test Shape" >

	<define shape : triangle 
		<vertex (0,0.5,0)/>
		<vertex (-0.5,-0.5,0)/>
		<vertex (0.5,-0.5,0)/>
		<normal (0,1,0)/>
		<normal (-1.41,-1.41,0)/>
		<normal (1.41,-1.41,0)/>
		<txtCoord (0,0)/>
		<txtCoord (1,0)/>
		<txtCoord (0,1)/>
		<face s1 : 0/0/0 s2 : 1/1/1 s3 : 2/2/2 />
	/>
	<node name : "sc" type : Transform type : scale ratio : 100 >
		<object name : "Triangle" shape : Defined name : triangle/>
	</node>
</scene>