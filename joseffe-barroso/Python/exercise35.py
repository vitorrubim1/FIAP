# 36. Entrar via teclado com um valor (X) qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. 
# Solicitar o intervalo que o programa que deverá calcular a tabuada do valor digitado, sendo que o segundo valor (B), deverá ser maior 
# que o primeiro (A), caso contrário, digitar novamente somente o segundo. Após a validação dos dados, exibir a tabuada do valor digitado, 
# no intervalo decrescente, ou seja, a tabuada de X no intervalo de B para A.

value = int(input("Informe um valor qualquer: "))

while (value <= 0): 
    value = int(input("Informe um valor positivo: "))

interval = int(input("Informe o intervalo: "))

while (value > interval): 
    interval = int(input("O intervalo dever ser maior que o valor informado: "))

for index in range(1, interval + 1, 1):
    result = value * index 
    print(f"{value} X {index} = {result}")
    index = index + 1