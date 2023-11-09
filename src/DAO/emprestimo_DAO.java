/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mysql.fabric.xmlrpc.base.Data;
import conexao.Emprestimo;
import conexao.Livros;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author will
 */
public class emprestimo_DAO {
    
    
     Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Emprestimo> listas = new ArrayList<>();
    
    /**
     *
     * @param objemprestimo
     */
    
   public void fazer_emprestimo(Emprestimo objemprestimo) {
        String sql = "INSERT INTO emprestimo (pedido, cpf_funcionario, cpf_usuario, id_livro, data_emprestimo) VALUES (?, ?, ?, ?, ?)";
        conn = new conexao_DAO().conectaBD();

        
        try {
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objemprestimo.getPedido());
            pstm.setString(2, objemprestimo.getCpfFuncionario());
            pstm.setString(3, objemprestimo.getCpfUsuario());
            pstm.setInt(4, objemprestimo.getIdLivro());
            pstm.setDate(5, new java.sql.Date(objemprestimo.getDataEmprestimo().getTime()));
            //pstm.setDate(6, new java.sql.Date(objemprestimo.getDataDevolucao().getTime()));
           // pstm.setDate(6, new java.sql.Date(objemprestimo.getDataDevolvido().getTime()));
           // pstm.setDouble(7, objemprestimo.getMulta());

            pstm.execute();
        } catch (SQLException erro) {
            erro.printStackTrace();
            JOptionPane.showMessageDialog(null, "emprestimo_DAO fazer_emprestimo: " + erro);
        }
    }


   public ArrayList<Emprestimo> pesquisar_emprestimo(int pedido) {
       conn = new conexao_DAO().conectaBD();
        String sql = "SELECT * FROM emprestimo WHERE pedido = ?";
        
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, pedido);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Emprestimo objemprestimo = new Emprestimo();
                objemprestimo.setId(rs.getInt("pedido"));
                listas.add(objemprestimo);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "emprestimo_DAO pesquisar_emprestimo: " + erro);
        }
        return listas;
    }

    
     public ArrayList<Emprestimo> executarconsulta_emprestimo(String sql)
{
    try
    {
        conn = new conexao_DAO().conectaBD();
        Statement stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);
        return listas;
    }
    catch(SQLException ex)
    {
        System.out.println("Problema com sql");
    }
    
    return null;
   

}
      public void deletar_emprestimo(Emprestimo objemprestimo) {
        String sql = "DELETE FROM emprestimo WHERE pedido = ?";
        conn = new conexao_DAO().conectaBD();

        
        try {
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objemprestimo.getPedido());
            

            pstm.execute();
        } catch (SQLException erro) {
            erro.printStackTrace();
            JOptionPane.showMessageDialog(null, "emprestimo_DAO fazer_emprestimo: " + erro);
        }
    }
    
}
