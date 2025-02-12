Algoritmo CicloUniversidad
	
	Escribir "***Rutina Universidad***"
	
	Definir Nombre, RespuestaClases, RespuestaLevantar, RespuestaDeBaño, RespuestaVestirse, RespuestaDesayuno, RespuestaLLevarTodo, RespuestaSalir, RespuestaMetodoDeTransporte Como Caracter
	Definir RespuestaHora, RespuestaHoraActual, CalcularTiempo Como Entero
	
	Escribir "Buenos dias. Cual es tu nombre? "
	Leer Nombre
	
	Escribir "Señor@ ", Nombre, " Hoy tienes clases"
	Leer RespuestaClases
	
	si RespuestaClases = "si" Entonces
		Escribir "Que horas son"
		Leer RespuestaHoraActual
		Escribir "A que horas debes ir"
		Leer RespuestaHora
		CalcularTiempo = RespuestaHora - RespuestaHoraActual
		si CalcularTiempo < 2 Entonces
			Escribir "Date prisa que ya esta cerca tu hora de entrada"
		SiNo
			Escribir "Ya te levantaste de la cama"
			Leer RespuestaLevantar
			si RespuestaLevantar = "si" Entonces
				Escribir "Genial, ya te bañaste"
				Leer RespuestaDeBaño
				si RespuestaDeBaño = "si" Entonces
					Escribir "ohh eres un rayo, ya estas vestido"
					Leer RespuestaVestirse
					si RespuestaVestirse = "si" Entonces
						Escribir "Vaya que eres rapido. Te ves genial"
						Escribir "Ya desayunaste"
						Leer RespuestaDesayuno
						si RespuestaDesayuno = "si" Entonces
							Escribir "Espero que tu desayuno estuviera genial y que estes satifech@"
							Escribir "¿Llevas todo? No te se queda algo?"
							Leer RespuestaLLevarTodo
							si RespuestaLLevarTodo = "si" Entonces
								Escribir "Ya vas a salir para tu clase"
								Leer RespuestaSalir
								si RespuestaSalir = "si" Entonces
									Escribir "En que te vas a ir"
									Leer RespuestaMetodoDeTransporte
									si RespuestaMetodoDeTransporte = "Bus" o RespuestaMetodoDeTransporte = "uber" o RespuestaMetodoDeTransporte = "carro" Entonces
										Escribir "Genial espero que te vaya bien. Recuerda el cinturon de seguridad siempre ;)"
										Escribir "Que tengas un increible dia. Feliz dia"
									SiNo
										Escribir "Eso suena fantastico es bueno hacer un poco de ejercicio"
										Escribir "Que tengas un increible dia. Feliz dia"
									FinSi
								SiNo
									Escribir "Vamos ve saliendo para que no te afanes"
								FinSi
							SiNo
								Escribir "Menos mal te recuerdo"
							FinSi
						SiNo
							Escribir "Ve y come algo el desayuno es la comida mas importante del dia"
						FinSi
					SiNo
						Escribir "Vamos, ponte esa ropa que tanto te gusta y sal a lucirla"
					FinSi
				SiNo
					Escribir "Ve y bañate para que tengas un magnifico dia"
				FinSi
			SiNo
				Escribir "Vamos levantante que ya comenzo el dia"
			FinSi
		FinSi
		SiNo
			Escribir "Cuales son tus planes para hoy"
			Leer RespuestaPlanesDia
			Si RespuestaPlanesDia = "nada" Entonces
				Escribir "Vamos animate ve a cine o sal con tus amigos o ve por un helado"
			SiNo
				Escribir "Ohh eso suena increible espero que la pases genial. Buena suerte"
			FinSi
	FinSi
	
FinAlgoritmo
