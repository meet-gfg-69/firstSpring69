package com.gfg.firstSpring69.controller;

import com.gfg.firstSpring69.service.GreetService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @Autowired
    GreetService greetService;

    @GetMapping("/greet")
    public String sayHello(String name) {
        return greetService.sayHello(name);
    }

    @PostMapping("/greet")
    public String sayHello2(String name){
        return greetService.sayHello(name);
    }
}


/**
 *
 1. Someone will call our application.
 2. Controller will be the one to receive the call.
 3. Controller will call service layer based on the input.
 4. Service will act on the data, which includes CRUD operations. -> Create, Read, Update and Delete on Entity / domain
 5. Service will return the data to Controller.
 6. Controller will return the data to the user.
 * */


/**
 * J2EE Timeline: 1999
 * Adopted for ser
 * Spring Framework
 * */


/***
 1. Tech discussions, meetings, etc.
 2. Business logic
 3. API design and documentation
 4. API contract --> final -> swagger
 5. API development
 6. API server
 7. Maintaience or update
 4.
 *
 *
 * Create ->  Data
 * Retrieve -> Id
 * Update -> Id + Update
 * Delete -> Id
 *
 *
 *
 * /pet/create
 * /pet/retrieve
 * /pet/update
 * /pet/delete
 *
 *
 * HTTPS types -> API type
 *
 * /pet -> GET
 * /pet -> POST -> create
 * /pet -> Put -> update
 * /pet -> patch -> partial update
 * /pet -> delete -> delete a pet
 *
 *
 *
 * 1. GET -> retrieve
 * 2. POST -> create a new data
 * 3. PUT -> update the resource
 * 4. PATCH -> partial update
 * 5. DELETE -> delete the resource
 *
 * OPTIONS/ HEAD / TRACEE
 *
 * HTTPS status codes
 * https://developer.mozilla.org/en-US/docs/Web/HTTP/Status
 *
 *
 * Statefull and stateless
 *
 * SOAP -> SOAP APIs
 *
 * https://domain/getTransactions -> 1-10
 * https://domain/getTransactions -> 11-20
 * https://domain/getTransactions -> 21-30
 *
 * <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
 *     <soap:Headers>
 *
 *         <soap:Body>
 *             <Movie>
 *                 <movie_name></movie_name>
 *                 <movie_rating></movie_rating>
 *             </Movie>
 *
 *         </soap:Body>
 *     </soap>
 *
 *
 * REST -> Representational State Transfer
 * {
 *     "movie_name": "movie_name",
 *     "movie_rating": "movie_rating"
 * }
 *
 *
 * https://domain/getTransactions?start=1&end=10
 * https://domain/getTransactions?start=11&end=20
 * https://domain/getTransactions?start=21&end=30
 *
 *
 * https://mypetstore/1 -> pet with iD -1  c1
 * https://mypetstore/1  -> c2
 *
 *
 *
 * Safety - one time call
 *
 * GET -> Safe , idempotent
 * POST -> unsafe , non-idempotent
 * PUT -> unsafe ,idempotent
 * PATCH -> unsafe , non-idempotent
 * DELETE -> unsafe ,idempotent
 * HEAD -> safe , idempotent
 *
 *
 * Path
 * http://localhost:8080/greet?name=meet -?
 *
 * step 2
 * [greet,name=meet]
 *
 *
 * find a method which is responsible for /greet
 *
 *
 *
 *
 * Log leves
 *
 * TRACE -> minute level details.. for extreme debugging
 * DEBUG -> detailed information needed while debugging
 * INFO -> Information of the process for hints
 * WARN -> Something can go wrong or may be crucial
 * ERROR -> important and crucial
 *
 * system.out.println("i am called for greet);
 * logger.debug("i am called for greet);
 * logger.error("here is the exception);
 *
 *
 * Paths + types  -> class.method
 * GET+/greet -> FirstController.sayHello
 * GET+/greet ->  Ambiguous mapping. Cannot map 'firstController' method
 * */