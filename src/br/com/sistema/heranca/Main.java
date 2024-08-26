package br.com.sistema.heranca;

public class Main {
    public static void main(String[] args) {
        // Testando a classe Pessoa
        System.out.println("=== Testando a classe Pessoa ===");
        Pessoa pessoa = new Pessoa("João", "Rua X", "1111-2222");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println();

        // Testando a classe Fornecedor
        System.out.println("=== Testando a classe Fornecedor ===");
        Fornecedor fornecedor = new Fornecedor("José", "Rua A", "123456789", 5000.0, 2000.0);
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor Crédito: " + fornecedor.getValorCredito());
        System.out.println("Valor Dívida: " + fornecedor.getValorDivida());
        System.out.println("Saldo: " + fornecedor.obterSaldo());
        System.out.println();

        // Testando a classe Empregado
        System.out.println("=== Testando a classe Empregado ===");
        Empregado empregado = new Empregado("Maria", "Rua B", "987654321", 101, 3000.0, 15.0);
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Código do Setor: " + empregado.getCodigoSetor());
        System.out.println("Salário Base: " + empregado.getSalarioBase());
        System.out.println("Imposto (%): " + empregado.getImposto());
        System.out.println("Salário Líquido: " + empregado.calcularSalario());
        System.out.println();

        // Testando a classe Administrador
        System.out.println("=== Testando a classe Administrador ===");
        Administrador administrador = new Administrador("Carlos", "Rua C", "123987456", 102, 4000.0, 10.0, 500.0);
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código do Setor: " + administrador.getCodigoSetor());
        System.out.println("Salário Base: " + administrador.getSalarioBase());
        System.out.println("Imposto (%): " + administrador.getImposto());
        System.out.println("Ajuda de Custo: " + administrador.getAjudaDeCusto());
        System.out.println("Salário Líquido: " + administrador.calcularSalario());
        System.out.println();

        // Testando a classe Operario
        System.out.println("=== Testando a classe Operario ===");
        Operario operario = new Operario("Lucas", "Rua D", "321654987", 103, 2500.0, 12.0, 20000.0, 5.0);
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Código do Setor: " + operario.getCodigoSetor());
        System.out.println("Salário Base: " + operario.getSalarioBase());
        System.out.println("Imposto (%): " + operario.getImposto());
        System.out.println("Valor de Produção: " + operario.getValorProducao());
        System.out.println("Comissão (%): " + operario.getComissao());
        System.out.println("Salário Líquido: " + operario.calcularSalario());
        System.out.println();

        // Testando a classe Vendedor
        System.out.println("=== Testando a classe Vendedor ===");
        Vendedor vendedor = new Vendedor("Ana", "Rua E", "654321987", 104, 2700.0, 10.0, 15000.0, 4.0);
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Código do Setor: " + vendedor.getCodigoSetor());
        System.out.println("Salário Base: " + vendedor.getSalarioBase());
        System.out.println("Imposto (%): " + vendedor.getImposto());
        System.out.println("Valor de Vendas: " + vendedor.getValorVendas());
        System.out.println("Comissão (%): " + vendedor.getComissao());
        System.out.println("Salário Líquido: " + vendedor.calcularSalario());
        System.out.println();
    }
}
