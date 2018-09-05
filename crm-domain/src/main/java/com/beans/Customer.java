package com.beans;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class Customer {

    private Integer id;
    private String name;
    private String gender;
    private Integer age;

}
