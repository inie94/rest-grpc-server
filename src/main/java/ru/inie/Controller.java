package ru.inie;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping()
    public ResponseEntity<Object> root() {
        return ResponseEntity.ok().build();
    }
}
