/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.crt;

import java.io.Serializable;
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
import model.EmpresaModel;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

/**
 *
 * @author frank
 */
@Entity
@Table(name = "encomenda")
public class EncomendaModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long idEncomenda;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idRemetente", insertable = true, updatable = true)
    private EmpresaModel remetente;

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idDestinatario", insertable = true, updatable = true)
    private EmpresaModel destinatario;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<EncomendaxVolumeModel> listaDeVolumes;
    
    @Column(columnDefinition = "boolean default false")
    private boolean finalizada;

    public long getIdEncomenda() {
        return idEncomenda;
    }

    public void setIdEncomenda(long idEncomenda) {
        this.idEncomenda = idEncomenda;
    }

    public EmpresaModel getRemetente() {
        return remetente;
    }

    public void setRemetente(EmpresaModel remetente) {
        this.remetente = remetente;
    }

    public EmpresaModel getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(EmpresaModel destinatario) {
        this.destinatario = destinatario;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public List<EncomendaxVolumeModel> getListaDeVolumes() {
        return listaDeVolumes;
    }

    public void setListaDeVolumes(List<EncomendaxVolumeModel> listaDeVolumes) {
        this.listaDeVolumes = listaDeVolumes;
    }
    
    
}

