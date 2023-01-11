package com.bookclub.Model;

import com.bookclub.Model.Enuns.Genre;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class User {

    private String id;
    private String name;
    private LocalDate birthDate;
    private Genre favoriteGenre;


}
