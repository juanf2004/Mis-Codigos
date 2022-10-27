"""Hallar el índice de masa corporal"""
print("Calculadora de indice de masa corporal")
x = float (input('Ingresa tu peso en Kg: '))
y = float (input('Ingresa tu estatura en metros: '))

IMC = x/(y ** 2)

if IMC >= 0 and IMC <= 15.99 :
    print ("Tu indice de masa corporal es: " + str (IMC) + ", lo que indica que tu peso esta en la categoría de: delgadez severa")

elif IMC >= 16.00 and IMC <= 16.99 :
    print ("Tu indice de masa corporal es: " + str (IMC) + ", lo que indica que tu peso esta en la categoría de: delgadez moderada")

elif IMC >= 17.00 and IMC <= 18.49:
    print ("Tu indice de masa corporal es: " + str (IMC) + ", lo que indica que tu peso esta en la categoría de: delgadez leve")

elif IMC >= 18.50 and IMC <= 24.99 :
    print ("Tu indice de masa corporal es: " + str (IMC) + ", lo que indica que tu peso esta en la categoría de: normal")

elif IMC >= 25.00 and IMC <= 29.99:
    print ("Tu indice de masa corporal es: " + str (IMC) + ", lo que indica que tu peso esta en la categoría de: sobrepeso")

elif IMC >= 30.00 and IMC <= 34.99:
    print ("Tu indice de masa corporal es: " + str (IMC) + ", lo que indica que tu peso esta en la categoría de: obesidad leve")

elif IMC >= 35.00 and IMC <= 39.00:
    print ("Tu indice de masa corporal es: " + str (IMC) + ", lo que indica que tu peso esta en la categoría de: obesidad media")

elif IMC >= 40.00:
    print ("Tu indice de masa corporal es: " + str (IMC) + ", lo que indica que tu peso esta en la categoría de: obesidad morbida")
