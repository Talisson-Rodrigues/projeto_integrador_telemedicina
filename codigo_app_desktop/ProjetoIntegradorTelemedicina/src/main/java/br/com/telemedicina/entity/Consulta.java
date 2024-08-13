
import java.util.Date;

public class Consulta extends Clinica implements Exibir{
    private String formato;
    private Date data;
    private String medico;
    private String paciente;
    private String pagamento;

    public Consulta(Date data, String formato, String medico, String paciente, 
                    String pagamento, String nomeClinica, String cnpjClinica, 
                    String enderecoClinica, String telefoneClinica, 
                    String emailClinica) {
        super(nomeClinica, cnpjClinica, enderecoClinica, telefoneClinica, emailClinica);
        this.data = data;
        this.formato = formato;
        this.medico = medico;
        this.paciente = paciente;
        this.pagamento = pagamento;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    
    @Override
    public String exibeDados() {
        return "Dados da Consulta: \n" + obterDadosClinica() + "\nFormato: " + formato + 
        "\nData: " + data + "\nMedico: " + medico + "\nPaciente: " + paciente + 
        "\nFormato de pagamento:" + pagamento;
    }
}