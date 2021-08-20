package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Inovice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface InoviceDao extends CrudRepository<Inovice,Integer> {
    List<Inovice> findAllByNumber(int number);
}
