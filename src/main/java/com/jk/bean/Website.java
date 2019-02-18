package com.jk.bean;

import lombok.Data;

import java.io.Serializable;

@Data
public class Website implements Serializable {


    private Integer id;

    private String text;

    private String url;

}
