package com.duytran.repository;

import com.duytran.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ProviderRepository extends JpaRepository<Provider, Integer> {
}
