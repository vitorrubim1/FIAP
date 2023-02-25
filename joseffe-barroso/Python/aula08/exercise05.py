import requests

dominio = input("Digite um domínio desejado: ")

url = f"https://brasilapi.com.br/api/registrobr/v1/{dominio}"

response = requests.get(url)

if response.status_code == 200:
  dados = response.json()

  if (dados['status'] == 'AVAILABLE'):
    print('Domínio disponível!')
  else:
    dataFormatada = dados['expires-at'][8:10] + "/" + dados['expires-at'][5:7] + "/" + dados['expires-at'][0:4]
    print('Domínio indisponível! Expira em: ' + dataFormatada)