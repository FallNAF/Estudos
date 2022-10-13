salario=float(input("Informe o valor do Salário: R$"))
porc=float(input("Informe a porcentagem a ser aumentada: %"))
calc=salario+(salario*porc/100)
print("O Salários R${} com um aumento de {}%, torna-se R${}".format(salario,porc,calc))