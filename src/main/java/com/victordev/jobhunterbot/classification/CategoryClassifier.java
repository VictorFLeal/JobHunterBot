package com.victordev.jobhunterbot.classification;

import com.victordev.jobhunterbot.enums.Category;

public class CategoryClassifier {
    public Category classify(String text) {
        String lowerText = text.toLowerCase();

        if (lowerText.contains("junior") || lowerText.contains("júnior")) {
            return Category.JOB;
        }
        if (lowerText.contains("estagio") || lowerText.contains("internship")) {
            return Category.INTERNSHIP;
        }
        if (lowerText.contains("trainee")) {
            return Category.TRAINEE;
        }

        return null;
    }
}
