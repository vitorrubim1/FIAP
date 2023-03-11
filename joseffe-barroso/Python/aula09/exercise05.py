from utils.handleRequest import handleRequest

dominio = input("Digite um domínio desejado: ")

data = handleRequest(f"https://brasilapi.com.br/api/registrobr/v1/{dominio}")

if data != "":
  if (data['status'] == 'AVAILABLE'):
    print('Domínio disponível!')
  else:
    dataFormatada = data['expires-at'][8:10] + "/" + data['expires-at'][5:7] + "/" + data['expires-at'][0:4]
    print('Domínio indisponível! Expira em: ' + dataFormatada)