
class Exames {
    //____________________Atributos____________________
    private String grauUrgencia;
    private String diagnostico;
    private String tipo;
    private String status;
    //________________Getters e Setters________________
    public String getGrauUrgencia() {
        return this.grauUrgencia;
    }

    public void setGrauUrgencia(String grauUrgencia) {
        this.grauUrgencia = grauUrgencia;
    }
    //-------------------------------------------------
    public String getDiagnostico() {
        return this.diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
    //-------------------------------------------------
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //-------------------------------------------------
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    //_____________________Métodos_____________________
    public String cancelarExame() {
        return "Exame cancelado";
    }

    public String remarcarExame() {
        return "Remarcando exame";
    }
    //______________________Array______________________

}