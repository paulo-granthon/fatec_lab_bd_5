# fatec_lab_bd_5

Resolução dos exercícios da matéria de Laboratório Desenvolvimento de Banco de Dados 5º Semestre Fatec São José dos Campos

## Exercício 1 - Triângulo

Crie um conjunto de casos de teste para validar o programa a seguir:

"O programa lê três valores inteiros que representam os lados de um triângulo. O programa informa se os lados formam um triângulo isósceles, escaleno ou equilátero."

Condição: a soma de dois lados tem que ser maior que o terceiro lado.

- Defina o esqueleto de uma classe Java que resolva o problema acima.
- Escreva casos de teste JUnit para as seguintes situações:
  - Triângulo escaleno válido
  - Triângulo isósceles válido
  - Triângulo equilatero válido
  - Pelo menos 3 casos de teste (CTs) para isósceles válido contendo a permutação dos mesmos valores
  - Um valor zero
  - Um valor negativo
  - A soma de 2 lados é igual ao teceiro lado
  - Para o item acima, um CT para cada permutação de valores
  - CT em que a soma de 2 lados é menor que o terceiro lado
  - Para o item acima, um CT para cada permutação de valores
  - Um CT para os três valores iguais a zero

## Exercício 2 - Person

Considerando o conjunto de classes abaixo. Utilizando um a técnica de TDD, implemente o método isValidToInclude(). Esse método deve retornar uma lista de erros com base no objeto Person passado como parâmetro. Deve ser validado:

- O nome é composto por ao menos 2 partes e deve ser composto de letras
- A idade deve estar no intervalo [1, 200]
- O objeto Person deve ter pelo menos um objeto da classe Email associado
- O nome da classe Email deve estar no formato "_____@____._____", sendo que cada parte deve ter ao menos um caractere

<div align="center">
  <img alt="Diagrama de Classe" src="person-erd.png"/>
</div>

## Exercício 3

Aplicando a técnica de Test Driven Development (TDD), desenvolva as classes necessárias para resolver o problema descrito abaixo:

O participante deve implementar uma calculadora de salário de funcionários. Um funcionário contem nome, email, salário-base e cargo. De acordo com seu cargo, a regra para cálculo do salário líquido é diferente:

- Caso o cargo seja DESENVOLVEDOR, o funcionário terá desconto de 20% caso o salário seja maior ou igual que 3.000,00, ou apenas 10% caso o salário seja menor que isso;
- Caso o cargo seja DBA, o funcionário terá desconto de 25% caso o salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso;
- Caso o cargo seja TESTADOR, o funcionário terá desconto de 25% caso o salário seja maior ou igual que 2.000,00, ou apenas 15% caso o salário seja menor que isso; e
- Caso o cargo seja GERENTE, o funcionário terá desconto de 30% caso o salário seja maior ou igual que 5.000,00, ou apenas 20% caso o salário seja menor que isso.
