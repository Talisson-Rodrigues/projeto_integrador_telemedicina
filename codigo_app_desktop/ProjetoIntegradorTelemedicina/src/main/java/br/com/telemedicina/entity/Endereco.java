
import java.util.Date;

public class Endereco extends Usuario implements Exibir{
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    
    public Endereco(String cpf, Date dataNascimento, String email, String genero, String nomeCompleto, String rg, int telefone, String bairro, String cep, String cidade, String complemento, String estado) {
        super(cpf, dataNascimento, email, genero, nomeCompleto, rg, telefone);
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.complemento = complemento;
        this.estado = estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String exibeEndereco() {
        return "Endereco: " + complemento + "\n" + bairro + "\n" + cidade + "\n" + estado + "\n" + cep;
    }
    
    @Override
    public String exibeDados() {
        return "Dados do Usuario: \n" + exibeUsuario() + "\nEndereco: \n" + exibeEndereco();
    }
}