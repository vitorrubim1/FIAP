alunosVestibular = "Jose dos Santos,7,Sao Paulo;Sandra Silva,6.5,Sao Jose do Rio Preto;Augusto Soares,8,Sao Paulo;Vanderlei Azevedo,5.65,Santos;Vanessa Ferreira,9,Sao Paulo;Natan Cruz,10,Sao Paulo."
alunos = alunosVestibular.split(';')
candidatosAprovados = {}

for aluno in alunos:
    # Dividir os dados do aluno separados por ','
    dados = aluno.split(',')
    nome = dados[0]
    nota = float(dados[1])
    cidade = dados[2]
    
    if nota >= 7:
        candidatosAprovados[nome] = {
            'Nome': nome,
            'Nota': nota,
            'Cidade': cidade
        }

for candidato in candidatosAprovados.values():
    print("-------------")
    print("Nome:", candidato['Nome'])
    print("Nota:", candidato['Nota'])
    print("Cidade:", candidato['Cidade'])
