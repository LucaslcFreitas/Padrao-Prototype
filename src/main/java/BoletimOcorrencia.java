import java.util.Date;
import java.util.Objects;

public class BoletimOcorrencia implements Cloneable {
    private Delegacia delegacia;
    private Date data;
    private String nomeReclamante;
    private int codInfracao;
    private String descricao;

    public BoletimOcorrencia(Delegacia delegacia, Date data, String nomeReclamante, int codInfracao, String descricao) {
        this.delegacia = delegacia;
        this.data = data;
        this.nomeReclamante = nomeReclamante;
        this.codInfracao = codInfracao;
        this.descricao = descricao;
    }

    public Delegacia getDelegacia() {
        return delegacia;
    }

    public void setDelegacia(Delegacia delegacia) {
        this.delegacia = delegacia;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomeReclamante() {
        return nomeReclamante;
    }

    public void setNomeReclamante(String nomeReclamante) {
        this.nomeReclamante = nomeReclamante;
    }

    public int getCodInfracao() {
        return codInfracao;
    }

    public void setCodInfracao(int codInfracao) {
        this.codInfracao = codInfracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public BoletimOcorrencia clone() throws CloneNotSupportedException {
        BoletimOcorrencia boletimClone = (BoletimOcorrencia) super.clone();
        boletimClone.delegacia = (Delegacia) boletimClone.delegacia.clone();
        return boletimClone;
    }

    @Override
    public String toString() {
        return "BoletimOcorrencia{" +
                "delegacia=" + delegacia +
                ", nomeReclamante='" + nomeReclamante + '\'' +
                ", codInfracao=" + codInfracao +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
