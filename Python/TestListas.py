'''criar uma lista'''

lista_compras = ['banana','laranja','maça']

for x in lista_compras:
    print(x)

'''Adicionar "carro" no final da lista'''
lista_compras.append('carro')
print('\n')
for x in lista_compras:
    print(x)

'''inserir carro na posição 1'''
lista_compras.insert(1,'uva')
print('\n')
for x in lista_compras:
    print(x)

print('\n')

'''deletar a posicão 3 da lista'''
del lista_compras[3]
for x in lista_compras:
    print(x)
print('\n')

'''Retirar um item e mostrar ele'''
item = lista_compras.pop(-1)
print(item)
