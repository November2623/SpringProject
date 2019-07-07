package com.duytran.dao.impl;

import com.duytran.dao.ProviderDao;
import com.duytran.entity.Provider;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProviderDaoImpl implements ProviderDao {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<Provider> getAllProviders() {
        String jql = "SELECT p FROM Provider p ";
        return entityManager.createQuery(jql, Provider.class).getResultList();
    }

    @Override
    public Provider getProviderById(int id) {
        String jql = "SELECT p FROM Provider p WHERE p.id=" + id;
        return entityManager.createQuery(jql, Provider.class).getSingleResult();
    }

    @Override
    public void addProvider(Provider provider) {
        entityManager.persist(provider);

    }

    @Override
    public void deleteProvider(Provider provider){
        String jql = "DELETE FROM Provider p WHERE p.id=" + provider.getId();
        entityManager.createQuery(jql, Provider.class);
    }

    @Override
    public void updateProvider(Provider provider) {
        entityManager.merge(provider);
    }
}