package com.example.todoserver;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by ka.wada on 2017/05/27.
 */
@Data
@AllArgsConstructor
public class Todo {
    private int id;
    private String title;
    private String deadline;
}
