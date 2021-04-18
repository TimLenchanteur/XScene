<scene name : "Test subTrees" >

	<node name : "36 Sphere" type : Group >

		<node name : "18 Sphere" type : Group >
		
			<node name : "9 Sphere" type : Group >

				
				<node name : "3 Sphere" type : Group >

					<node name : "rot1" type : Transform type : rotation angle : 20.0 axeY : 1>		
			
						<object name : "Sphere" shape : Sphere rad : 30 />

						<node name : "tr1" type : Transform type : translation x : 200 >				
							<getSbtree name : "Sphere" />
						</node>

						<node name : "tr2" type : Transform type : translation x : -200 >
							<getSbtree name : "Sphere" />
						</node>

					</node>
	
				</node>


				<node name : "tr3" type : Transform type : translation x : 300 >				
					<getSbtree name : "3 Sphere" />
				</node>

				<node name : "tr4" type : Transform type : translation x : -300 >
					<getSbtree name : "3 Sphere" />
				</node>

			</node>

			<node name : "tr5" type : Transform type : translation z : 200 >
					<getSbtree name : "9 Sphere" />
			</node>

		</node>

		<node name : "tr6" type : Transform type : translation z : -100 >
			<getSbtree name : "18 Sphere" />
		</node>

	</node>

	<node name : "tr7" type : Transform type : translation y : 300 >
		<getSbtree name : "36 Sphere" />
	</node>

</scene>