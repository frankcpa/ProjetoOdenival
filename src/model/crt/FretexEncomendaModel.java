/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.crt;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author frank
 */
@Entity
@Table(name = "fretexEncomenda")
public class FretexEncomendaModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long idFretexEncomenda;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idFrete", insertable = true, updatable = true)
    private FreteModel frete;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idEncomenda", insertable = true, updatable = true)
    private EncomendaModel encomenda;
   
    private float valorFrete;
    private float valorReembolso;
    
    @Column(columnDefinition = "boolean default false")
    private boolean finalizada;

   
    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public long getIdFretexEncomenda() {
        return idFretexEncomenda;
    }

    public void setIdFretexEncomenda(long idFretexEncomenda) {
        this.idFretexEncomenda = idFretexEncomenda;
    }

    public FreteModel getFrete() {
        return frete;
    }

    public void setFrete(FreteModel frete) {
        this.frete = frete;
    }

    public EncomendaModel getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(EncomendaModel encomenda) {
        this.encomenda = encomenda;
    }

    public float getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(float valorFrete) {
        this.valorFrete = valorFrete;
    }

    public float getValorReembolso() {
        return valorReembolso;
    }

    public void setValorReembolso(float valorReembolso) {
        this.valorReembolso = valorReembolso;
    }
    
}

