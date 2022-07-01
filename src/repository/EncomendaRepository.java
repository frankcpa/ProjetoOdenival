/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import util.Conexao;
import java.util.ArrayList;
import java.util.List;
import model.crt.EncomendaModel;


public class EncomendaRepository extends Conexao {

    public void salvar(EncomendaModel encomendaModel) {
        super.inicializa();
        super.getSess().saveOrUpdate(encomendaModel);
        super.executar();
        
    }
    
    public EncomendaModel buscarPorId(Long id) {
        EncomendaModel encomenda;
        super.inicializa();
        encomenda = (EncomendaModel) super.getSess().get(EncomendaModel.class, id);
        encomenda.setListaDeVolumes(super.getSess().createQuery("from EncomendaxVolumeModel where idEncomenda = "+id).list());
        super.executar();
        return encomenda;
    }

    public List<EncomendaModel> buscarTodos() {
        List<EncomendaModel> listaDeEncomendas = new ArrayList<>();
        super.inicializa();
        listaDeEncomendas = super.getSess().createQuery("from EncomendaModel where finalizada = false").list();
        super.executar();
        return listaDeEncomendas;
    }
    
    public List<EncomendaModel> buscarPorNome(String nome) {
        List<EncomendaModel> listaDeEncomendas = new ArrayList<>();
        super.inicializa();
        listaDeEncomendas = super.getSess().createQuery("from EncomendaModel where nome like '%"+nome+"%'").list();
        super.executar();
        return listaDeEncomendas;
    }

    public void excluir(EncomendaModel encomendaModel) {
        super.inicializa();
        super.getSess().delete(encomendaModel);
        super.executar();
    }

    public void atualizar(EncomendaModel encomendaModel) {
        super.inicializa();
        super.getSess().update(encomendaModel);
        super.executar();

    }
}
