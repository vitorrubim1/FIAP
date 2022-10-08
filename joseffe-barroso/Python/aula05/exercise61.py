numeros = []

for i in range(0, 9, 1):
  num = int(input("Digite um número: "));
  numeros.append(num)

for i in range(0, 9, 1):
  for j in range(i+1, 9, 1):
    if (numeros[i] < numeros[j]):
      aux = numeros[i]
      numeros[i] = numeros[j]
      numeros[j] = aux

for i in range(0, 9, 1):
  print(numeros[i])