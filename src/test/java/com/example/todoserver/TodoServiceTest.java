package com.example.todoserver;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Created by ka.wada on 2017/06/07.
 */
public class TodoServiceTest {

    TodoService todoService;

    @Before
    public void before() {
        todoService = new TodoService();
    }
    @Test
    public void findAll() throws Exception {
        assertThat(todoService.findAll().isEmpty(), is(false));
    }

}