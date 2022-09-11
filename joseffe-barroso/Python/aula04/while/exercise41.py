quantity = int(input("Qual é o valor da sequencia? "))
while (quantity <= 0 or quantity > 100): 
  quantity = int(input("O valor da sequência deve ser positivo e menor que cem. Informe novamente: "))

index = 2
sequence = 2
sumNumbers = 0

while (index < quantity + 2):
  print(sequence)
  sumNumbers = sumNumbers + sequence
  sequence = index**2+1
  index = index + 1

print(f"A soma dos valores deu: {sumNumbers}")