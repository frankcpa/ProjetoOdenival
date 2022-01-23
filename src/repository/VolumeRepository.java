/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import util.Conexao;
import java.util.ArrayList;
import java.util.List;
import model.VolumeModel;


public class VolumeRepository extends Conexao {

    public void salvar(VolumeModel volume) {
        super.inicializa();
        super.getSess().saveOrUpdate(volume);
        super.executar();
    }

    public VolumeModel buscarPorId(Long id) {
        VolumeModel volume;
        super.inicializa();
        volume = (VolumeModel) super.getSess().get(VolumeModel.class, id);
        super.executar();
        return volume;
    }

    public List<VolumeModel> buscarTodos() {
        List<VolumeModel> listaDeVolumes = new ArrayList<>();
        super.inicializa();
        listaDeVolumes = super.getSess().createQuery("from VolumeModel").list();
        super.executar();
        return listaDeVolumes;
    }
    
    public List<VolumeModel> buscarPorNome(String nome) {
        List<VolumeModel> listaDeVolumes = new ArrayList<>();
        super.inicializa();
        listaDeVolumes = super.getSess().createQuery("from VolumeModel where LOWER(nome) like '%"+nome.toLowerCase()+"%'").list();
        super.executar();
        return listaDeVolumes;
    }

    public void excluir(VolumeModel volume) {
        super.inicializa();
        super.getSess().delete(volume);
        super.executar();
    }

    public void atualizar(VolumeModel volume) {
        super.inicializa();
        super.getSess().update(volume);
        super.executar();

    }
}
