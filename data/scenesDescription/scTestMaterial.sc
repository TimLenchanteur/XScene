<scene name : "Test matériaux" >

	<define mat : purple Ka : (1,0,1) />

	<define mat : purpleDiffuse Ka : (1,0,1) Kd : (0.2,0.2,0.2) />

	<define mat : blue Ka : (0,0,1) />

	<define mat : blueSpec Ka : (0,0,1) Ks : (1,1,1) />

	<define mat : red Ka : (1,0,0) />

	<define mat : redSpecShine Ka : (1,0,0) Ks : (1,1,1) shine :128  />

	<define mat : yellow Ka : (1,1,0) />

	<define mat : yellowDiffuseSpec Ka : (1,1,1) Kd : (1,1,0) Ks : (1,1,1) shine :64 />

	<define mat : brown colorTypeINT Ka : (139,69,19) />

	<define mat : feuillage Ka : (0, 1, 0) textFile : "feuille.bmp" textX : 1 textY : 1 />

	<define mat : ifsic textFile : "logo.gif" />

	<define mat : ifsicX textFile : "logo.gif" textX : 1 textY :  0 />

	<node name : "Geos" type : Group>

				
		<node name : "tr1" type : Transform type : translation x : -300 >
			<node name : "rot" type : Transform type : rotation angle : -90 axeX : 1 >
				<object name : "Cone" shape : Cone mat : purple />
			</node>
		</node>

		<node name : "tr12" type : Transform type : translation x : -300 y : -100>
			<node name : "rot2" type : Transform type : rotation angle : -90 axeX : 1 >
				<object name : "Cone2" shape : Cone mat : purpleDiffuse />
			</node>
		</node>

		<node name : "tr2" type : Transform type : translation x : -200 >
			<object name : "Cube" shape : Cube mat : feuillage />
		</node>

		<node name : "tr3" type : Transform type : translation x : -100 >
			<object name : "Cylindre" shape : Cylinder mat : blue />
		</node>

		<node name : "tr32" type : Transform type : translation x : -100 y : -100 >
			<object name : "Cylindre2" shape : Cylinder mat : blueSpec />
		</node>
	
		<object name : "Sphere" shape : Sphere mat : red />

		<node name : "tr02" type : Transform type : translation y : -100 >
			<object name : "Sphere2" shape : Sphere mat : redSpecShine />
		</node>

		<node name : "tr4" type : Transform type : translation x : 100 >
			<node name : "sc" type : Transform type : scale ratio : 50>
				<object name : "Tetrahedron" shape : Tetrahedron mat : yellow />
			</node>
		</node>

		<node name : "tr42" type : Transform type : translation x : 100 y : -100 >
			<node name : "sc2" type : Transform type : scale ratio : 50>
				<object name : "Tetrahedron2" shape : Tetrahedron mat : yellowDiffuseSpec />
			</node>
		</node>


		<node name : "tr5" type : Transform type : translation x : 220 >
			<object name : "Teapot" shape : Teapot  />
		</node>

		<node name : "tr6" type : Transform type : translation x : 220 y : -100 >
			<object name : "Teapot2" shape : Teapot mat : ifsic />
		</node>

		<node name : "tr62" type : Transform type : translation x : 220 y : 100 >
			<object name : "Teapot3" shape : Teapot mat : ifsicX />
		</node>


		<node name : "tr7" type : Transform type : translation x : 350 >
			<object name : "Torus" shape : Torus mat: brown />
		</node>

	</node>

</scene>