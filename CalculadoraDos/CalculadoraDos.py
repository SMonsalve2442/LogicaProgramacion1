# Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	print("***Calculadora Pos***")
	valora = int()
	valorb = int()
	valorc = float()
	operacion = str()
	print("Ingrese el primer numero: ")
	valora = int(input())
	print("Ingrese el segundo numero: ")
	valorb = int(input())
	if valora==0 and valorb==0:
		print("Los valores ingresados daran como resultado 0 sin importar la operacion que deseas realizar")
	else:
		print("Ingrese de manera escrita cual de las operaciones desea realizar (suma/resta/multiplicacion/division)")
		operacion = input()
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

