def rutina_semanal():
    print("Simon Monsalve Higuita")
    print("Logica Programacion 1")
    print("601")
    print("17/02/2025")
    print("***Rutina Semanal***")

    Nombre = input("Ingresa tu nombre: ")
    Respuesta = "si"
    
    while Respuesta == "si":
        print("Ingresa el dia de la semana en el que estas")
        print("1) lunes")
        print("2) Martes")
        print("3) Miercoles")
        print("4) Jueves")
        print("5) Viernes")
        print("6) Sabado")
        cantDias = int(input())
        
        if cantDias == 1:
            DiaSemana = 0
        elif cantDias == 2:
            DiaSemana = 1
        elif cantDias == 3:
            DiaSemana = 2
        elif cantDias == 4:
            DiaSemana = 3
        elif cantDias == 5:
            DiaSemana = 4
        elif cantDias == 6:
            DiaSemana = 5
        else:
            print("El dia que ingresaste o lo has copiado diferente a la indicacion. Vuelve a intentarlo")
            continue

        if cantDias in [1, 2, 3, 4, 5, 6]:
            print(f"El dia en el que estas es {['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado'][DiaSemana]}. Hoy debes asistir a la universidad" if DiaSemana < 5 else "El dia en el que estas es Sabado. Hoy puedes descansar")
            
            Hora = int(input("Ingresa la hora actual (Formato de 24 horas): "))
            
            if 6 <= Hora < 12:
                print(f"Buenos dias. Señor {Nombre}")
            elif 12 <= Hora < 18:
                print(f"Buenos tardes. Señor {Nombre}")
            else:
                print(f"Buenos noches. Señor {Nombre}")
                
            print("**********")
        
        Respuesta = input("Deseas ingresar otro dia (si/no): ")
        
rutina_semanal()