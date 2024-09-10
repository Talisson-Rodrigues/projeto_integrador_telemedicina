
import java.util.Date;

class Prescricao extends Medico implements Exibir{
    //____________________Atributos____________________
    private String medicamentos;
    private String assinatura;
    private Date dataPrescricao;
    

    public Prescricao(String assinatura, String medicamentos,Date dataPrescricao, String cpf, Date dataNascimento, String email, String genero, String nomeCompleto, String rg, int telefone, Date anoGraduacao, Date anoPos, String certificacao, String empregos, String especialidade, String formacao, String registroMedico) {
        super(cpf, dataNascimento, email, genero, nomeCompleto, rg, telefone, anoGraduacao, anoPos, certificacao, empregos, especialidade, formacao, registroMedico);
        this.assinatura = assinatura;
        this.medicamentos = medicamentos;
        this.dataPrescricao = dataPrescricao;
    }
    //________________Getters e Setters________________
    public String getMedicamentos() {
        return this.medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }
    //-------------------------------------------------
    public String getAssinatura() {
        return this.assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }
    //-------------------------------------------------
    public Date getDataPrescricao() {
        return dataPrescricao;
    }

    public void setDataPrescricao(Date dataPrescricao) {
        this.dataPrescricao = dataPrescricao;
    }
    //_____________________Métodos_____________________
    public String baixarPrescricao() {
        return "Baixando a prescrição";
    }

    @Override
    public String exibeDados() {
        return "Dados da Prescricao: \n" + getAssinatura() + "\n" + getMedicamentos();
    }
}