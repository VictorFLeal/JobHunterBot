package com.victordev.jobhunterbot.classification;

import com.victordev.jobhunterbot.enums.Technology;

import java.util.HashSet;
import java.util.Set;

public class TechnologyClassifier {
    public Set<Technology> classify(String text) {
        Set<Technology> technologies = new HashSet<>();
        String lowerText = text.toLowerCase();

        if (lowerText.contains("java")) {
            technologies.add(Technology.JAVA);
        }
        if (lowerText.contains("spring boot")) {
            technologies.add(Technology.SPRING_BOOT);
        }
        if (lowerText.contains("docker")) {
            technologies.add(Technology.DOCKER);
        }
        if (lowerText.contains("postgresql")) {
            technologies.add(Technology.POSTGRESQL);
        }
        if (lowerText.contains("spring security")) {
            technologies.add(Technology.SPRING_SECURITY);
        }
        if (lowerText.contains("spring data jpa")) {
            technologies.add(Technology.SPRING_DATA_JPA);
        }
        if (lowerText.contains("kubernetes")) {
            technologies.add(Technology.KUBERNETES);
        }
        if (lowerText.contains("mongodb")) {
            technologies.add(Technology.MONGODB);
        }
        if (lowerText.contains("aws")) {
            technologies.add(Technology.AWS);
        }

        return technologies;
    }
}
