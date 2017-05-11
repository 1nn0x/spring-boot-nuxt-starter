package fr.azaddyne.rest;

import fr.azaddyne.domain.model.account.User;
import fr.azaddyne.domain.util.TodoGen;
import fr.azaddyne.infrastructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import fr.azaddyne.domain.model.Todo;

import java.util.List;


@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/hello", produces = "application/json")
    public String hello() {
        return "This is a hello world from controller";
    }

    @RequestMapping(value = "/todo", produces = "application/json")
    public @ResponseBody
    List<Todo> todo(){
        return TodoGen.TodoListcreate();
    }




}
