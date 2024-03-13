class Funcionario:
    def __init__(self, nome, departamento, horasTrabalhadasNoMes):
        self.nome = nome
        self.departamento = departamento
        self.horas_trabalhadas_no_mes = horasTrabalhadasNoMes

max_funcionarios = 5
funcionarios = []

print("Digite as informações de 5 funcionarios:\n")

for i in range(max_funcionarios):
    nome = input(f"Digite o nome do funcionario {i + 1}: ")
    
    try:
        departamento = int(input(f"Digite o departamento do funcionario {i + 1} (1 = Administrativo / 2 = Producao): "))
        if departamento not in [1, 2]:
            print("Erro! Departamento invalido!")
            exit()
    except ValueError:
        print("Erro! Departamento deve ser um número.")
        exit()

    try:
        horas_trabalhadas_no_mes = float(input(f"Digite as horas trabalhadas no mes do funcionario {i + 1}: "))
    except ValueError:
        print("Erro! Horas trabalhadas deve ser um número.")
        exit()

    funcionario = Funcionario(nome, departamento, horas_trabalhadas_no_mes)
    funcionarios.append(funcionario)
    print ("\n")


#funcoes para calculo

def calcularSalarioBase(horasTrabalhadasNoMes,departamento):
    valorDaHoradeTrabalhoDepartamento1 = 22
    valorDaHoradeTrabalhoDepartamento2 = 12

    if departamento == 1:
        valorHoradeTrabalho = valorDaHoradeTrabalhoDepartamento1
    elif departamento == 2:
        valorHoradeTrabalho = valorDaHoradeTrabalhoDepartamento2
    else:
        return 0

    salarioBase = valorHoradeTrabalho * horasTrabalhadasNoMes
    return salarioBase

def calcularhoraExtra(valorHoradeTrabalho,horasTrabalhadasNoMes):
    horasExtras = 0

    if horasTrabalhadasNoMes > 40:
        horasAdicionais = horasTrabalhadasNoMes - 40
    horasExtras = (valorHoradeTrabalho * 2) * horasAdicionais

    return horasExtras


def calcularInsalubridade(departamento,salarioBase):
    insalubridade = 0
    if departamento == 2:
        insalubridade = salarioBase * 0.15
    return insalubridade

def calcularBonificacao(departamento, horasTrabalhadasNoMes, salarioBase):
    bonificacao = 0
    if departamento == 1:
        if 20 < horasTrabalhadasNoMes < 30:
            bonificacao = salarioBase * 0.03
        elif 30 < horasTrabalhadasNoMes < 40:
            bonificacao = salarioBase * 0.05
        elif horasTrabalhadasNoMes > 40:
            bonificacao = salarioBase * 0.10
    return bonificacao

def calcularSalarioBruto(salarioBase,horasExtras,insalubridade,bonificacao):
    salarioBruto = salarioBase + horasExtras + insalubridade + bonificacao
    return salarioBruto

def calcularSalarioLiquido(salarioBruto):
    inss = salarioBruto * 0.07
    impostoDeRenda = salarioBruto * 0.12
    planoDeSaude = 20
    salarioLiquido = salarioBruto - inss - impostoDeRenda - planoDeSaude
    return salarioLiquido


print("\nTABELA DE FUNCIONARIOS:\n")

headers = ["Ordem","Nome","S.Base","Hora Extra","Insalubridade","Bonificacao","INSS","Imp.Renda","P.Saude","S.Liquido"]
print("{:<20} {:<20} {:<18} {:<15} {:<18} {:<15} {:<10} {:<15} {:<10} {:<18}".format(*headers))

for i in range(max_funcionarios):
    salarioBase = calcularSalarioBase(funcionarios[i].horas_trabalhadas_no_mes, funcionarios[i].departamento)
    horasExtras = calcularhoraExtra(salarioBase, funcionarios[i].horas_trabalhadas_no_mes)
    insalubridade = calcularInsalubridade(funcionarios[i].departamento, salarioBase)
    bonificacao = calcularBonificacao(funcionarios[i].departamento, funcionarios[i].horas_trabalhadas_no_mes, salarioBase)
    salarioBruto = calcularSalarioBruto(salarioBase, horasExtras, insalubridade, bonificacao)
    inss = salarioBruto * 0.07
    impostoDeRenda = salarioBruto * 0.12
    planoDeSaude = 20
    salarioLiquido = calcularSalarioLiquido(salarioBruto)

    row = [f"Funcionario(a) {i + 1}", funcionarios[i].nome, salarioBase, horasExtras, insalubridade, bonificacao, inss, impostoDeRenda, planoDeSaude, salarioLiquido]
    print("{:<20} {:<20} {:<18.2f} {:<15.2f} {:<18.2f} {:<15.2f} {:<10.2f} {:<15.2f} {:<10} {:<18.2f}".format(*row))
