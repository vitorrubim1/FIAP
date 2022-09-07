# 32. Entrar com dois valores via teclado, onde o segundo deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.

valueOne = int(input("Informe o primeiro valor: "))
valueTwo = int(input("Informe o segundo valor: "))

while (valueTwo <= valueOne):
    valueTwo = int(input("O segundo valor precisar ser maior que o primeiro. Informe novamente: "))

print("Thank you")