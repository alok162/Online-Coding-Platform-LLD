package com.example.demo.model;

import com.example.demo.enums.QuestionType;

    public class MediumQuestion extends Question{

        public MediumQuestion(String id, QuestionType type) {
            super(type, id);
        }

        public void HardQuestion() {
        }

        @Override
        public void create() {

        }
}
