"""
    Fecha: 17/09/2023
    Autor: HECTOR ANDRES RAMOS BOTERO, JEISON ANDRES VELEZ LLANOS 
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
    if dice == 0: 
        dice = random.randint(0, 6)
        print(dice)
    elif dice: 
        option = input("Desea Volver A Lanzar El Dado \n1- si \n2- no: ")
        if option == "si": 
            dice = random.randint(1, 6)
            print(dice)
        if option == "no": 
            print("Gracias Por Jugar")
            exit()
        
print("TERMINO EL JUEGO")