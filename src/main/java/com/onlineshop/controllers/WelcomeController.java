package com.onlineshop.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/welcome") // adresa controllerului
public class WelcomeController {

    @GetMapping("/welcome-message") // adresa metodei impreuna cu tipul metodei
    public String welcomeUser() {
        return "Bun venit draga user!";
    }

    @GetMapping
    public String getMessage() {
        return "Hello Java!";
    }

    @PostMapping
    public String postMessage() {
        return "Am primit un mesaj";
    }

    @PostMapping("/message")
    public String postMessage(@RequestParam("info") String message) {
        return "Mesajul primit este: " + message;
    }

    @PostMapping("/add-message")
    public String postMessage(@RequestBody Map<String, String> body) {

        for (Map.Entry<String, String> entry : body.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        return "Am primit";
    }

    @PutMapping
    public String putMessage() {
        return "Am modificat un mesaj";
    }

    @DeleteMapping("/{id}")
    public String deleteMessage(@PathVariable("id") Integer id) {
        return "Am sters mesajul cu id: " + id;
    }
}
/*
@RestController
 - Rest API -> Application Programming Interface
 - RestController -> Ne ajuta sa expunem metode de HTTP,
 la care ne putem conecta si putem trimite/primi data

 @RequestMapping
  - ne ajuta sa stabilim adresa controllerului pe server
  - ne ajuta sa modularizam aplicatia

  @GetMapping
  @PostMapping
  @PutMapping
  @DeleteMapping
   - reprezinta metodele de HTTP GET, POST, PUT, DELETE
   -

   @RequestParam
   - ne ajuta sa identificam paramtri din url, adica tot ce este dupa "?"
   http://localhost:8081/welcome/message?info=salut
   - ne va afisa valoarea lui "info"

   @PostMapping("/message")
    public String postMessage(@RequestParam("info") String message) {
        return "Mesajul primit este: " + message;
    }

   @RequestBody
   - ne ajuta sa accesam body-ul requesturilor de POST, PATCH, PUT
   - body-ul de regula este un JSON care va fi asociat cu un Map<String, String>

   @PostMapping("/add-message")
    public String postMessage(@RequestBody Map<String, String> body) {

        for (Map.Entry<String, String> entry : body.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        return "Am primit";
    }

   @PathVariable
   - se foloseste de regula la requesturile de DELETE
   - ne ajuta sa luam din adresa (PATH) un anumit element

   @DeleteMapping("/{id}")
    public String deleteMessage(@PathVariable("id") Integer id) {
        return "Am sters mesajul cu id: " + id;
    }
 */
