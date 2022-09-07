# 31. Criar uma rotina de entrada que aceite somente um valor positivo.

value = int(input("Informe um valor: "));

while (value <= 0):
    value = int(input("Informe somente valores positivos: "));

print("Thank you")
    