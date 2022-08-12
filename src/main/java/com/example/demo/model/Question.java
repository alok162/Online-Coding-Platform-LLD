package com.example.demo.model;

import com.example.demo.enums.QuestionType;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public abstract class Question {

    private QuestionType type;
    private final String id;

    public Question(QuestionType type, String id) {
        this.type = type;
        this.id = id;
    }

    public abstract void create();
}
