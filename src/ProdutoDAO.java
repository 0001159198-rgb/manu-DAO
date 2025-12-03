import java.sql.*;

public class ProdutoDAO {

    // Metodo CREATE: Adiciona um produto no banco
    public void create(Produto p) {
        String sql = "INSERT INTO produtos (id, nome, preco) VALUES (?, ?, ?)";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getNome());
            stmt.setDouble(3, p.getPreco());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao adicionar produto: " + e.getMessage());
        }
    }

    // Metodo READ: Recupera todos os produtos
    public void read() {
        String sql = "SELECT * FROM produtos";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                double preco = rs.getDouble("preco");
                System.out.println(new Produto(id, nome, preco));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao ler produtos: " + e.getMessage());
        }
    }

    // Metodo UPDATE: Atualiza um produto no banco
    public void update(Produto p) {
        String sql = "UPDATE produtos SET nome = ?, preco = ? WHERE id = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getPreco());
            stmt.setInt(3, p.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar produto: " + e.getMessage());
        }
    }

    // Metodo DELETE: Remove um produto do banco
    public void delete(int id) {
        String sql = "DELETE FROM produtos WHERE id = ?";
        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao excluir produto: " + e.getMessage());
        }
    }
}
