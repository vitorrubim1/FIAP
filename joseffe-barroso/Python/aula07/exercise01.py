
clients = []

while True:
  nome = input("Nome do cliente: ")
  idade = int(input("Idade do cliente: "))
  profissao = input("Profissão do cliente: ")
  salario = float(input("Salário do cliente: "))

  client = {"nome": nome, "idade": idade, "profissao": profissao, "salario": salario}

  has_bank_account = input("O cliente tem conta bancária (s/n)? ").lower()

  while (has_bank_account != "s" and has_bank_account != "n"):
      print("Digite somente (s/n)")
      has_bank_account = input("O cliente tem conta bancária (s/n)? ").lower()

  banks = []
  if has_bank_account == 's':
      banco = input("Banco: ")
      agencia = input("Agência: ")
      numero = input("Número: ")

      bank_account = {"banco": banco, "agencia": agencia, "numero": numero};
      banks.append(bank_account)

      has_other_bank_account = input("O cliente possui mais alguma conta bancária (s/n)? ")
      while (has_other_bank_account != "s" and has_other_bank_account != "n"):
          print("Digite somente (s/n)")
          has_other_bank_account = input("O cliente possui mais alguma conta bancária (s/n)? ")
      
      while has_other_bank_account == 's':
        banco = input("Banco: ")
        agencia = input("Agência: ")
        numero = input("Número: ")

        bank_account = {"banco": banco, "agencia": agencia, "numero": numero};
        banks.append(bank_account)

        has_other_bank_account = input("O cliente possui mais alguma conta bancária (s/n)? ")

      client["contas_bancarias"] = banks

  clients.append(client)

  next_client = input("Cadastrar outro cliente (s/n)? ").lower()
  while (next_client != "s" and next_client != "n"):
      print("Digite somente (s/n)")
      next_client = input("Cadastrar outro cliente (s/n)? ").lower()

  if next_client == "n":
      break

print("\nDados dos clientes:")
for client in clients:
  print(f"\nNome: {client['nome']}; Idade: {client['idade']}; Profissão: {client['profissao']}; Salário: {client['salario']};", )
if client['contas_bancarias']:
  print("Contas bancárias:")
for bank_account in client['contas_bancarias']:
  print(f"Banco: {bank_account['banco']}")
