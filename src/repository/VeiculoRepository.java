/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import util.Conexao;
import java.util.ArrayList;
import java.util.List;
import model.VeiculoModel;


public class VeiculoRepository extends Conexao {

    public void salvar(VeiculoModel veiculo) {
        super.inicializa();
        super.getSess().saveOrUpdate(veiculo);
        super.executar();
    }

    public VeiculoModel buscarPorId(Long id) {
        VeiculoModel veiculo;
        super.inicializa();
        veiculo = (VeiculoModel) super.getSess().get(VeiculoModel.class, id);
        super.executar();
        return veiculo;
    }

    public List<VeiculoModel> buscarTodos() {
        List<VeiculoModel> listaDeAduanas = new ArrayList<>();
        super.inicializa();
        listaDeAduanas = super.getSess().createQuery("from VeiculoModel").list();
        super.executar();
        return listaDeAduanas;
    }
    
    public List<VeiculoModel> buscarPorMarca(String marca) {
        List<VeiculoModel> listaDeVeiculos = new ArrayList<>();
        super.inicializa();
        listaDeVeiculos = super.getSess().createQuery("from VeiculoModel where LOWER(marca) like '%"+marca.toLowerCase()+"%'").list();
        super.executar();
        return listaDeVeiculos;
    }
    
    public List<VeiculoModel> buscarPorModelo(String modelo) {
        List<VeiculoModel> listaDeVeiculos = new ArrayList<>();
        super.inicializa();
        listaDeVeiculos = super.getSess().createQuery("from VeiculoModel where LOWER(modelo) like '%"+modelo.toLowerCase()+"%'").list();
        super.executar();
        return listaDeVeiculos;
    }
    
    public List<VeiculoModel> buscarPorPlacaCarreta(String placaCarreta) {
        List<VeiculoModel> listaDeVeiculos = new ArrayList<>();
        super.inicializa();
        listaDeVeiculos = super.getSess().createQuery("from VeiculoModel where LOWER(placaCarreta) like '%"+placaCarreta.toLowerCase()+"%'").list();
        super.executar();
        return listaDeVeiculos;
    }
    
    public List<VeiculoModel> buscarPorPlacaCavalo(String placaCavalo) {
        List<VeiculoModel> listaDeVeiculos = new ArrayList<>();
        super.inicializa();
        listaDeVeiculos = super.getSess().createQuery("from VeiculoModel where LOWER(placaCavalo) like '%"+placaCavalo.toLowerCase()+"%'").list();
        super.executar();
        return listaDeVeiculos;
    }

    public void excluir(VeiculoModel veiculo) {
        super.inicializa();
        super.getSess().delete(veiculo);
        super.executar();
    }

    public void atualizar(VeiculoModel veiculo) {
        super.inicializa();
        super.getSess().update(veiculo);
        super.executar();

    }
}
