package com.bookclub.Model.Enuns;

import lombok.Data;

public enum Genre {
    SCIENCEFICTION(1, "Ficção cientifica" ),
    TERROR(2, "Terror"),
    DRAMA(3, "Drama"),
    SCIENCE(4, "Science"),
    BIOGRAPHY(5, "Biografia");

    private int code;
    private String description;
    Genre(int code, String description) {
    }
    public String getDescription(){
        return this.description;
    }
    public int getCode(){
        return this.code;
    }


}
