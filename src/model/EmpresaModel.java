/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.localidade.CidadeModel;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "empresa")
public class EmpresaModel implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpresa;

    @Column(nullable = false, length = 200)
    private String nomeFantasia;

    @Column(nullable = false, length = 100)
    private String razaoSocial;
    
    @Column(length = 90)
    private String email;

    @Column(length = 15)
    private String telefone;
        
    @Column(length = 15)
    private String CNPJ;
    
    @Column(length = 15)
    private String CEI;
    
    @Column(length = 15)
    private String CAEPF;
    
    @Column(length = 15)
    private String CI;
    
    @Column(length = 15)
    private String NIT;
    //********** Informações de endereço
    
    @Column(nullable = false, length = 80)
    private String ruaAvenida;
    
    @Column(nullable = false, length = 80)
    private String bairro;
    
    @Column(nullable = true, length = 8)
    private long cep;
    
    @Column(nullable = false, length = 15)
    private String numero;
    
    @Column(nullable = false, length = 80)
    private String complemento;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idCidade", insertable = true, updatable = true)
    private CidadeModel cidade;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRuaAvenida() {
        return ruaAvenida;
    }

    public void setRuaAvenida(String ruaAvenida) {
        this.ruaAvenida = ruaAvenida;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public CidadeModel getCidade() {
        return cidade;
    }

    public void setCidade(CidadeModel cidade) {
        this.cidade = cidade;
    }

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        String cnpjFormatado = null;
        try{
            MaskFormatter maskFormatter= new MaskFormatter("##.###.###/####-##");
            maskFormatter.setValueContainsLiteralCharacters(false);
            cnpjFormatado = maskFormatter.valueToString(CNPJ);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e, null, JOptionPane.WARNING_MESSAGE);
        }
        return cnpjFormatado;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getCEI() {
        return CEI;
    }

    public void setCEI(String CEI) {
        this.CEI = CEI;
    }

    public String getCAEPF() {
        return CAEPF;
    }

    public void setCAEPF(String CAEPF) {
        this.CAEPF = CAEPF;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
  
}
