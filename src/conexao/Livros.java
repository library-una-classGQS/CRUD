/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author will
 */
@Entity
@Table(name = "-livros")
@NamedQueries({
    @NamedQuery(name = "Livros.findAll", query = "SELECT l FROM Livros l"),
    @NamedQuery(name = "Livros.findById", query = "SELECT l FROM Livros l WHERE l.id = :id"),
    @NamedQuery(name = "Livros.findByNome", query = "SELECT l FROM Livros l WHERE l.nome = :nome"),
    @NamedQuery(name = "Livros.findByAutor", query = "SELECT l FROM Livros l WHERE l.autor = :autor"),
    @NamedQuery(name = "Livros.findByEditora", query = "SELECT l FROM Livros l WHERE l.editora = :editora"),
    @NamedQuery(name = "Livros.findByPublicacao", query = "SELECT l FROM Livros l WHERE l.publicacao = :publicacao"),
    @NamedQuery(name = "Livros.findByGereno", query = "SELECT l FROM Livros l WHERE l.gereno = :gereno"),
    @NamedQuery(name = "Livros.findByPaginas", query = "SELECT l FROM Livros l WHERE l.paginas = :paginas"),
    @NamedQuery(name = "Livros.findByClassificacao", query = "SELECT l FROM Livros l WHERE l.classificacao = :classificacao"),
    @NamedQuery(name = "Livros.findByDanificado", query = "SELECT l FROM Livros l WHERE l.danificado = :danificado"),
    @NamedQuery(name = "Livros.findByEndereco", query = "SELECT l FROM Livros l WHERE l.endereco = :endereco"),
    @NamedQuery(name = "Livros.findByEmprestado", query = "SELECT l FROM Livros l WHERE l.emprestado = :emprestado")})
public class Livros implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "autor")
    private String autor;
    @Basic(optional = false)
    @Column(name = "editora")
    private String editora;
    @Basic(optional = false)
    @Column(name = "publicacao")
    private String publicacao;
    @Basic(optional = false)
    @Column(name = "gereno")
    private String gereno;
    @Basic(optional = false)
     @Column(name = "paginas")
    private String paginas;
    @Basic(optional = false)
    @Column(name = "classificacao")
    private String classificacao;
    @Basic(optional = false)
    @Column(name = "danificado")
    private String danificado;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "emprestado")
    private String emprestado;

    public Livros() {
    }

    public Livros(Integer id) {
        this.id = id;
    }

    public Livros(Integer id, String nome, String autor, String editora, String publicacao, String gereno, String paginas, String classificacao, String danificado, String endereco, String emprestado) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.publicacao = publicacao;
        this.gereno = gereno;
        this.paginas = paginas;
        this.classificacao = classificacao;
        this.danificado = danificado;
        this.endereco = endereco;
        this.emprestado = emprestado;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
    }

    public String getGereno() {
        return gereno;
    }

    public void setGereno(String gereno) {
        this.gereno = gereno;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getDanificado() {
        return danificado;
    }

    public void setDanificado(String danificado) {
        this.danificado = danificado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(String emprestado) {
        this.emprestado = emprestado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livros)) {
            return false;
        }
        Livros other = (Livros) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bblioteca.Livros[ id=" + id + " ]";
    }
    
}
