/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import util.Conexao;
import java.util.ArrayList;
import java.util.List;
import model.crt.EncomendaxVolumeModel;


public class EncomendaxVolumeRepository extends Conexao {

    public void salvar(EncomendaxVolumeModel encomendaxVolumeModel) {
        super.inicializa();
        super.getSess().saveOrUpdate(encomendaxVolumeModel);
        super.executar();
    }

    public EncomendaxVolumeModel buscarPorId(Long id) {
        EncomendaxVolumeModel cargo;
        super.inicializa();
        cargo = (EncomendaxVolumeModel) super.getSess().get(EncomendaxVolumeModel.class, id);
        super.executar();
        return cargo;
    }

    public List<EncomendaxVolumeModel> buscarTodos() {
        List<EncomendaxVolumeModel> listaDeEncomendaxVolume = new ArrayList<>();
        super.inicializa();
        listaDeEncomendaxVolume = super.getSess().createQuery("from EncomendaxVolumeModel").list();
        super.executar();
        return listaDeEncomendaxVolume;
    }
    
    public List<EncomendaxVolumeModel> buscarPorNome(String nome) {
        List<EncomendaxVolumeModel> listaDeEncomendaxVolume = new ArrayList<>();
        super.inicializa();
        listaDeEncomendaxVolume = super.getSess().createQuery("from EncomendaxVolumeModel where nome like '%"+nome+"%'").list();
        super.executar();
        return listaDeEncomendaxVolume;
    }
    
     public List<EncomendaxVolumeModel> buscarPorEncomenda(Long idEncomenda) {
        List<EncomendaxVolumeModel> listaDeEncomendaxVolume = new ArrayList<>();
        super.inicializa();
        listaDeEncomendaxVolume = super.getSess().createQuery("from EncomendaxVolumeModel where idEncomenda = "+idEncomenda+"").list();
        super.executar();
        return listaDeEncomendaxVolume;
    }

    public void excluir(EncomendaxVolumeModel encomendaxVolumeModel) {
        super.inicializa();
        super.getSess().delete(encomendaxVolumeModel);
        super.executar();
    }

    public void atualizar(EncomendaxVolumeModel encomendaxVolumeModel) {
        super.inicializa();
        super.getSess().update(encomendaxVolumeModel);
        super.executar();

    }
}
