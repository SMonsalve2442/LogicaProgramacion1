# Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	print("***Calculadora in***")
	valora = int()
	print("Ingrese el primer numero: ")
	valora = int(input())
	if valora==0 or valora!=0:
		valorb = int()
		operacion = str()
		valorc = float()
		print("Ingrese de manera escrita cual de las operaciones desea realizar (suma/resta/multiplicacion/division)")
		operacion = input()
		# Validacion de operacion posible
		if operacion=="suma" or operacion=="resta" or operacion=="multiplicacion" or operacion=="division":
			print("Ingrese el segundo numero: ")
			valorb = int(input())
			if operacion=="suma":
				valorc = valora+valorb
				print("El resultado de la suma es: ",valorc)
			else:
				if operacion=="resta":
					valorc = valora-valorb
					print("El resultado de la resta es: ",valorc)
				else:
					if operacion=="multiplicacion":
						valorc = valora*valorb
						print("El resultado de la multiplicacion es: ",valorc)
					else:
						if operacion=="division":
							if valorb!=0:
								valorc = valora/valorb
								print("El resultado de la division es: ",valorc)
							else:
								print("El valor asignado al divisor es erroneo no se puede dividir por cero")
		else:
			print("La operacion ingresada no esta disponible")
	else:
		print("El dato ingresado en el campo del ingreso del primer numero es erroneo")

