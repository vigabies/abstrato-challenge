// Classe PessoaFisica que herda de Colaborador
public class PessoaFisica extends Colaborador {
    private String nome;
    private String cpf;
    private String rg;
    private int idade;
    private String titulacao;
    private String disciplinas;

    public PessoaFisica(String nome, String cpf, String rg, int idade, String titulacao, String disciplinas, 
                        String logradouro, String numero, String bairro, String cidade, String unidadeFederacao, String telefone, String email) {
        super(logradouro, numero, bairro, cidade, unidadeFederacao, telefone, email);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
        this.titulacao = titulacao;
        this.disciplinas = disciplinas;
    }

    @Override //sobrescrita
    //ele é usado porque estamos fornecendo a implementação concreta do método abstrato mostrarInformacoes() 
    //definido na classe abstrata Colaborador.
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Idade: " + idade);
        System.out.println("Titulação: " + titulacao);
        System.out.println("Disciplinas: " + disciplinas);
        // Exibir também os dados comuns
    }
}