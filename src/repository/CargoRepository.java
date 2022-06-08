/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import util.Conexao;
import java.util.ArrayList;
import java.util.List;
import model.CargoModel;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;


public class CargoRepository extends Conexao {

    public void salvar(CargoModel cargoModel) {
        super.inicializa();
        super.getSess().saveOrUpdate(cargoModel);
        super.executar();
    }

    public CargoModel buscarPorId(Long id) {
        CargoModel cargo;
        super.inicializa();
        cargo = (CargoModel) super.getSess().get(CargoModel.class, id);
        super.executar();
        return cargo;
    }

    public List<CargoModel> buscarTodos() {
        List<CargoModel> listaDeCargos = new ArrayList<>();
        super.inicializa();
        listaDeCargos = super.getSess().createQuery("from CargoModel").list();
        super.executar();
        return listaDeCargos;
    }
    
    public List<CargoModel> buscarPorNome(String nome) {
        List<CargoModel> listaDeCargos = new ArrayList<>();
        super.inicializa();
        listaDeCargos = super.getSess().createQuery("from CargoModel where nome like '%"+nome+"%'").list();
        super.executar();
        return listaDeCargos;
    }
    
    public long BuscaCargoId(String nome) {
        CargoModel cargo = new CargoModel();
        super.inicializa();
        Criteria criteria = super.getSess().createCriteria(CargoModel.class);
        cargo = (CargoModel) criteria.add(Restrictions.eq("nome", nome)).uniqueResult();
        super.executar();
        return cargo.getIdCargo();
    }

    public void excluir(CargoModel cargo) {
        super.inicializa();
        super.getSess().delete(cargo);
        super.executar();
    }

    public void atualizar(CargoModel cargo) {
        super.inicializa();
        super.getSess().update(cargo);
        super.executar();

    }
}
