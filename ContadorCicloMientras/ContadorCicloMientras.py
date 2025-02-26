# Este codigo ha sido generado por el modulo psexport 20230904-w32 de PSeInt.
# Es posible que el codigo generado no sea completamente correcto. Si encuentra
# errores por favor reportelos en el foro (http://pseint.sourceforge.net).


if __name__ == '__main__':
	print("Simon Monsalve Higuita")
	print("Logica Programacion 1")
	print("601")
	print("17/02/2025")
	print("***Contador ciclo mientras***")
	cont = int()
	limite = int()
	mensaje = str()
	nombre = str()
	print("Ingrese su nombre")
	nombre = input()
	print("Ingresa el numero de impresiones")
	limite = int(input())
	cont = 0
	mensaje = "Hola "
	while cont<=limite:
		print("Hola ",nombre," tu contador es: ",cont)
		cont = cont+1

