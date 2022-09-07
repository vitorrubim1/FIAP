# 35. Entrar via teclado com um valor qualquer. Travar a digitação, no sentido de aceitar somente valores positivos. Após a digitação, exibir a tabuada do valor solicitado, no intervalo de um a dez.

value = int(input("Informe um valor qualquer: "))

while (value <= 0): 
    value = int(input("Informe um valor positivo: "))

for index in range(1, 11, 1):
    result = 5 * index 
    print(f"{5} X {index} = {result}")
    index = index + 1
