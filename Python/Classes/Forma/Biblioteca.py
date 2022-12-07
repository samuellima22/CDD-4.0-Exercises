class Forma():
    def __init__(self, area, perimetro):
        self.area = area
        self.perimetro = perimetro

class Retangulo(Forma):
    def calcularArea_r(self, base, altura):
        self.area = base * altura
        print(f'A area do retangulo é: {self.area} ')

    def calcularPerimetro_r(self, base, altura):
        self.perimetro = (base + altura)*2
        print(f'O perimetro do retângulo é: {self.perimetro}')

class Triangulo(Forma):
    def calcularArea_t(self, base, altura):
        self.area = (base*altura)/2
        print(f'A área do Triangulo é: {self.area}')

    def calcularPerimetro_t(self, base, altura_a, altura_b):
        self.perimetro = base + altura_a + altura_b
        print(f'O perimetro do triangulo é: {self.area}')
