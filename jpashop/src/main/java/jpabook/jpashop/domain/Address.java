package jpabook.jpashop.domain;


import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable // 어딘가에 내장 될수있따
@Getter
public class Address {

    private String city;
    private String street;
    private  String zipcode;
}
