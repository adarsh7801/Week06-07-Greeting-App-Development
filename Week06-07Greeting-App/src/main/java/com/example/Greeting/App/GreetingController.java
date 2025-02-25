package com.example.Greeting.App;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {


    //http://localhost:9090/greet/get
    @GetMapping("/get")
    public String greet(){
        return "Hello";
    }


    //http://localhost:9090/greet/post
    //json= {"firstname": "Adarsh", "lastname": "Gupta"}
    @PostMapping("/post")
    public String greet(@RequestBody User user){
        return "Hello from "+ user.getFirstname()+" "+user.getLastname();
    }



    //http://localhost:9090/greet/put/Adarsh?lastname=Gupta
    @PutMapping("/put/{firstname}")
    public String greet(@PathVariable String firstname,
                        @RequestParam String lastname){
        return "Hello "+firstname+" "+lastname;
    }



    //http://localhost:9090/greet/delete/Adarsh
    @DeleteMapping("/delete/{firstname}")
    public String deleteFirstName(@RequestBody User user,
                                  @PathVariable String firstname){
        return "First Name "+firstname+" deleted";
    }

}
