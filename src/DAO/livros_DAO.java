/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexao.Livros;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author will
 */
public class livros_DAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<Livros> lista = new ArrayList<>();

    public void cadastrar_livros(Livros objlivros) {

        String sql = "insert into livros (nome_livro, autor, editora, publicacao, genero, paginas, classificacao, danificado, endereco, emprestado) values(?,?,?,?,?,?,?,?,?,?)";
        conn = new conexao_DAO().conectaBD();

        try {
            pstm = conn.prepareCall(sql);
            pstm.setString(1, objlivros.getNome());
            pstm.setString(2, objlivros.getAutor());
            pstm.setString(3, objlivros.getEditora());
            pstm.setString(4, objlivros.getPublicacao());
            pstm.setString(5, objlivros.getGereno());
            pstm.setString(6, objlivros.getPaginas());
            pstm.setString(7, objlivros.getClassificacao());
            pstm.setString(8, objlivros.getDanificado());
            pstm.setString(9, objlivros.getEndereco());
            pstm.setString(10, objlivros.getEmprestado());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "livros_DAO cadastrar: " + erro);
        }
    }

    public ArrayList<Livros> pesquisar_livro() {

        String sql = "select * from livros";
        conn = new conexao_DAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Livros objlivros = new Livros();
                objlivros.setId(rs.getInt("id_livro"));
                objlivros.setNome(rs.getString("nome_livro"));
                objlivros.setAutor(rs.getString("autor"));
                objlivros.setEditora(rs.getString("editora"));
                objlivros.setPublicacao(rs.getString("publicacao"));
                objlivros.setGereno(rs.getString("genero"));
                objlivros.setPaginas(rs.getString("paginas"));
                objlivros.setClassificacao(rs.getString("classificacao"));
                objlivros.setDanificado(rs.getString("danificado"));
                objlivros.setEndereco(rs.getString("endereco"));
                objlivros.setEmprestado(rs.getString("emprestado"));

                lista.add(objlivros);
            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "livros_DAO pesquisar: " + erro);
        }
        return lista;
    }
    
    public void alterar_livros(Livros objlivros){
        
        String sql = "update livros set nome_livro = ?, autor =?, editora = ?, publicacao = ?, genero = ?, paginas = ?, classificacao = ?, danificado = ?, endereco = ?, emprestado = ? where id_livro = ?";
        
        conn = new conexao_DAO().conectaBD();

        try {
            pstm = conn.prepareCall(sql);
            
            
            pstm.setString(1, objlivros.getNome());
            pstm.setString(2, objlivros.getAutor());
            pstm.setString(3, objlivros.getEditora());
            pstm.setString(4, objlivros.getPublicacao());
            pstm.setString(5, objlivros.getGereno());
            pstm.setString(6, objlivros.getPaginas());
            pstm.setString(7, objlivros.getClassificacao());
            pstm.setString(8, objlivros.getDanificado());
            pstm.setString(9, objlivros.getEndereco());
            pstm.setString(10, objlivros.getEmprestado());
            pstm.setInt(11, objlivros.getId());

            pstm.execute();
            pstm.close();
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "livros_DAO alterar: " + erro);
        }
        
    }
    
    public ResultSet executarconsulta(String sql)
{
    try
    {
        conn = new conexao_DAO().conectaBD();
        Statement stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);
        return rs;
    }
    catch(SQLException ex)
    {
        System.out.println("Problema com sql");
    }
    
    return null;
   

}
    
    
    }
