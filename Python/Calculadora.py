        def menu():
    print('1. Soma')
    print('2. Subtração')
    print('3. Divisão ')
    print('4. Multiplicação')
    print('5. Sair do Sistema')
    soma = 1
    subtracao = 2
    divisao = 3
    multiplicacao = 4
    sairSistema = 5

def somar():
    if operacao == 1:
        num1 = float(input('Digite um numero: '))
        num2 = float(input('Digite um numero: '))
        resultadoSoma = num1 + num2
        print('O resultado da Soma é: ',resultadoSoma,'\n')

def subtrair():
    if operacao == 2:
        num3 = float(input('Digite um numero: '))
        num4 = float(input('Digite um numero: '))
        resultadoSub = num3 - num4
        print('O resultado da subtração é: ',resultadoSub,'\n')

def dividir():
    try:
        if operacao == 3:
            num5 = float(input('Digite um numero: '))
            num6 = float(input('Digite um numero: '))
            resultadoDiv = num5 / num6
            print('O resultado da divisão é: ',resultadoDiv,'\n')

    except ZeroDivisionError as name_error:
        print(f'Ops encontramos um erro ---> {name_error}','\n')

def multiplicar():
    if operacao == 4:
        num7 = float(input('Digite um numero: '))
        num8 = float(input('Digite um numero: '))
        resultadoMult = num7 * num8
        print('O resultado da multiplicação é: ',resultadoMult,'\n')

while True:

    menu()
    operacao = float(input('Digite qual operação deseja fazer: '))
    if operacao != 5:
        somar()
        subtrair()
        multiplicar()
        dividir()
    else:
        print('Você saiu do sistema')
        break
