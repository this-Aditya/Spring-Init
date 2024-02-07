package com.springboot.jpahibernate.spring_data_jpa.gadgets;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GadgetRepository extends JpaRepository<Gadget, Long> {
}
