using System;

class Program
{
    static void Main()
    {
        Console.WriteLine("Simon Monsalve Higuita");
        Console.WriteLine("Logica Programacion 1");
        Console.WriteLine("601");
        Console.WriteLine("17/02/2025");
        Console.WriteLine("***Rutina Semanal***");

        Console.Write("Ingresa tu nombre: ");
        string Nombre = Console.ReadLine();
        string Respuesta = "si";

        while (Respuesta == "si")
        {
            Console.WriteLine("Ingresa el dia de la semana en el que estas");
            Console.WriteLine("1) lunes");
            Console.WriteLine("2) Martes");
            Console.WriteLine("3) Miercoles");
            Console.WriteLine("4) Jueves");
            Console.WriteLine("5) Viernes");
            Console.WriteLine("6) Sabado");

            int cantDias = int.Parse(Console.ReadLine());

            int DiaSemana = -1;

            switch (cantDias)
            {
                case 1: DiaSemana = 0; break;
                case 2: DiaSemana = 1; break;
                case 3: DiaSemana = 2; break;
                case 4: DiaSemana = 3; break;
                case 5: DiaSemana = 4; break;
                case 6: DiaSemana = 5; break;
                default:
                    Console.WriteLine("El dia que ingresaste o lo has copiado diferente a la indicacion. Vuelve a intentarlo");
                    continue;
            }

            if (DiaSemana >= 0 && DiaSemana <= 5)
            {
                string[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado" };
                if (DiaSemana < 5)
                {
                    Console.WriteLine($"El dia en el que estas es {dias[DiaSemana]}. Hoy debes asistir a la universidad");
                }
                else
                {
                    Console.WriteLine("El dia en el que estas es Sabado. Hoy puedes descansar");
                }

                Console.Write("Ingresa la hora actual (Formato de 24 horas): ");
                int Hora = int.Parse(Console.ReadLine());

                if (Hora >= 6 && Hora < 12)
                {
                    Console.WriteLine($"Buenos dias. Señor {Nombre}");
                }
                else if (Hora >= 12 && Hora < 18)
                {
                    Console.WriteLine($"Buenos tardes. Señor {Nombre}");
                }
                else
                {
                    Console.WriteLine($"Buenos noches. Señor {Nombre}");
                }

                Console.WriteLine("**********");
            }

            Console.Write("Deseas ingresar otro dia (si/no): ");
            Respuesta = Console.ReadLine();
        }
    }
}
