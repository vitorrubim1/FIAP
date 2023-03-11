from utils.handleRequest import handleRequest

print("Conversor de moedas")
value = float(input("Digite o valor em R$: "))

print("Deseja converter para: ")
print("1. Dólar")
print("2. Euro")
print("3. Bitcoin")
option = int(input("> "))

params = ''
if (option == 1): params = 'USD-BRL'
if (option == 2): params = 'EUR-BRL'
if (option == 3): params = 'BTC-BRL'

data = handleRequest(f"https://economia.awesomeapi.com.br/json/last/{params}")

if data != "":
    params_parsed = params.replace("-", "");
    ask = data[params_parsed]["ask"]
    cotation = value / float(ask)
    print(f"\nO valor da cotação está em: {cotation:.2f}")
else:
    print("Dados não encontrado.")
