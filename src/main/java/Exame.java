import java.time.LocalDate;
import java.util.Objects;

public class Exame {
    private int id;
    private String descricao;
    private LocalDate data;
    private double preco;

    public Exame() {
        // Construtor vazio
    }

    public Exame(int id, String descricao, LocalDate data, double preco) {
        this.id = id;
        this.descricao = descricao;
        this.data = data;
        this.preco = preco;
    }

    // Getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Exame [id=" + id + ", descricao=" + descricao + ", data=" + data + ", preco=" + preco + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Exame exame = (Exame) obj;
        return id == exame.id && Double.compare(exame.preco, preco) == 0
                && Objects.equals(descricao, exame.descricao) && Objects.equals(data, exame.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao, data, preco);
    }
}
