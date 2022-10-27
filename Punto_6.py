import math
print("Calculadora de areas")
print("Opciones:")
print("1) Circulo")
print("2) Triangulo")
print("3) Cuadrado")

option = int (input('Ingresa la opción que desees: '))

if option == 1:
    r = float (input('Ingresa el radio del ciculo en metros: '))
    rta = 3.1416*r**2
    print("El area del circulo de radio "+str(r)+ " es de "+str(rta)+" metros cuadrados.")

elif option == 2:
    b = float (input('Ingresa la base del triangulo en metros: '))
    a = float (input('Ingresa la altura del triangulo en metros: '))
    rta = (b*a)/2
    print("El area del triangulo de base "+str(b)+" y altura "+str(a) +" es de "+str(rta)+" metros cuadrados.")

elif option == 3:
    l = float (input('Ingresa uno de los lados del cuadrado en metros: '))
    rta = l**2
    print("El area del cuadrado de lado "+str(l)+ " es de "+str(rta)+" metros cuadrados.")
