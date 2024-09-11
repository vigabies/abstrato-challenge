
public abstract class Colaborador {
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String unidadeFederacao;
    private String telefone;
    private String email;

    //construtor
    public Colaborador(String logradouro, String numero, String bairro, String cidade, String unidadeFederacao,
            String telefone, String email) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.unidadeFederacao = unidadeFederacao;
        this.telefone = telefone;
        this.email = email;
    }

    // Métodos getters e setters
    public abstract void mostrarInformacoes(); 
}
