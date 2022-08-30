heigth = float(input("Digite a altura: "))
catetoOne = float(input("Digite o primeiro cateto: "))
catetoTwo = float(input("Digite o primeiro cateto: "))

catetoSum = catetoOne**2 + catetoTwo**2

if (heigth**2 == catetoSum):
    print("É um triângulo retangulo")

else:
    print("Não é um triângulo retangulo")
