baseDados = "CJose dos Santos,42,Sao Paulo;CSandra Silva,36,Sao Jose do Rio Preto;CAugusto Soares,22,Sao Paulo;CVanderlei Azevedo,45,Santos;CVanessa Ferreira,27,Sao Paulo;PMouse,1,9.90;PTeclado,3,19.90;PMonitor,2,349.90;PHD SSD,2,199.90;PProcessador,1,350.00"

registros = baseDados.split(';')
clientes = {}
produtos = {}

for registro in registros:
    dados = registro.split(',')
    tipo = dados[0][0]
    
    # Cliente
    if tipo == 'C':
        nome = dados[0][1:]  # Remove o primeiro caractere 'C' que indica que é um cliente
        idade = int(dados[1])
        cidade = dados[2]

        clientes[nome] = {
            'Nome': nome,
            'Idade': idade,
            'Cidade': cidade
        }

    # Produto
    elif tipo == 'P':
        nome = dados[0][1:]
        qtd_estoque = int(dados[1])
        preco = float(dados[2])

        produtos[nome] = {
            'Nome': nome,
            'Qtd em estoque': qtd_estoque,
            'Preço': preco
        }

print("Clientes:")
for cliente in clientes.values():
    print("-------------")
    print("Nome:", cliente['Nome'])
    print("Idade:", cliente['Idade'])
    print("Cidade:", cliente['Cidade'])

print("\n\n\nProdutos:")
for produto in produtos.values():
    print("-------------")
    print("Nome:", produto['Nome'])
    print("Qtd em estoque:", produto['Qtd em estoque'])
    print("Preço:", produto['Preço'])
