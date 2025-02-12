# Algoritmo Calculadora

# Definir las variables
ValorA = int(input("Ingrese el valor del primer numero: "))
ValorB = int(input("Ingrese el valor del segundo numero: "))

# Solicitar la operación que desea realizar
print("Digite el numero de la operacion que desea hacer: ")
print("1) Suma")
print("2) Resta")
print("3) Multiplicacion")
print("4) Division")
Operacion = int(input())

# Realizar la operación según el número seleccionado
if Operacion == 1:
    ValorC = ValorA + ValorB
    print("El valor de la operacion Suma es:", ValorC)
elif Operacion == 2:
    ValorC = ValorA - ValorB
    print("El valor de la operacion Resta es:", ValorC)
elif Operacion == 3:
    ValorC = ValorA * ValorB
    print("El valor de la operacion Multiplicacion es:", ValorC)
elif Operacion == 4:
    if ValorB == 0:
        print("El valor ingresado en el segundo valor es erroneo. Prueba nuevamente")
    else:
        ValorC = ValorA / ValorB
        print("El valor de la operacion Division es:", ValorC)
else:
    print("El numero ingresado en el menu de la operacion no corresponde a ninguna de las opciones. Prueba nuevamente")
