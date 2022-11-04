matriz=[]
retornar="s"

linhas = int(input('Digite a quantidade de linhas que a matriz terá: '))

while (linhas > 10 or linhas <= 0):
  print("\nInforme um valor entre 0 e 10 para as linhas da matriz! \n")
  linhas = int(input('Digite a quantidade de linhas que a matriz terá: '))

colunas = int(input('Digite a quantidade de colunas que a matriz terá: '))

while (colunas > 10 or colunas <= 0):
  print("\nInforme um valor entre 0 e 10 para as colunas da matriz! \n")
  colunas = int(input('Digite a quantidade de colunas que a matriz terá: '))

# Cria as linhas na Matriz
for index in range(0, linhas, 1):
    matriz.append([])

# Populando a matriz
for index in range(0, linhas, 1):
    for j in range(0, colunas, 1):
        num = int(input('Digite um número: '))
        matriz[index].append(num)

for index in range(0, linhas, 1):
    print(matriz[index])

while(retornar == "s"):
  search = int(input("Informe um valor para procura: "))
  resultado = ""

  for linha in range(0, linhas, 1):
      for coluna in range(0, colunas, 1):
        if (matriz[linha][coluna] == search):
          posicao  = "(" + str(linha) + ", " + str(coluna) + ")"
          resultado = resultado + "[" + str(linha) + ", " + str(coluna) + "] "
     
  if (resultado == ""):
    print("O número" + str(search) + "não foi encontrado na matriz")
  else:
    print("O número" + str(search) + "foi encontrado na posição: " + resultado)

  retornar = input("Deseja pesquisar outro número? s/n: ")
