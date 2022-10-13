prod=float(input("Informe o valor de um produto: R$"))
desc=float(input("Informe o valor de desconto: %"))
calc=prod - (prod*desc/100)
print("O valor do produto R${:.2f}, com um desconto de {}%, se torna R${:.2f}".format(prod,desc,calc))