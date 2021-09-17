/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import util.Conexao;
import java.util.List;
import model.localidade.CidadeModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class CidadeRepository extends Conexao{
    private Session session;
    private Transaction transaction;

    public List<CidadeModel> buscar(long IdEstado){
        this.session = HibernateUtil.getSessionFactory().openSession();
        this.transaction = session.beginTransaction();
        
        List<CidadeModel> listaDeCidades = this.session.createQuery("from CidadeModel where IdEstado = "+IdEstado).list();
        
        this.transaction.commit();
        this.session.close();
        return listaDeCidades;
    }
    
    public CidadeModel buscarPorId(Long id) {
        CidadeModel cidadeModel;
        super.inicializa();
        cidadeModel = (CidadeModel) super.getSess().get(CidadeModel.class, id);
        super.executar();
        return cidadeModel;
    }
    
    public List<CidadeModel> buscarPorNome(String nome) {
        List<CidadeModel> listaDeCidades = new ArrayList<>();
        super.inicializa();
        listaDeCidades = super.getSess().createQuery("from CidadeModel where cidadeNome = '"+nome+"'").list();
        super.executar();
        return listaDeCidades;
    }
}
