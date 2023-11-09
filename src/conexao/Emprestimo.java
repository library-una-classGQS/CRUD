/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import com.mysql.fabric.xmlrpc.base.Data;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;



/**
 *
 * @author will
 */
@Entity
@Table(name = "emprestimo")
@NamedQueries({
    @NamedQuery(name = "Emprestimo.findAll", query = "SELECT e FROM Emprestimo e"),
    @NamedQuery(name = "Emprestimo.findByCpfFuncionario", query = "SELECT e FROM Emprestimo e WHERE e.cpfFuncionario = :cpfFuncionario"),
    @NamedQuery(name = "Emprestimo.findByCpfUsuario", query = "SELECT e FROM Emprestimo e WHERE e.cpfUsuario = :cpfUsuario"),
    @NamedQuery(name = "Emprestimo.findByIdLivro", query = "SELECT e FROM Emprestimo e WHERE e.idLivro = :idLivro"),
    @NamedQuery(name = "Emprestimo.findByDataEmprestimo", query = "SELECT e FROM Emprestimo e WHERE e.dataEmprestimo = :dataEmprestimo"),
    @NamedQuery(name = "Emprestimo.findByDataDevolucao", query = "SELECT e FROM Emprestimo e WHERE e.dataDevolucao = :dataDevolucao"),
    @NamedQuery(name = "Emprestimo.findByDataDevolvido", query = "SELECT e FROM Emprestimo e WHERE e.dataDevolvido = :dataDevolvido"),
    @NamedQuery(name = "Emprestimo.findByMulta", query = "SELECT e FROM Emprestimo e WHERE e.multa = :multa"),
  @NamedQuery(name = "Emprestimo.findBypedido", query = "SELECT e FROM Emprestimo e WHERE e.pedido = :pedido")})
public class Emprestimo implements Serializable {
    
   

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cpf_funcionario")
    private String cpfFuncionario;
    @Basic(optional = false)
    @Column(name = "funcionario")
    private String funcionario;
    @Basic(optional = false)
    @Column(name = "cpf_usuario")
    private String cpfUsuario;
    @Basic(optional = false)
    @Column(name = "usuario")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "id_livro")
    private int idLivro;
    @Basic(optional = false)
    @Column(name = "nome_livro")
    private String nomeLivro;
    @Column(name = "data_emprestimo")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmprestimo;
    @Basic(optional = false)
     @Column(name = "data_devolucao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDevolucao;
    @Column(name = "data_devolvido")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataDevolvido;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "multa")
    private Double multa;
    @Column(name = "pedido")
    private int  pedido;
    @Column(name = "id")
    private int  id;

    public Emprestimo() {
    }

    

    public Emprestimo(Integer codigo, String cpfFuncionario, String funcionario, String cpfUsuario, String nomeLivro, String usuario, Integer id, Integer pedido, Integer idLivro, Date dataEmprestimo, Date dataDevolucao,Date dataDevolvido) {
       
        this.id = id;
        this.pedido = pedido;
        this.cpfFuncionario = cpfFuncionario;
        this.funcionario = funcionario;
        this.cpfUsuario = cpfUsuario;
        this.usuario = usuario;
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.dataDevolvido = dataDevolvido;
        
        
        
        
    }



    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        this.cpfUsuario = cpfUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }


    public Date getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
      this.dataDevolucao = dataDevolucao;
    }

    public Date getDataDevolvido() {
        return this.dataDevolvido;
    }

    public void setDataDevolvido(Date dataDevolvido) {
        this.dataDevolvido = dataDevolvido;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }
    
    
     public int getPedido() {
        return pedido;
    }
     
      public void setpedido(int pedido) {
        this.pedido = pedido;
    }
     
         public int getId() {
        return id;
    }
     
      public void setId(int id) {
        this.pedido = id;
    }
    

  
}
