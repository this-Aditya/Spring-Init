package com.springboot.jpahibernate.spring_data_jpa.gadgets;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GadgetRepository extends JpaRepository<Gadget, Long> {

// following some conventions:

    public List<Gadget> findByCompany(String name);
    public List<Gadget> findByName(String naam);
}
