import mysql.connector

banco = mysql.connector.connect(
    host="localhost",
    user="root",
    password="cdd12345",
    database="aula04_samuel"
    )


while True:
    x = input('Digite \n 1 para cadastrar aluno\n 2 para pesquisar \n 3 para encerrar \n ')
    if x == '1':
        nome1 = input("Digite o nome do aluno: ")
        telefone1 = input("Digite o telefone do aluno: ")
        cursor = banco.cursor()
        sql = "INSERT INTO ALUNOS (nome,telefone) VALUES (%s,%s)"
        data = (nome1, telefone1)
        cursor.execute(sql, data)
        banco.commit()

    elif x == '2':
        meucursor = banco.cursor()
        pesquisa = 'select * from alunos;'
        meucursor.execute(pesquisa)
        resultado = meucursor.fetchall()
        for x in resultado:
            print(x[0], x[1], x[2])

    else:
        break
