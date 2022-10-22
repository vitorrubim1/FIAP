matriz=[]

linhas = int(input('Digite a quantidade de linhas que a matriz terá: '))
colunas = int(input('Digite a quantidade de colunas que a matriz terá: '))

# Cria as linhas na Matriz
for index in range(0, linhas, 1):
    matriz.append([])

# Cria para cada linha, cria as colunas na Matriz já gravando o valor digitado
for index in range(0, linhas, 1):
    for j in range(0, colunas, 1):
        name = input('Digite um nome: ')
        matriz[index].append(name)

for index in range(0, linhas, 1):
    print(matriz[index])