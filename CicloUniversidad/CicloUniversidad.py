# Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	print("***Rutina Universidad***")
	nombre = str()
	respuestaclases = str()
	respuestalevantar = str()
	respuestadebano = str()
	respuestavestirse = str()
	respuestadesayuno = str()
	respuestallevartodo = str()
	respuestasalir = str()
	respuestametododetransporte = str()
	respuestahora = int()
	respuestahoraactual = int()
	calculartiempo = int()
	print("Buenos dias. Cual es tu nombre? ")
	nombre = input()
	print("Señor@ ",nombre," Hoy tienes clases")
	respuestaclases = input()
	if respuestaclases=="si":
		print("Que horas son")
		respuestahoraactual = int(input())
		print("A que horas debes ir")
		respuestahora = int(input())
		calculartiempo = respuestahora-respuestahoraactual
		if calculartiempo<2:
			print("Date prisa que ya esta cerca tu hora de entrada")
		else:
			print("Ya te levantaste de la cama")
			respuestalevantar = input()
			if respuestalevantar=="si":
				print("Genial, ya te bañaste")
				respuestadebano = input()
				if respuestadebano=="si":
					print("ohh eres un rayo, ya estas vestido")
					respuestavestirse = input()
					if respuestavestirse=="si":
						print("Vaya que eres rapido. Te ves genial")
						print("Ya desayunaste")
						respuestadesayuno = input()
						if respuestadesayuno=="si":
							print("Espero que tu desayuno estuviera genial y que estes satifech@")
							print("¿Llevas todo? No te se queda algo?")
							respuestallevartodo = input()
							if respuestallevartodo=="si":
								print("Ya vas a salir para tu clase")
								respuestasalir = input()
								if respuestasalir=="si":
									print("En que te vas a ir")
									respuestametododetransporte = input()
									if respuestametododetransporte=="Bus" or respuestametododetransporte=="uber" or respuestametododetransporte=="carro":
										print("Genial espero que te vaya bien. Recuerda el cinturon de seguridad siempre ;)")
										print("Que tengas un increible dia. Feliz dia")
									else:
										print("Eso suena fantastico es bueno hacer un poco de ejercicio")
										print("Que tengas un increible dia. Feliz dia")
								else:
									print("Vamos ve saliendo para que no te afanes")
							else:
								print("Menos mal te recuerdo")
						else:
							print("Ve y come algo el desayuno es la comida mas importante del dia")
					else:
						print("Vamos, ponte esa ropa que tanto te gusta y sal a lucirla")
				else:
					print("Ve y bañate para que tengas un magnifico dia")
			else:
				print("Vamos levantante que ya comenzo el dia")
	else:
		print("Cuales son tus planes para hoy")
		respuestaplanesdia = input()
		if respuestaplanesdia=="nada":
			print("Vamos animate ve a cine o sal con tus amigos o ve por un helado")
		else:
			print("Ohh eso suena increible espero que la pases genial. Buena suerte")

