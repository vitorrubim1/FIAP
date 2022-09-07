productValue = float(input("Informe o valor do produto: "));

cashPayment = productValue - (10 / 100) * productValue 
creditCardPayment = productValue - (15 / 100) * productValue 
interestFreePaymentInTwoInstallments = productValue
paymentInTwoInstallmentsWithInterest = productValue + (10 / 100) * productValue

print("Valor à vista em dinheiro ou cheque R$",cashPayment)
print("Valor à vista no cartão de crédito R$",creditCardPayment)
print("Em duas vezes, preço normal de etiqueta sem juros R$",interestFreePaymentInTwoInstallments)
print("Em duas vezes, preço normal de etiqueta mais juros de 10% R$",paymentInTwoInstallmentsWithInterest)