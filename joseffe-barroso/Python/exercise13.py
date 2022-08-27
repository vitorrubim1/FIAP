triangleFirstValue = float(input('Digite o primeiro lado do triângulo: '))
triangleSecondValue = float(input('Digite o segundo lado do triângulo: '))
triangleThirdValue = float(input('Digite o terceiro lado triângulo: '))

if ((triangleFirstValue + triangleSecondValue < triangleThirdValue) or (triangleFirstValue + triangleThirdValue < triangleSecondValue) or (triangleSecondValue + triangleThirdValue < triangleFirstValue)):
  print("Não é um triangulo");

elif ((triangleFirstValue == triangleSecondValue) and (triangleFirstValue == triangleThirdValue)): 
    print("Equilatero")

elif ((triangleFirstValue == triangleSecondValue) or (triangleFirstValue == triangleThirdValue)  or (triangleSecondValue == triangleThirdValue)): 
    print("Isósceles")

else:
    print("Escaleno")
