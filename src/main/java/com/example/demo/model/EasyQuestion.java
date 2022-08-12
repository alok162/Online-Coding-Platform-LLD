package com.example.demo.model;

import com.example.demo.enums.QuestionType;

    public class EasyQuestion extends Question {

        public EasyQuestion(String id, QuestionType type) {
            super(type, id);
        }

        public void HardQuestion() {
        }

        @Override
        public void create() {

        }
}
