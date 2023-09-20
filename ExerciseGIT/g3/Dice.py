"""
    Fecha: 17/09/2023
    Autor: Juan Esteban
    Objetivo: juego del dado implementando la libreria random. El juego termina cuando el jugador saca 6 en el dado. 
    Después de cada jugada el programa debe preguntarle al jugador si quiere volver a tirar el dado. Si dice que no el juego
    termina, si dice que si se vuelve a ejecutar el dado.
    Instrucciones: solo un miembro del equipo deberá completar el algoritmo. Después de este termine y suba los cambios
    a git, cada miembro restante descargará los cambios y agregará su nombre a la lista de autores. No deben hacerlo todos al 
    tiempo, sino uno por uno.
"""

import random

dice = random.randint(0, 6)
print(dice)

while dice != 6: 
    option = input("Desea volver a tirar: ")
    print(option) 

    if option == "si" or option == "Si" :
        dice = random.randint(0, 6)
        print(dice)

    elif option == "no" or option == "No":
        option = input("El juego termino")
        print("gracias por jugar")
    
    else:
        option = print("El dado es incorrecto seleccione (si o no): ")
        print(option)
else:
   print("Se acabo el juego")
    
    


    

