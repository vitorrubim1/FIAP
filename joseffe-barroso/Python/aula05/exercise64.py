# 64. Armazenar no máximo vinte valores em um vetor. Exibir a quantidade de valores pares e ímpares. 
# Exibir também o percentual da quantidade de valores pares e ímpares.

list = []
odd = []
even = []
negatives = []

for index in range(0, 7, 1):
  list.append(int(input("Informe um número: ")))

for index in range(0, 7, 1): 
  if(list[index] < 0): negatives.append(list[index])    
  elif(list[index] % 2 == 0): even.append(list[index])
  else: odd.append(list[index])

oddPercent = (len(odd) / len(list)) * 100
evenPercent = (len(even) / len(list)) * 100
negativePercent = (len(negatives) / len(list)) * 100
    
print(f"Quantidade: {len(even)}. Porcentagem: {evenPercent}%. Valores: {even}")
print(f"Quantidade: {len(odd)}. Porcentagem: {oddPercent}%. Impares: {odd}")
print(f"Quantidade: {len(negatives)}. Porcentagem: {negativePercent}%. Negativos: {negatives}")