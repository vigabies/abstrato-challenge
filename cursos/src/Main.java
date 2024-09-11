public class Main {
    public static void main(String[] args) {
        // Criando um objeto PessoaFisica
        PessoaFisica pessoaFisica = new PessoaFisica(
            "João Silva", "123.456.789-00", "12.345.678-9", 35, "Mestre",
            "Matemática, Física", "Rua A", "123", "Bairro X", "Cidade Y",
            "SP", "99999-9999", "joao@example.com"
        );

        // Criando um objeto PessoaJuridica
        PessoaJuridica pessoaJuridica = new PessoaJuridica(
            "Treinamentos XYZ Ltda.", "XYZ Treinamentos", "987654321", 
            "123456789", "12.345.678/0001-99", "www.xyztreinamentos.com", 
            "Programação, Gestão de Projetos", "Rua B", "456", "Bairro Z", 
            "Cidade W", "RJ", "88888-8888", "contato@xyztreinamentos.com"
        );

        // Exibindo as informações dos colaboradores
        System.out.println("Informações da Pessoa Física:");
        pessoaFisica.mostrarInformacoes();
        System.out.println();  // Espaço entre as informações

        System.out.println("Informações da Pessoa Jurídica:");
        pessoaJuridica.mostrarInformacoes();
    }
}
