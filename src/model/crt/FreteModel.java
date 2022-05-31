/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.crt;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import model.FuncionarioModel;
import model.VeiculoModel;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author frank
 */
@Entity
@Table(name = "frete")
public class FreteModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long idFrete;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idMotorista", insertable = true, updatable = true)
    private FuncionarioModel motorista;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idVeiculo", insertable = true, updatable = true)
    private VeiculoModel veiculo;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<FretexEncomendaModel> listaDeEncomendas;
    
    @Column(columnDefinition = "boolean default false")
    private boolean finalizada;

    private String observacao;
    
    @Temporal(TemporalType.DATE)
    private Date previsaoSaida;

    public long getIdFrete() {
        return idFrete;
    }

    public void setIdFrete(long idFrete) {
        this.idFrete = idFrete;
    }

    public FuncionarioModel getMotorista() {
        return motorista;
    }

    public void setMotorista(FuncionarioModel motorista) {
        this.motorista = motorista;
    }

    public VeiculoModel getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(VeiculoModel veiculo) {
        this.veiculo = veiculo;
    }

    public List<FretexEncomendaModel> getListaDeEncomendas() {
        return listaDeEncomendas;
    }

    public void setListaDeEncomendas(List<FretexEncomendaModel> listaDeEncomendas) {
        this.listaDeEncomendas = listaDeEncomendas;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getPrevisaoSaida() {
        return previsaoSaida;
    }

    public void setPrevisaoSaida(Date previsaoSaida) {
        this.previsaoSaida = previsaoSaida;
    }
    
    
}

