public class Main {

    public static void main(String[] args) {
        ProdutoDAO produtoDAO = new ProdutoDAO();

        // Criando um novo produto
        Produto p1 = new Produto(1, "Camiseta", 39.90);
        produtoDAO.create(p1);
        System.out.println("Produto criado: " + p1);

        // Lendo todos os produtos
        System.out.println("\nProdutos no banco:");
        produtoDAO.read();

        // Atualizando o produto
        p1.setNome("Camiseta Estampada");
        p1.setPreco(49.90);
        produtoDAO.update(p1);
        System.out.println("\nProduto atualizado: " + p1);

        // Deletando o produto
        produtoDAO.delete(p1.getId());
        System.out.println("\nProduto excluído: " + p1);
    }
}
