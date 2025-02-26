Algoritmo RutinaCajeroMientrasHastaPara
	
	Escribir "Simon Monsalve Higuita"
	Escribir "Logica Programacion 1"
	Escribir "601"
	Escribir "24/02/2025"
	Escribir "***Rutina Ciclo Cajero***"
	
	Definir OpcTarjeta, OpcAccion, ValorRetiro, ValorAcumulado, OpcConsulta, Ndocumento, Contrase�aNew Como entero
	
	ValorAcumulado = 1000000
	
	Escribir "Se�or usuario ingrese su tarjeta"
	Escribir "1) Si"
	Escribir "2) No"
	Leer OpcTarjeta
	
	si OpcTarjeta <> 1 Entonces
		Repetir
			Escribir "Se�or usuario ingrese la tarjeta"
			Leer OpcTarjeta
		Hasta Que OpcTarjeta = 1
	FinSi
	Mientras OpcTarjeta = 1 Hacer
		Escribir "Se�or usuario ingrese la opcion que desea ejecutar"
		Escribir "1) Retiro"
		Escribir "2) Consulta"
		Escribir "3) Cambio De Clave"
		Leer OpcAccion
		Segun OpcAccion Hacer
			1:
				Escribir "ingrese el valor que desea retirar"
				Leer ValorRetiro
				Operetiro = ValorAcumulado - ValorRetiro
				Repetir
					Escribir "Se�or usuario ingrese su clave (Recuerde que es de 4 digitos)"
					Leer Clave 
				Hasta Que Clave > 999
				si Operetiro < 0 Entonces
					Escribir "Se�or usuario su retiro fue erroneo. El valor ingresado es superior al valor almacenado"
				SiNo
					Escribir "Se�or usuario su retiro fue exitoso aun queda en su cuenta: ", Operetiro
				FinSi
				
			2:
				Escribir "Se�or usuario ingrese cual de las siguientes opciones desea realizar"
				Escribir "1) Valor Neto en la tarjeta"
				Escribir "2) Clave dinamica"
				Leer OpcConsulta
				si OpcConsulta = 1 Entonces
					Repetir
						Escribir "Se�or usuario ingrese su clave (Recuerde que es de 4 digitos)"
						Leer Clave 
					Hasta Que Clave > 999
					Escribir "Se�or usuario el valor neto de su tarjeta es de: ", ValorAcumulado
				SiNo
					si OpcConsulta = 2 Entonces
						Repetir
							Escribir "Se�or usuario ingrese su clave (Recuerde que es de 4 digitos)"
							Leer Clave 
						Hasta Que Clave > 999
						Escribir "Se�or usuario su clave dinamica es: ", Aleatorio(1000,9999) 
					FinSi
				FinSi
			3:
				Escribir "se�or usuario ingrese cual es su numero de documento: "
				Leer Ndocumento
				si Ndocumento < 00000 o Ndocumento > 99999  Entonces
					Escribir "Se�or usuario ingrese su nueva contrase�a"
					Leer Contrase�aNew
				SiNo
					Escribir "Se�or usuario el numero ingresado es erroneo recuerda que debe ser menor o igual a 9999 y mayor o igual a 00000 "
				FinSi
			De Otro Modo:
				Escribir "Se�or usuario el valor ingresado no esta vinculado con ningun de las posibilidades de ejecucion. Vuelva a intentarlo"
		Fin Segun
		Escribir "Desea realizar otra operacion"
		Escribir "1) Si"
		Escribir "2) No"
		Leer OpcTarjeta
	FinMientras
	
FinAlgoritmo