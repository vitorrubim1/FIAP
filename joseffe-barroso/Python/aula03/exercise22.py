choice = int(input('''Informe seu estado civil
    1 - Triângulo
    2 - Quadrado
    3 - Retângulo
    4 - Circulo
    5 - FIM DE PROCESSO (sair do programa)

    Digite o número correspondente: '''))

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
    circleRadius = float(input('Digite o raio do círculo: '))

    pi = 3.14
    totalArea = pi * circleRadius**2
    print("A área do círculo é: ", totalArea)
  
  
elif (choice == 5):
  print("Até mais")

else:
  print("Informe um valor que que coincida na lista")
