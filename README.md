# Demonstração de Herança em Java - Solutis School Dev Trail

Este repositório apresenta um exemplo prático de aplicação dos conceitos de herança e abstração em Java. O projeto foi elaborado como parte de um exercício prático, com o objetivo de ilustrar como diferentes tipos de entidades podem ser modelados utilizando classes base e derivadas.

## Organização do Projeto

As classes deste projeto estão estruturadas em um pacote chamado `src`, e são utilizadas para representar várias entidades, incluindo pessoas, empregados e suas subclasses especializadas, como administradores, operários, vendedores e fornecedores.

### Classes Incluídas

1. **`Pessoa.java`**:
   - Classe mãe que serve como base para outras entidades, contendo atributos e métodos comuns, como `nome`, `endereco`, e `telefone`.
   - Fornece uma base genérica para classes mais específicas.

2. **`Empregado.java`**:
   - Deriva de `Pessoa`, adicionando propriedades voltadas para empregados, como `codigoSetor`, `salarioBase`, e `imposto`.
   - Implementa o método `calcularSalario()`, que realiza o cálculo do salário líquido após a dedução dos impostos.

3. **`Fornecedor.java`**:
   - Também derivada de `Pessoa`, esta classe inclui atributos específicos de fornecedores, como `valorCredito` e `valorDivida`.
   - Possui o método `obterSaldo()`, que calcula o saldo disponível do fornecedor, considerando crédito e dívida.

4. **`Administrador.java`**:
   - Subclasse de `Empregado`, que acrescenta o atributo `ajudaDeCusto`.
   - O método `calcularSalario()` é sobrescrito para incorporar as ajudas de custo ao cálculo do salário final.

5. **`Operario.java`**:
   - Herda de `Empregado`, adicionando atributos relacionados à produção, como `valorProducao` e `comissao`.
   - O método `calcularSalario()` é redefinido para incluir a comissão baseada no valor da produção.

6. **`Vendedor.java`**:
   - Extende `Empregado` e inclui propriedades relacionadas a vendas, como `valorVendas` e `comissao`.
   - O método `calcularSalario()` é reimplementado para calcular a comissão sobre as vendas.

7. **`Main.java`**:
   - Esta é a classe que contém o método `main()`, responsável por testar as funcionalidades das demais classes.
   - Exibe exemplos práticos de instâncias das classes e seus respectivos resultados.

## Como Funciona

O objetivo principal deste projeto é demonstrar como a herança e a abstração em Java podem ser empregadas para construir um sistema com entidades inter-relacionadas. Cada subclasse acrescenta ou redefine funcionalidades, exemplificando a versatilidade da herança em cenários reais.

### Exemplo Prático

A seguir, um novo exemplo de uso envolvendo um objeto `Administrador`:

```java
Administrador admin = new Administrador("Carlos Silva", "Avenida Central, 123", "1234-5678", 101, 5000.0, 10.0, 800.0);
System.out.println("Salário do Administrador: " + admin.calcularSalario());


