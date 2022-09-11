quantity = int(input("Qual é o valor da sequencia? "))
while (quantity <= 0 or quantity > 100): 
  quantity = int(input("O valor da sequência deve ser positivo e menor que cem. Informe novamente: "))

sequence = 2
sumNumbers = 0

for index in range(2, quantity + 2, 1):
  print(sequence)
  sumNumbers = sumNumbers + sequence
  sequence = index**2+1

print(f"A soma dos valores deu: {sumNumbers}")