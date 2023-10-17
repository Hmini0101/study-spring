package jpabook.jpashop.domain;


import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable // 어딘가에 내장 될수있따
@Getter
public class Address {

    private String city;
    private String street;
    private  String zipcode;

    protected  Address(){ // embeddable 어노테이션 선언된곳의 기본생성자는 public 또는 protected 추천

    }
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
