# Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	valora = int()
	valorb = int()
	operacion = int()
	valorc = float()
	continuar = str()
	print("Ingrese el valor del primer numero: ")
	valora = int(input())
	print("Ingrese el valor del segundo numero: ")
	valorb = int(input())
	print("Digite el numero de la operacion que desea hacer: ")
	print("1) Suma")
	print("2) Resta")
	print("3) Multiplicacion")
	print("4) Division")
	operacion = int(input())
	if operacion==1:
		valorc = valora+valorb
		print("El valor de la operacion Suma es: ",valorc)
	else:
		if operacion==2:
			valorc = valora-valorb
			print("El valor de la operacion Resta es: ",valorc)
		else:
			if operacion==3:
				valorc = valora*valorb
				print("El valor de la operacion Multiplicacion es: ",valorc)
			else:
				if operacion==4:
					if valorb==0:
						print("El valor ingresado en el segundo valor es erroneo. Prueba nuevamente")
					else:
						valorc = valora/valorb
						print("El valor de la operacion Division es: ",valorc)
				else:
					print("El numero ingresado en el menu de la operacion no corresponde a ninguna de las opciones. Prueba nuevamente")

