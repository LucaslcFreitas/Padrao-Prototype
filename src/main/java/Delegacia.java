public class Delegacia implements Cloneable {
    private String unidade;
    private String departamento;
    private String telefone;

    public Delegacia(String unidade, String departamento, String telefone) {
        this.unidade = unidade;
        this.departamento = departamento;
        this.telefone = telefone;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Delegacia{" +
                "unidade='" + unidade + '\'' +
                ", departamento='" + departamento + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
