package com.sahar.user_management;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
@Tag(name = "PartyMedical")
@Slf4j
public class PersonController {

    @PostMapping(value = "/person", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        log.debug("assume person is inserted ");
        return ResponseEntity.ok(person);
    }

    @GetMapping(value = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> addPerson(@RequestParam Long id) {
        log.debug("assume person is fetched ");
        Person person = new Person();
        person.setId(id);
        person.setFirstName("Sahar");
        person.setLastName("Ahmadi");
        log.debug("person is :{}", person);
        return ResponseEntity.ok(person);
    }

}
