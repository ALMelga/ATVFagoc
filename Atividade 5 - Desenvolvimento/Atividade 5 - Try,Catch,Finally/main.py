def calcularDivisao():
    try:
        num1 = float(input("\n""Digite o primeiro número: "))
        num2 = float(input("Digite o segundo número: "))
        resultado = num1 / num2
        print("\n""Resultado da divisão:", resultado)

    #except = catch
        
    except ValueError as ve:
        print("\n""Erro de valor:", ve)

    except ZeroDivisionError:
        print("\n""Erro: Divisão por zero não permitida.")

    finally:
        print("\n""Execução do bloco finally""\n")

calcularDivisao()
