from math import hypot
cato=float(input("Informe a medida do cateto Oposto:"))
cata=float(input("Informe a medida do cateto Adjacente:"))
'''hip=(cato**2 + cata**2) ** 0.5'''
hip= hypot(cato, cata)
print("A hiponetusa vai medir {:.2f}".format (hip))