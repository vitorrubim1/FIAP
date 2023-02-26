import requests

print("=== Identificar feriados ===")
dataDigitada = input("Informe uma data no formato dd/mm: ")

diaDigitado = dataDigitada[0:2]
mesDigitado = dataDigitada[3:5]
ano = "2023"

url = f"https://brasilapi.com.br/api/feriados/v1/{ano}"
response = requests.get(url)

if response.status_code == 200:
  dados = response.json()
 
  for item in dados:
    dataFeriadoFormatada = item['date'].replace("-", "")
    diaFeriado = dataFeriadoFormatada[6:8]
    mesFeriado = dataFeriadoFormatada[4:6]

    if diaDigitado == diaFeriado and mesDigitado == mesFeriado:
      print(f"No data informada ({diaDigitado}/{mesDigitado}/{ano}) acontece o feriado de: {item['name']}")
    elif mesDigitado == mesFeriado:
      print(f"No data informada não foi encontrado, mas no mês ({mesDigitado}/{ano}) acontece o feriado de: {item['name']}")
