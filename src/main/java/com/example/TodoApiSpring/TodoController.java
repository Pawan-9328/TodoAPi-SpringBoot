package com.example.TodoApiSpring;


import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    private static List<Todo> todos;

    public TodoController(){
        todos = new ArrayList<>();
        todos.add(new Todo(1 , true , "Todo1" , 1 ));
        todos.add(new Todo(2, false, "Todo2" , 2));
    }


}
