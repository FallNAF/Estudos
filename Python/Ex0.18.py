import math
ang=float(input("Informe o ângulo desejado:"))
print("O ângulo de {} tem o Seno de {:.2f}".format(ang,math.sin(math.radians(ang))))'''sin,cos e tan calcula em radianos, precisando de conversão'''
print("O ângulo de {} tem o Cosseno de {:.2f}".format(ang,math.cos(math.radians(ang))))
print("O ângulo de {} tem a Tangente de {:.2f}".format(ang,math.tan(math.radians(ang))))