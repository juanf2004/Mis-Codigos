print("Calculadora")
x = int (input('Ingresa un numero entero: '))
y = int (input('Ingresa otro numero entero: '))
n = float (input('Ingresa un numero real: '))
m = float (input('Ingresa otro numero real: '))
print()
print("x = " + str(x))
print("y = " + str(y))
print("n = " + str(n))
print("m = " + str(m))
print()
a = x+y
b = x-y
c = x*y
d = x//y
e = x%y

f = n+m
g = n-m
h = n*m
i = n//m
j = n%m

k = x+n
l = y//m
o = y%m

p = 2*x
q = 2*y
r = 2*n
s = 2*m
t = x+y+n+m
u = x*y*n*m

print("La suma de ´x´ más ´y´ es igual a "+ str (a))
print("La resta de ´x´ menos ´y´ es igual a "+str (b))
print("La multiplicación de ´x´ por ´y´ es igual a "+str (c))
print("El cociente de la división ´x´ entre ´y´ es "+str (d))
print("El residuo de la división ´x´ entre ´y´ es "+str (e))
print()
print("La suma de ´n´ más ´m´ es igual a "+str (f))
print("La resta de ´n´ menos ´m´ es igual a "+str (g))
print("La multiplicación de ´n´ por ´m´ es igual a "+str (h))
print("El cociente de la división ´n´ entre ´m´ es "+str (i))
print("El residuo de la división ´n´ entre ´m´ es "+str (j))
print()
print("La suma de ´x´ más ´n´ es igual a "+str (k))
print("El cociente de la división ´y´ entre ´m´ es "+str (l))
print("El residuo de la división ´y´ entre ´m´ es "+str (o))
print()
print("El doble de ´x´ es "+str (p))
print("El doble de ´x´ es "+str (q))
print("El doble de ´x´ es "+str (r))
print("El doble de ´x´ es "+str (s))
print()
print("La suma de ´x´ más ´y´ más ´n´ más ´m´es igual a "+str (t))
print("La multiplicación de ´x´ por ´y´ por ´n´ por ´m´es igual a "+str (u))
