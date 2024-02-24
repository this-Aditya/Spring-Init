package com.spring.restapi.versioning;

import com.spring.restapi.versioning.entities.Name;
import com.spring.restapi.versioning.entities.PersonV1;
import com.spring.restapi.versioning.entities.PersonV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    @GetMapping("/v1/person")
    public PersonV1 getV1Person() {
        return new PersonV1("Aditya Mishra");
    }

    @GetMapping("/v2/person")
    public PersonV2 getV2Person() {
        return new PersonV2(new Name("Aditya", "Mishra"));
    }

    @GetMapping(path = "/person", params = "version=1")
    public PersonV1 getV1PersonParams() {
        return new PersonV1("Aditya Mishra");
    }

    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getV2PersonParams() {
        return new PersonV2(new Name("Aditya", "Mishra"));
    }

    @GetMapping(path = "/person/headers", headers = "X-API-VERSION=1")
    public PersonV1 getV1PersonHeaders() {
        return new PersonV1("Aditya Mishra");
    }

    @GetMapping(path = "/person/headers", headers = "X-API-VERSION=2")
    public PersonV2 getV2PersonHeaders() {
        return new PersonV2(new Name("Aditya", "Mishra"));
    }


    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v1+json")
    public PersonV1 getV1PersonAccept() {
        return new PersonV1("Aditya Mishra");
    }

    @GetMapping(path = "/person/accept", produces = "application/vnd.company.app-v2+json")
    public PersonV2 getV2PersonAccept() {
        return new PersonV2(new Name("Aditya", "Mishra"));
    }
}
