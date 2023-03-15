from utils.formataData import handleFormataData

dados = [
    {"date":"2023-01-01","name":"Confraternização mundial","type":"national", "comentarios": []},
    {"date":"2023-02-21","name":"Carnaval","type":"national", "comentarios": []},
    {"date":"2023-04-07","name":"Sexta-feira Santa","type":"national", "comentarios": []},
    {"date":"2023-04-09","name":"Páscoa","type":"national", "comentarios": []},
    {"date":"2023-04-21","name":"Tiradentes","type":"national", "comentarios": []},
    {"date":"2023-05-01","name":"Dia do trabalho","type":"national", "comentarios": []},
    {"date":"2023-06-08","name":"Corpus Christi","type":"national", "comentarios": []},
    {"date":"2023-09-07","name":"Independência do Brasil","type":"national", "comentarios": []},
    {"date":"2023-10-12","name":"Nossa Senhora Aparecida","type":"national", "comentarios": []},
    {"date":"2023-11-02","name":"Finados","type":"national", "comentarios": []},
    {"date":"2023-11-15","name":"Proclamação da República","type":"national", "comentarios": []},
    {"date":"2023-12-25","name":"Natal","type":"national", "comentarios": []}
]

id = 1
idComentario = 1

while True:
    for feriado in dados:
        dataFeriadoFormatada = handleFormataData(feriado['date'])
        print(f"ID: {id}  --  Data: {dataFeriadoFormatada}")
        id = id + 1

    print("\nDigite a opção desejada:")
    print("1 - Visualizar detalhes de um feriado")
    print("2 - Adicionar comentário")
    print("3 - Remover comentário")
    print("4 - Sair")
    opcao = int(input("> "))

    if (opcao == 1):
        idDigitado = int(input("Informe o ID do feriado que deseja visualizar: "))
        nomeFeriado = dados[idDigitado - 1]['name'] 
        tipoFeriado = dados[idDigitado - 1]['type'] 
        dataFeriadoFormatada = handleFormataData(dados[idDigitado - 1]['date'])
        comentarios = dados[idDigitado - 1]['comentarios'] 

        print("\n\n\n=============== ESTE É O FERIADO ================")
        print(f"Nome do feriado: {nomeFeriado}; Data do feriado: {dataFeriadoFormatada}; Tipo: {tipoFeriado}")

        # comentarios
        for comentario in comentarios:
            if (comentario['textoComentario']): print(f"Comentários: {comentario['textoComentario']}")
            else: print("Ainda não há comentários.")
        print("================================================= \n\n\n")

    
    elif (opcao == 2):
        idDigitado = int(input("\nInforme o ID do feriado que deseja adicionar um comentário: "))
        nomeFeriado = dados[idDigitado - 1]['name']
        textoComentario = input(f"Digite seu comentário sobre o feriado: {nomeFeriado}: ")

        comentarios = dados[idDigitado - 1]['comentarios'].append({"id": idComentario, "textoComentario": textoComentario})

        idComentario = idComentario + 1
    
    elif (opcao == 3):
        idDigitado = int(input("\nInforme o ID do feriado que deseja remover um comentário: "))
        comentarios = dados[idDigitado - 1]['comentarios'] 

        for comentario in comentarios:
            if (comentario['textoComentario']): 
                print("\n\n\n=============== Comentários ================")
                print(f"ID: {comentario['id']}; Comentário: {comentario['textoComentario']}")
                print("================================================= \n\n\n")
            else: print("Ainda não há comentários.")

        idComentarioDigitado = int(input("Digite o ID do comentário que deseja remover: "))

        del(dados[idDigitado - 1]['comentarios'][idComentarioDigitado - 1])
        print("Apagado com sucesso")