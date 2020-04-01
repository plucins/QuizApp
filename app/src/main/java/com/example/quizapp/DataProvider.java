package com.example.quizapp;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public List<Question> getQuestions() {

        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Grzie ropoczął się wirus?", "Polska", "USA", "Chiny", 3));
        questions.add(new Question("Czy uda nam nie przeżyć", "Tak", "Nie", "Nie wiem", 3));
        questions.add(new Question("Jaka musi byc odlełość między osobami?", "1m", "2m", "4m", 2));
        questions.add(new Question("Czy możesz zorganizowac przyjęcie na 13 osób?", "Nie", "Tak", "Nie wiem", 1));

        return questions;

    }
}
