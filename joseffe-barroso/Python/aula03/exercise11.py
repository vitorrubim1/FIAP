rectangleHeight = float(input('Digite a altura do retângulo: '))
rectangleBase = float(input('Digite a base do retângulo: '))

totalArea = rectangleBase * rectangleHeight

if (totalArea > 100):
    print(f"O Terreno é grande, e possui: {totalArea:.2f} m²")
else:
    print("Fim do programa")