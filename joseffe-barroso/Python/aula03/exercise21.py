choice = int(input('''Qual operação você deseja realizar? 
    1 - MULTIPLICAÇÃO
    2 - ADIÇÃO
    3 - DIVISÃO
    4 - SUBTRAÇÃO
    5 - FIM DE PROCESSO (sair do programa)

    Digite o número correspondente: '''))

if (choice == 1 or choice == 2 or choice == 3 or choice == 4):
  firstValue = float(input("\nInforme o primeiro valor: "))
  secondValue = float(input("Informe o segundo valor: "))

  # Verificando se qualquer valor é igual a zero
  if (choice == 3 and firstValue == 0 or secondValue == 0): 
    print("Para esta opção não é permitido informar o valor 0 (Zero)")

  # Multiplicação
  if (choice == 1): 
    result = firstValue * secondValue;
    print("A multiplicação deu: ", result)

  # Adição
  elif (choice == 2): 
    result = firstValue + secondValue;
    print("A adição deu: ", result)

  # Divisão
  elif (choice == 3): 
    result = firstValue / secondValue;
    print("A divisão deu: ", result)

  # Subtração
  elif (choice == 4): 
    result = firstValue - secondValue;
    print("A subtração deu: ", result)

elif (choice == 5):
  print("Até mais")

else:
  print("Informe um valor que que coincida na lista")


