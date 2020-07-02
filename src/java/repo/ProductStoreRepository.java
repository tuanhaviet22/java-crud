/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import model.DanhMuc;
import model.SanPham;

/**
 *
 * @author IT NEVA PC
 */
public class ProductStoreRepository {
    String unitName = "hehehehhehe";
    public List<DanhMuc> getAllDanhMuc(){
        EntityManager em = Persistence.createEntityManagerFactory(unitName).createEntityManager();
        String query = String.format("select a from %s a", DanhMuc.class.getName());
        return em.createQuery(query).getResultList();
    } 
    public List<SanPham> getAllSanPham(){
        EntityManager em = Persistence.createEntityManagerFactory(unitName).createEntityManager();
        String query = String.format("SELECT * FROM %s", SanPham.class.getName());
        return em.createQuery(query).getResultList();
    } 
    
    public void saveDanhMuc(DanhMuc dm){
        EntityManager em = Persistence.createEntityManagerFactory(unitName).createEntityManager();
        em.getTransaction().begin();
        em.persist(dm);
        em.getTransaction().commit();
    }
    
    public void saveProduct(SanPham sp){
        EntityManager em = Persistence.createEntityManagerFactory(unitName).createEntityManager();
        em.getTransaction().begin();
        em.persist(sp);
        em.getTransaction().commit();
    }
    
}
