/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import DAO.conexao_DAO;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;

/**
 *
 * @author Douglas
 */

public class conexao_DAOTest {

    @Test
    public void testConectaBD() {
        conexao_DAO conexaoDAO = new conexao_DAO();
        Connection conn = conexaoDAO.conectaBD();
        
        // Verifique se a conexão não é nula
        assertNotNull(conn);
        
        // Faça mais asserções ou testes específicos relacionados à sua lógica de conexão.
        
        // Exemplo: Verifique se a conexão está fechada corretamente.
        try {
            conn.close();
        } catch (Exception e) {
            fail("Falha ao fechar a conexão: " + e.getMessage());
        }
    }
}