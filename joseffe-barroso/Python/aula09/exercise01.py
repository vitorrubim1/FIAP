from utils.handleRequest import handleRequest

cep = input("Digite o CEP desejado: ")
data = handleRequest(f"https://viacep.com.br/ws/{cep}/json/")

if data != "":
    print(f"CEP: {data['cep']}")
    print(f"Logradouro: {data['logradouro']}")
    print(f"Bairro: {data['bairro']}")
    print(f"Cidade: {data['localidade']}")
    print(f"Estado: {data['uf']}")
else:
    print("CEP não encontrado.")