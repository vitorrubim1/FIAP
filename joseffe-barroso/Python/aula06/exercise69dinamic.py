matriz=[]
newMatriz=[]

linhas = int(input('Digite a quantidade de linhas que a matriz terá: '))
colunas = int(input('Digite a quantidade de colunas que a matriz terá: '))

# Cria as linhas na Matriz
for index in range(0, linhas, 1):
    matriz.append([])
    newMatriz.append([])

# Cria para cada linha, cria as colunas na Matriz já gravando o valor digitado
for index in range(0, linhas, 1):
    for j in range(0, colunas, 1):
        num = int(input('Digite um número: '))
        matriz[index].append(num)
        newMatriz[index].append(num)

multiply = int(input("Digite um valor para multiplicação: "))

for line in range(0, linhas, 1):
    for column in range(0, colunas, 1):
        newMatriz[line][column] = matriz[line][column] * multiply

for index in range(0, linhas, 1):
    print(newMatriz[index]) 