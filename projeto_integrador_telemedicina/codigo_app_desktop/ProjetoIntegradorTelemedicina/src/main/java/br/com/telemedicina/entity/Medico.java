import java.util.Date;

public class Medico extends Usuario implements Exibir{
    private String registroMedico;
    private String especialidade;
    private String formacao;
    private Date anoGraduacao;
    private Date anoPos;
    private String certificacao;
    private String empregos;
    

    public Medico() {
        super("",null,"","","","",0);
        this.registroMedico = "";
        this.especialidade = "";
        this.formacao = "";
        this.anoGraduacao = null;
        this.anoPos = null;
        this.certificacao = "";
        this.empregos = "";
    }

    public Medico(String cpf, Date dataNascimento, String email, String genero, 
                    String nomeCompleto, String rg, int telefone, Date anoGraduacao, 
                    Date anoPos, String certificacao, String empregos, 
                    String especialidade, String formacao, String registroMedico) {

        super(cpf, dataNascimento, email, genero, nomeCompleto, rg, telefone);
        this.anoGraduacao = anoGraduacao;
        this.anoPos = anoPos;
        this.certificacao = certificacao;
        this.empregos = empregos;
        this.especialidade = especialidade;
        this.formacao = formacao;
        this.registroMedico = registroMedico;
    }

    public String getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(String registroMedico) {
        this.registroMedico = registroMedico;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public Date getAnoGraduacao() {
        return anoGraduacao;
    }

    public void setAnoGraduacao(Date anoGraduacao) {
        this.anoGraduacao = anoGraduacao;
    }

    public Date getAnoPos() {
        return anoPos;
    }

    public void setAnoPos(Date anoPos) {
        this.anoPos = anoPos;
    }

    public String getCertificacao() {
        return certificacao;
    }

    public void setCertificacao(String certificacao) {
        this.certificacao = certificacao;
    }

    public String getEmpregos() {
        return empregos;
    }

    public void setEmpregos(String empregos) {
        this.empregos = empregos;
    }


    public String marcarConsulta() {
        return "Realizar consulta";
    }

    public String prescreveReceita() {
        return "Prescrever medicamento";
    }

    public String editarReceita() {
        return "Editando Receita";
    }

    public String solicitarExame() {
        return "Solicitando exame a uma clinica";
    }

    public String registrarDiagnostico() {
        return "Registrando Diagnostico";
    }

    @Override
    public String exibeDados() {
        return "Dados Medico: \n" + exibeUsuario() + "\nRegistro Medico: " + registroMedico +
                "\nEspecialidade: " + especialidade + "\nFormacao: " + formacao +
                "\nAno de Graduacao: " + anoGraduacao + "\nAno de Pos-Graduacao: " + anoPos +
                "\nCertificacoes: " + certificacao + "\nHistorico de empregos: " + empregos; 
    }
    
}
