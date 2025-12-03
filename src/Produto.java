public class Produto {
    // Atributos
    private int id;
    private String nome;
    private double preco;

    // Construtor vazio
    public Produto() {
        // Inicializa os atributos com valores padrão
    }

    // Construtor com todos os atributos
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Metodo toString() para exibir o objeto em formato legível
    @Override
    public String toString() {
        return "Produto [ID=" + id + ", Nome=" + nome + ", Preço=" + preco + "]";
    }
}
