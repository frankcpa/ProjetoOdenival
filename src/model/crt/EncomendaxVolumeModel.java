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
import model.VolumeModel;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author frank
 */
@Entity
@Table(name = "encomendaxVolume")
public class EncomendaxVolumeModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long idEncomendaxVolume;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idEncomenda", insertable = true, updatable = true)
    private EncomendaModel encomenda;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idVolume", insertable = true, updatable = true)
    private VolumeModel volume;
    
    private float pesototal;
    private String descricaoProduto;
    
    @Column(columnDefinition = "boolean default false")
    private boolean finalizada;

    public EncomendaxVolumeModel(){
        this.encomenda = new EncomendaModel();
        this.volume = new VolumeModel();
    }
    
    public long getIdEncomendaxVolume() {
        return idEncomendaxVolume;
    }

    public void setIdEncomendaxVolume(long idEncomendaxVolume) {
        this.idEncomendaxVolume = idEncomendaxVolume;
    }

    public EncomendaModel getEncomenda() {
        return encomenda;
    }

    public void setEncomenda(EncomendaModel encomenda) {
        this.encomenda = encomenda;
    }

    public VolumeModel getVolume() {
        return volume;
    }

    public void setVolume(VolumeModel volume) {
        this.volume = volume;
    }

    public float getPesototal() {
        return pesototal;
    }

    public void setPesototal(float pesototal) {
        this.pesototal = pesototal;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    
}

