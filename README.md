
# JavaCompiler

Este projeto implementa um compilador simples para expressões aritméticas em Java.
Ele realiza análise léxica, análise sintática e geração de código para expressões envolvendo operações como soma, subtração, multiplicação e divisão.

## Estrutura do Projeto

- **Análise Léxica**: Responsável por identificar os tokens na entrada.
  - `AnaliseLexica.java`
  - `Token.java`
  - `TokenType.java`

- **Análise Sintática**: Constrói a árvore sintática a partir dos tokens.
  - `Parser.java`
  - `ArvoreSintatica.java`

- **Representação de Expressões**: Classes que representam os diferentes tipos de expressões.
  - `Exp.java`
  - `Num.java`
  - `Soma.java`
  - `Sub.java`
  - `Mult.java`
  - `Div.java`

- **Geração de Código**: Gera o código correspondente à árvore sintática.
  - `CodeGen.java`

- **Compilador Principal**: Classe principal que integra todas as etapas do compilador.
  - `Compilador.java`

## Como Compilar ou Interpretar

1. **Compilação**: Compile todos os arquivos `.java` presentes no repositório.

   ```bash
   javac *.java
   ```

2. **Execução**: Execute a classe principal `Compilador` passando como argumento o caminho para o arquivo de entrada contendo a expressão a ser compilada.

   ```bash
   java Compilador caminho/para/arquivo_de_entrada
   ```

   Exemplo:

   ```bash
   java Compilador teste
   ```

3. **Execução**: Execute a classe principal `Interpretador` passando como argumento o caminho para o arquivo de entrada contendo a expressão a ser Interpretada.

   ```bash
   java Interpretador caminho/para/arquivo_de_entrada
   ```

   Exemplo:

   ```bash
   java Interpretador teste
   ```
   
## Exemplos de Entrada

O repositório contém alguns arquivos de exemplo que podem ser utilizados para testar o compilador:

- `teste`
- `teste2`
- `teste_div`
- `teste_sub`
- `testenum`

Cada um desses arquivos contém uma expressão aritmética que o compilador pode processar.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
