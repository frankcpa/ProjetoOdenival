/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import util.Conexao;
import java.util.List;
import model.localidade.EstadoModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class EstadoRepository extends Conexao{
    private Session session;
    private Transaction transaction;

    public List<EstadoModel> buscar(){
        this.session = HibernateUtil.getSessionFactory().openSession();
        this.transaction = session.beginTransaction();
        
        List<EstadoModel> listaDeEstados = this.session.createQuery("from EstadoModel").list();
        
        this.transaction.commit();
        this.session.close();
        return listaDeEstados;
    }
}
