def menu():
    print("1. cadastro\n"
          "2. consulta\n"
          "3. excluir\n")

def cadastro():
    dados = []
    nome = input("Digite o nome: ")
    telefone = input("Digite o telefone: ")
    email = input("Digite o email: ")
    dados.append(nome)
    dados.append(telefone)
    dados.append(email)
    return dados

while True:
    menu()
    opcao = int(input("Digite a opção desejada: "))
    if opcao == 1:
        print(cadastro())
    elif opcao == 2:
        print("consulta")
    elif opcao == 3:
        print("excluir")
    else:
        print("opção inválida")
    continuar = input("Deseja continuar? (s/n) ")

