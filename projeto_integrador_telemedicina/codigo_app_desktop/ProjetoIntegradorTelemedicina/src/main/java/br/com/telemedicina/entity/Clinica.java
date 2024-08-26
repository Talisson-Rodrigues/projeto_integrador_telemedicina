import java.util.Date;

public class Clinica implements Exibir{
    //atributos
    private String nomeClinica;
    private String cnpjClinica;
    private String enderecoClinica;
    private String telefoneClinica;
    private String emailClinica;
    
    //construtor
    public Clinica(String nomeClinica, String cnpjClinica, String enderecoClinica, String telefoneClinica,
            String emailClinica) {
        this.nomeClinica = nomeClinica;
        this.cnpjClinica = cnpjClinica;
        this.enderecoClinica = enderecoClinica;
        this.telefoneClinica = telefoneClinica;
        this.emailClinica = emailClinica;
    }

    //Getters e Setters
    public String getNomeClinica() {
        return nomeClinica;
    }

    public void setNomeClinica(String nomeClinica) {
        this.nomeClinica = nomeClinica;
    }

    public String getCnpjClinica() {
        return cnpjClinica;
    }

    public void setCnpjClinica(String cnpjClinica) {
        this.cnpjClinica = cnpjClinica;
    }

    public String getEnderecoClinica() {
        return enderecoClinica;
    }

    public void setEnderecoClinica(String enderecoClinica) {
        this.enderecoClinica = enderecoClinica;
    }

    public String getTelefoneClinica() {
        return telefoneClinica;
    }

    public void setTelefoneClinica(String telefoneClinica) {
        this.telefoneClinica = telefoneClinica;
    }

    public String getEmailClinica() {
        return emailClinica;
    }

    public void setEmailClinica(String emailClinica) {
        this.emailClinica = emailClinica;
    }

    //Métodos
    public String obterDadosClinica() {
        return "Nome da Clinica: " + getNomeClinica() + 
        "\nCNPJ da Clinica: " + getCnpjClinica() + 
        "\nEndereço da Clinica: " + getEnderecoClinica() + 
        "\nTelefone da Clinica: " + getTelefoneClinica() + 
        "\nEmail da Clinica: " + getEmailClinica();
    }

    public void agendarConsulta(Date data, String hora, int idMedico, int idPaciente) {        
        System.out.println("Consulta marcada com sucesso para: " + data + " as " + hora);
    }

    public String cancelarConsulta() {
        return "Consulta cancelada com sucesso!";
    }

    public String remarcarConsulta(Date data) {
        return "Nova data: " + data;
    }

    public void gerarRelatorioAtendimento(Date dataInicio, Date dataFim) {

    }

    @Override
    public String exibeDados() {
        return "Dados da Clinica:" +
        "\nNome da Clinica: " + getNomeClinica() + 
        "\nCNPJ da Clinica: " + getCnpjClinica() + 
        "\nEndereço da Clinica: " + getEnderecoClinica() + 
        "\nTelefone da Clinica: " + getTelefoneClinica() + 
        "\nEmail da Clinica: " + getEmailClinica();
    }
}
