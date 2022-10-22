matriz = [[0,0,0,0], [0,0,0,0], [0,0,0,0]]
newMatriz = [[0,0,0,0], [0,0,0,0], [0,0,0,0]]

for line in range(0, 3, 1):
    for column in range(0, 4, 1):
        num = int(input('Digite um numero: '))
        matriz[line][column] = num
        newMatriz[line][column] = num

multiply = int(input("Digite um valor para multiplicação: "))

for line in range(0, 3, 1):
    for column in range(0, 4, 1):
        newMatriz[line][column] = matriz[line][column] * multiply

for index in range(0, 3, 1):
    print(newMatriz[index]) 