import sys

def MaquinaPilha(entrada):
    pilha = []
    for linha in entrada:
        linha = linha.strip()
        if linha.startswith('PUSH'):
            pilha.append(linha.split()[1])
        if linha.startswith('MULT'):
            x = pilha.pop()
            y = pilha.pop()
            pilha.append(str(float(y) * float(x)))
        if linha.startswith('ADD'):
            x = pilha.pop()
            y = pilha.pop()
            pilha.append(str(float(y) + float(x)))
        if linha.startswith('SUB'):
            x = pilha.pop()
            y = pilha.pop()
            pilha.append(str(float(y) - float(x)))
        if linha.startswith('DIV'):
            x = pilha.pop()
            y = pilha.pop()
            if float(x) == 0:
                raise ZeroDivisionError("Divisão por zero não é permitida.")
            pilha.append(str(float(y) / float(x)))
        if linha.startswith('PRINT'):
            print(pilha.pop())
            

def main():
    try:
        entrada = open(sys.argv[1], 'r')
        MaquinaPilha(entrada)
    except FileNotFoundError:
        print(f"Arquivo {sys.argv[1]} não encontrado.")

#python3 MaquinaPilha.py exemplo.txt
main()