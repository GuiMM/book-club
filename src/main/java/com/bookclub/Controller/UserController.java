package com.bookclub.Controller;

import com.bookclub.Model.Enuns.Genre;
import com.bookclub.Model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.UUID;

@Controller
@RequestMapping("")
public class UserController {

    @GetMapping("/users")
    public ResponseEntity GetUsers(){
        UUID generateId = UUID.randomUUID();
        LocalDate birthDate = LocalDate.of(1993,01,23);
        User user = User.builder().id(generateId.toString()).name("Elias").birthDate(birthDate).favoriteGenre(Genre.SCIENCEFICTION).build();
        ResponseEntity result = new ResponseEntity<>(user,HttpStatus.OK);
        return result;
    }
}
