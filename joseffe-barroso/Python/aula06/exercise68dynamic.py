matriz=[]

linhas = int(input('Digite a quantidade de linhas que a matriz terá: '))
colunas = int(input('Digite a quantidade de colunas que a matriz terá: '))

# Cria as linhas na Matriz
for index in range(0, linhas, 1):
    matriz.append([])

# Cria para cada linha, cria as colunas na Matriz já gravando o valor digitado
for index in range(0, linhas, 1):
    for j in range(0, colunas, 1):
        num = int(input('Digite um número: '))
        matriz[index].append(num)

# matriz[line][column] = int(input('Digite um numero: '))
multiply = int(input("Digite um valor para multiplicação: "))

for line in range(0, linhas, 1):
    for column in range(0, colunas, 1):
        matriz[line][column] = matriz[line][column] * multiply

for index in range(0, 3, 1):
    print(matriz[index]) 