package utilitarios;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * Autor: Rodolpho Nunes da Silva Rodrigues Sistema:
 */
public class conectaBanco {

    public Statement stm;
    public ResultSet rs;
    private String driver = "org.postgresql.Driver";
    private String caminho = "jdbc:postgresql://localhost:5432/sistemavideoaula";
    private String usuario = "postgres";
    private String senha = "123456";
    public Connection conn;

    public void conexao() {

        try {
            System.setProperty("jdbc.Drivers", driver);
            conn = DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(conectaBanco.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro de conexão: " + ex.getMessage());
        }

    }

    public void executaSQL(String sql) {
        try {
            stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro no Executa SQL " + ex.getMessage());
        }

    }

    public void desconecta() {
        try {
            conn.close();
            JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão: " + ex.getMessage());

        }

    }

}
