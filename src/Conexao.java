import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    // Constantes de configuração de banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
    private static final String USUARIO = "root";
    private static final String SENHA = "sua_senha";

    // Metodo estatico para obter uma conexao com o banco
    public static Connection getConnection() {
        try {
            // Estabelece a conexao com o banco de dados
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            // Trata a excecao se a conexao falhar
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return null;
        }
    }
}
