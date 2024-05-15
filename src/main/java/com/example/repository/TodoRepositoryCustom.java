package com.example.repository;

import com.example.repository.Todo;
import java.util.List;

public interface TodoRepositoryCustom {

    /**
     * QueryDSL을 사용하여 To-Do 목록 조회
     */
    List<Todo> getTodos(Todo todo);
}