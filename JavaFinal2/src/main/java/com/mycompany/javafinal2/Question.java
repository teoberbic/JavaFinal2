/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javafinal2;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/**
 *
 * @author teoberbic
 */
public class Question {
    private String question;
    @SerializedName("correct_answer")
    private String correctAnswer;
    private String difficulty;
    private String category;
    @SerializedName("incorrect_answers")
    private ArrayList<String> incorrectAnswers;
    
    public String getQuestion() {
        return question;
    }
    
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    
    public String getDifficulty() {
        return difficulty;
    }
    
    public String getCategory() {
        return category;
    }
    
    public ArrayList<String> getIncorrectAnswers() {
        return incorrectAnswers;
    }
}
