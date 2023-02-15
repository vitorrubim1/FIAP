import requests

print("Conversor de moedas")
value = float(input("Digite o valor em R$: "))

print("Deseja converter para: ")
print("1. Dólar")
print("2. Euro")
print("3. Bitcoin")
option = int(input("Informe a opção: "))

params = ''
if (option == 1): params = 'USD-BRL'
if (option == 2): params = 'EUR-BRL'
if (option == 3): params = 'BTC-BRL'

url = f"https://economia.awesomeapi.com.br/json/last/{params}"

response = requests.get(url)

if response.status_code == 200:
    dados = response.json()
    params_parsed = params.replace("-", "");
    ask = dados[params_parsed]["ask"]
    cotation = value / float(ask)
    print(f"\nO valor da cotação está em:", cotation)
else:
    print(f"Dados não encontrado.")
