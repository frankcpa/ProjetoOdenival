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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "funcionario")
@PrimaryKeyJoinColumn(name = "idPessoa")
public class FuncionarioModel extends PessoaModel implements Serializable {

    @ManyToOne(fetch = FetchType.EAGER)
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "idCargo", insertable = true, updatable = true)
    private CargoModel cargo;

    @Column(nullable = false, length = 30)
    private String login;

    @Column(nullable = false, length = 8)
    private String senha;  

    @Column(nullable = true, length = 15)
    private String carteiraDeMotorista;  
    
    public CargoModel getCargo() {
        return cargo;
    }

    public void setCargo(CargoModel cargo) {
        this.cargo = cargo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCarteiraDeMotorista() {
        return carteiraDeMotorista;
    }

    public void setCarteiraDeMotorista(String carteiraDeMotorista) {
        this.carteiraDeMotorista = carteiraDeMotorista;
    }

}
