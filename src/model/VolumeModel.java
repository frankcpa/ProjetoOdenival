/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "volume")
public class VolumeModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long idVolume;
    
    @Column(nullable = false, length = 100)
    private String nome;
    
    @Column(nullable = false, length = 150)
    private String descricao;
    
    @Column(nullable = false, length = 4)
    private float altura;

    @Column(nullable = false, length = 4)
    private float largura;
    
    @Column(nullable = false, length = 4)
    private float comprimento;
    
    @Column(nullable = false, length = 6)
    private float peso;

    public long getIdVolume() {
        return idVolume;
    }

    public void setIdVolume(long idVolume) {
        this.idVolume = idVolume;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
}
