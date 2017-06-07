package com.example.todoserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ka.wada on 2017/05/27.
 */
@RestController
@RequestMapping("api/todo")
public class TodoController {
    private static final Logger logger = LoggerFactory.getLogger(TodoController.class);

    @Autowired
    TodoService todoService;
    @GetMapping
    public List<Todo> getTodo() {
        logger.info("get is called");
        return todoService.findAll();
    }
}
