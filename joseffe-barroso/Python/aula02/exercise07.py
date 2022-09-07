productOneValue = float(input("Informe o valor do primeiro produto? "))
productTwoValue = float(input("Informe o valor do segundo produto? "))
productThirdValue = float(input("Informe o valor do terceiro produto? "))
productFourthValue = float(input("Informe o valor do quarto produto? "))
productFifthValue = float(input("Informe o valor do quinto produto? "))

productsValue = productOneValue + productTwoValue + productThirdValue + productFourthValue + productFifthValue;

print("O valor total dos produtos deu: ", productsValue);

payment = float(input("Informe o valor em dinheiro: "))

result = payment - productsValue

print("O seu troco deu: ", result)