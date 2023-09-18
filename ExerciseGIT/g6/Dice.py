"""
    Fecha: 17/09/2023
    Autor: Ximena Quintana
           Sebastian Varela Villegas
           Laura Sanchez
           Samuel Montoya Mayor
    Objetivo: juego del dado implementando la libreria random. El juego termina cuando el jugador saca 6 en el dado. 
    Después de cada jugada el programa debe preguntarle al jugador si quiere volver a tirar el dado. Si dice que no el juego
    termina, si dice que si se vuelve a ejecutar el dado.
    Instrucciones: solo un miembro del equipo deberá completar el algoritmo. Después de este termine y suba los cambios
    a git, cada miembro restante descargará los cambios y agregará su nombre a la lista de autores. No deben hacerlo todos al 
    tiempo, sino uno por uno.
"""

import random

opcion = int(input("Desea tirar el dado: \n1.SI \n2.NO \n : "))

while opcion == 1 :
    dice = random.randint(1, 6)
    print(dice)
    if dice == 6:
        print("ADIOS")
        opcion = 2
    else:
        opcion = int(input("Desea tirar el dado: \n1.SI \n2.NO \n : "))
    
     
print("Fin del juego")
    
