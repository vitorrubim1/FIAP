matriz = [[0,0,0,0], [0,0,0,0], [0,0,0,0]]

for line in range(0, 3, 1):
    for column in range(0, 4, 1):
        matriz[line][column] = int(input('Digite um numero: '))

multiply = int(input("Digite um valor para multiplicação: "))

for line in range(0, 3, 1):
    for column in range(0, 4, 1):
        matriz[line][column] = matriz[line][column] * multiply

for index in range(0, 3, 1):
    print(matriz[index]) 