import java.util.Date;

abstract public class Usuario implements Exibir{
    private String nomeCompleto;
    private Date dataNascimento;
    private String genero;
    private int telefone;
    private String email;
    private String cpf;
    private String rg;

    public Usuario() {
        this.nomeCompleto = "";
        this.dataNascimento = null;
        this.genero = "";
        this.email = "";
        this.telefone = 0;
        this.cpf = "";
        this.rg = "";
    }

    public Usuario(String cpf, Date dataNascimento, String email, String genero, String nomeCompleto, String rg, int telefone) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.genero = genero;
        this.nomeCompleto = nomeCompleto;
        this.rg = rg;
        this.telefone = telefone;
    }


    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String exibeUsuario() {
        return "Nome Completo: " + getNomeCompleto() + "\nData de Nascimento: " + getDataNascimento() +
               "\nGenero: " + getGenero() + "\nTelefone: " + getTelefone() + "\nEmail: " + getEmail() +
               "\nCPF: " + getCpf() + "\nRG: " + getRg();
    }
}