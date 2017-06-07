package com.example.todoserver;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ka.wada on 2017/05/27.
 */
@Service
public class TodoService {

    public List<Todo> findAll() {
        List<Todo> list = new ArrayList<>();
        list.add(new Todo(1, "洗濯する", "2017/6/1"));
        list.add(new Todo(2, "皿を洗う", "2017/6/2"));
        return list;
    }
}
