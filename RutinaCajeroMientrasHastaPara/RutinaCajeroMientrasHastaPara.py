# Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	print("Simon Monsalve Higuita")
	print("Logica Programacion 1")
	print("601")
	print("24/02/2025")
	print("***Rutina Ciclo Cajero***")
	opctarjeta = int()
	opcaccion = int()
	valorretiro = int()
	valoracumulado = int()
	opcconsulta = int()
	ndocumento = int()
	contrasenanew = int()
	valoracumulado = 1000000
	print("Se�or usuario ingrese su tarjeta")
	print("1) Si")
	print("2) No")
	opctarjeta = int(input())
	if opctarjeta!=1:
		while True:# no hay 'repetir' en python
			print("Se�or usuario ingrese la tarjeta")
			opctarjeta = int(input())
			if opctarjeta==1: break
	while opctarjeta==1:
		print("Se�or usuario ingrese la opcion que desea ejecutar")
		print("1) Retiro")
		print("2) Consulta")
		print("3) Cambio De Clave")
		opcaccion = int(input())
		if opcaccion==1:
			print("ingrese el valor que desea retirar")
			valorretiro = int(input())
			operetiro = valoracumulado-valorretiro
			while True:# no hay 'repetir' en python
				print("Se�or usuario ingrese su clave (Recuerde que es de 4 digitos)")
				clave = input()
				if clave>999: break
			if operetiro<0:
				print("Se�or usuario su retiro fue erroneo. El valor ingresado es superior al valor almacenado")
			else:
				print("Se�or usuario su retiro fue exitoso aun queda en su cuenta: ",operetiro)
		elif opcaccion==2:
			print("Se�or usuario ingrese cual de las siguientes opciones desea realizar")
			print("1) Valor Neto en la tarjeta")
			print("2) Clave dinamica")
			opcconsulta = int(input())
			if opcconsulta==1:
				while True:# no hay 'repetir' en python
					print("Se�or usuario ingrese su clave (Recuerde que es de 4 digitos)")
					clave = float(input())
					if clave>999: break
				print("Se�or usuario el valor neto de su tarjeta es de: ",valoracumulado)
			else:
				if opcconsulta==2:
					while True:# no hay 'repetir' en python
						print("Se�or usuario ingrese su clave (Recuerde que es de 4 digitos)")
						clave = float(input())
						if clave>999: break
					print("Se�or usuario su clave dinamica es: ",ALEATORIO(1000, 9999))
		elif opcaccion==3:
			print("se�or usuario ingrese cual es su numero de documento: ")
			ndocumento = int(input())
			if ndocumento<00000 or ndocumento>99999:
				print("Se�or usuario ingrese su nueva contrase�a")
				contrasenanew = int(input())
			else:
				print("Se�or usuario el numero ingresado es erroneo recuerda que debe ser menor o igual a 9999 y mayor o igual a 00000 ")
		else:
			print("Se�or usuario el valor ingresado no esta vinculado con ningun de las posibilidades de ejecucion. Vuelva a intentarlo")
		print("Desea realizar otra operacion")
		print("1) Si")
		print("2) No")
		opctarjeta = int(input())

