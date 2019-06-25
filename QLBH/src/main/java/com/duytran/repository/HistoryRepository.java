package com.duytran.repository;

import com.duytran.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface HistoryRepository extends JpaRepository<History, Integer> {

}