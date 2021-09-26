package com.example.parse;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.BeforeClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletResponse;

public class PersonAPI {

    @Autowired
    private PersonService personService;

    @PostMapping(
            value = "/createPerson", consumes = "application/json", produces = "application/json")
    public Person createPerson(@RequestBody Person person) {
        return personService.saveUpdatePerson(person);
    }

    @PostMapping(
            value = "/updatePerson", consumes = "application/json", produces = "application/json")
    public Person updatePerson(@RequestBody Person person, HttpServletResponse response) {
        response.setHeader("Location", ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/findPerson/" + person.getId()).toUriString());

        return personService.saveUpdatePerson(person);
    }

    @BeforeClass
    public static void runBeforeAllTestMethods() throws JSONException {
        String createPersonUrl = "http://localhost:8080/spring-rest/createPerson";
        String updatePersonUrl = "http://localhost:8080/spring-rest/updatePerson";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        JSONObject personJsonObject = new JSONObject();
        personJsonObject.put("id", 1);
        personJsonObject.put("name", "John");
    }

    private final ObjectMapper objectMapper = new ObjectMapper();


}

