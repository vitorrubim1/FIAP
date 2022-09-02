print("Cálculo de área, digite o número da opção correspondente")
print("1 - Triângulo")
print("2 - Quadrado")
print("3 - Retângulo")
print("4 - Circulo")
print("5 - FIM DE PROCESSO (sair do programa) \n")

choice = int(input("Digite o número da operação:"));

if (choice == 1 or choice == 2 or choice == 3 or choice == 4):

  if (choice == 1):
    triangleHeight = float(input('Digite a altura do triângulo: '))
    triangleBase = float(input('Digite a base do triângulo: '))
    totalArea = (triangleBase * triangleHeight) / 2
    print("A área do triângulo é: ", totalArea)

  elif (choice == 2):
    squareSide = float(input('Digite o lado do quadrado: '))
    totalArea = squareSide * squareSide
    print("A área do quadrado é: ", totalArea)

  elif (choice == 3):
    rectangleHeight = float(input('Digite a altura do retângulo: '))
    rectangleBase = float(input('Digite a base do retângulo: '))
    totalArea = rectangleBase * rectangleHeight
    print("A área do retângulo é: ", totalArea)

  elif (choice == 4):
    circleRadius = float(input('Digite o raio do círclo: '))

    pi = 3.14
    totalArea = pi * circleRadius**2
    print("A área do círculo é: ", totalArea)
  
  
elif (choice == 5):
  print("Até mais")

else:
  print("Informe um valor que que coincida na lista")
