package com.springseason.person_beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersonConfig {

    @Bean
    @Qualifier("aName")
//    @Primary // Can only be one primary bean of one type!!
    String name1(){
        return "Aditya";
    }

    @Bean("bName")
//    @Primary // wont work as favBike1 is the primary string, either can use the qualifier
    String name2(){
        return "Deven";
    }

    @Bean
    int age1() {
        return 21;
    }

    @Bean
    int age2() {
        return 22;
    }

    @Bean
    String placeOfBirth1() {
        return "Danta";
    }

    @Bean
    String placeOfBirth2() {
        return "Sikar";
    }

    @Bean
    String favPlace1() {
        return "Salasar";
    }

    @Bean
    String favPlace2() {
        return "Jaisalmer";
    }

    @Bean
    @Primary
    String favBike1() {
        return "Royal Enfield Classic 350 Chrome Bronze";
    }

    @Bean
    String favBike2() {
        return "Royal Enfield Meteor 650";
    }

    @Bean("adityaPlaceInfo")
    PlaceInfo placeInfo1(String placeOfBirth1, String favPlace1) {
        return new PlaceInfo(placeOfBirth1, favPlace1);
    }

    @Bean("devenPlaceInfo")
    @Primary
    PlaceInfo placeInfo2(String placeOfBirth2, String favPlace2) {
        return new PlaceInfo(placeOfBirth2, favPlace2);
    }

    @Bean("adityaBikeInfo")
    BikeInfo bikeInfo1(String favBike1) {
        return new BikeInfo(favBike1);
    }

    @Bean("devenBikeInfo")
    @Primary
    BikeInfo bikeInfo2(String favBike2) {
        return new BikeInfo(favBike2);
    }

    @Bean("Aditya")
    Person aditya(@Qualifier("aName") String name, int age1, PlaceInfo adityaPlaceInfo, BikeInfo adityaBikeInfo) {
        return new Person(name, age1, adityaPlaceInfo.placeOfBirth(), adityaPlaceInfo.favPlace(), adityaBikeInfo.favBike());
    }

    @Bean("Deven")
    Person deven(String bName, int age2, PlaceInfo placeInfo, BikeInfo bikeInfo) {
        return new Person(bName, age2, placeInfo.placeOfBirth(), placeInfo.favPlace(), bikeInfo.favBike());
    }
}

record Person(String name, int age, String placeOfBirth, String favPlace, String favBike) {}

record PlaceInfo(String placeOfBirth, String favPlace) {}

record BikeInfo(String favBike) {}
