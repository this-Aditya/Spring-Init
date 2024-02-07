package com.springboot.jpahibernate.spring_data_jpa.gadgets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class GadgetCLR implements CommandLineRunner {

    @Autowired
    GadgetRepository repo;

    @Override
    public void run(String... args) throws Exception {
        addGadgets();
        deleteIphone();
        queryAllGadgets();
    }

    public void addGadgets() {
        System.out.println("Adding Gadgets");
        Gadget zFlip = new Gadget();
        zFlip.setId(1);
        zFlip.setCompany("Samsung Galaxy");
        zFlip.setName("Z Flip 5");

        Gadget macbook = new Gadget();
        macbook.setId(2);
        macbook.setCompany("Apple");
        macbook.setName("MacBook-pro 14 with M4-Max, 48 Gb unified memory");

        Gadget iphone = new Gadget();
        iphone.setId(3);
        iphone.setName("Iphone 16-pro");
        iphone.setCompany("Apple");

        repo.save(zFlip);
        repo.save(macbook);
        repo.save(iphone);
    }

    public void deleteIphone() {
        repo.deleteById(3L);
    }

    public void queryAllGadgets() {
        System.out.println(repo.findById(1L));
        System.out.println(repo.findById(2L));
        System.out.println(repo.findById(3L));
    }
}
