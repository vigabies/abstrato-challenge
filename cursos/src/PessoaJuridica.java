// Classe PessoaJuridica que herda de Colaborador
public class PessoaJuridica extends Colaborador {
    private String razaoSocial;
    private String nomeFantasia;
    private String inscricaoMunicipal;
    private String inscricaoEstadual;
    private String cnpj;
    private String website;
    private String disciplinas;

    // Construtor
    public PessoaJuridica(String razaoSocial, String nomeFantasia, String inscricaoMunicipal, String inscricaoEstadual, String cnpj, String website, String disciplinas,
                          String logradouro, String numero, String bairro, String cidade, String unidadeFederacao, String telefone, String email) {
        super(logradouro, numero, bairro, cidade, unidadeFederacao, telefone, email);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.inscricaoMunicipal = inscricaoMunicipal;
        this.inscricaoEstadual = inscricaoEstadual;
        this.cnpj = cnpj;
        this.website = website;
        this.disciplinas = disciplinas;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("Inscrição Municipal: " + inscricaoMunicipal);
        System.out.println("Inscrição Estadual: " + inscricaoEstadual);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Website: " + website);
        System.out.println("Disciplinas: " + disciplinas);
        // Exibir também os dados comuns
    }
}