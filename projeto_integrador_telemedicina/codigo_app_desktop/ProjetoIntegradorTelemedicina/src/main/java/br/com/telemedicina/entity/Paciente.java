
import java.util.Date;


class Paciente extends Usuario implements Exibir{

    private String alergia;
    private String problemaCronico;
    private String deficiencia;
    private Date dataAgendada;

    public Paciente() {
        super("", null, "", "", "", "", 0);
        this.alergia = "";
        this.problemaCronico = "";
        this.deficiencia = "";
        this.dataAgendada = new Date();
    }

    public Paciente(String alergia, String deficiencia, String problemaCronico,Date dataAgendada, String cpf, Date dataNascimento, 
    String email, String genero, String nomeCompleto, String rg, int telefone) {
        super(cpf, dataNascimento, email, genero, nomeCompleto, rg, telefone);
        this.alergia = alergia;
        this.deficiencia = deficiencia;
        this.problemaCronico = problemaCronico;
        this.dataAgendada = dataAgendada;
    }

    public String agendarConsulta() {
        return "Consulta agendada para:" + dataAgendada;
    }

    public String consultarAgendamento() {
        return "Agendamento pendente";
    }

    public String consultaReceita() {
        return "Receita escrita";
    }

    public String consultaExame() {
        return "Exame consultado";
    }
    
    public String historicoConsulta() {
        return "Todas as consultas!";
    }


    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getProblemCronico() {
        return problemaCronico;
    }

    public void setProblemCronico(String problemaCronico) {
        this.problemaCronico = problemaCronico;
    }

    public String getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(String deficiencia) {
        this.deficiencia = deficiencia;
    }

    public Date getDataAgendada() {
        return dataAgendada;
    }

    public void setDataAgendada(Date dataAgendada) {
        this.dataAgendada = dataAgendada;
    }

    @Override
    public String exibeDados() {
        return "Dados Paciente: \n" + exibeUsuario() + "\nAlergias: " + getAlergia()
        + "\nDeficiência: " + deficiencia + "\nProblema Crônico: " + problemaCronico + "\nData de Agendamento do Exame: " + dataAgendada + "\n";
    }
}
