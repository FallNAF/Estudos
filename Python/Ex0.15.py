dias=int(input("Quantos dias foi alugado?"))
km=float(input("Quantos KM foram rodados?"))
calc=(dias*60)+(km*0.15)
print("O cliente deve pagar R${:.2f}".format(calc))