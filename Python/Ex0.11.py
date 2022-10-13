larg=float(input("Informe a Largura da Parede:"))
alt=float(input("Informe a Altura da Parede:"))
area=larg*alt
print("Sua parede tem a dimensão de {:.2f}x{:.2f} e tem uma área de {:.2f}m².".format(larg,alt,area))
print("Para pintar essa parede, seria necessário {:.2f}L de tinta".format(area/2))