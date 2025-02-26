# Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	print("Simon Monsalve Higuita")
	print("Logica Programacion 1")
	print("601")
	print("24/02/2025")
	print("***Rutina Ciclo Para Aire Acondicionado***")
	resencendido = int()
	restemperatura = int()
	restemperaturadeseada = int()
	resrepetimiento = int()
	suma = int()
	print("Señor usuario desea encender el aire acondicionado?")
	print("1) Si")
	print("2) No")
	resencendido = int(input())
	if resencendido==1:
		resrepetimiento = 1
		while resrepetimiento==1:
			print("Ingerese la temperatura en la que se encuentra el aire")
			restemperatura = int(input())
			print("Ingrese la temperatura que desea que se establesca el aire")
			restemperaturadeseada = int(input())
			if restemperaturadeseada<=20 or restemperaturadeseada>=50:
				print("La temperatura que deseas no esta en el rango disponible en este aire")
			else:
				if restemperatura<restemperaturadeseada:
					for restemperatura in range(restemperatura,restemperaturadeseada+1):
						print("El aire acondicionado se encuentra en ",restemperatura," y esta incrementando hasta: ",restemperaturadeseada)
						suma = 1
				else:
					if restemperatura>restemperaturadeseada:
						for restemperatura in range(restemperatura,restemperaturadeseada-1,-1):
							print("El aire acondicionado se encuentra en ",restemperatura," y esta disminuyendo hasta: ",restemperaturadeseada)
							suma = 2
				if suma==1:
					print("La temperatura actual es: ",restemperatura-1)
				else:
					print("La temperatura actual es: ",restemperatura+1)
			print("Señor usuario desea hacer otro cambio en la temperatura del aire: ")
			print("1) Si")
			print("2) No")
			resrepetimiento = int(input())
	else:
		print("Señor usuario su eleccion fue 2 es decir que no desea prender el aire")

