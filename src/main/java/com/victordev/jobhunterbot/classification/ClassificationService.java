package com.victordev.jobhunterbot.classification;

import com.victordev.jobhunterbot.enums.Category;
import com.victordev.jobhunterbot.enums.Technology;
import com.victordev.jobhunterbot.enums.WorkMode;
import com.victordev.jobhunterbot.model.Job;

import java.util.Set;

public class ClassificationService {
    public void classify(Job job) {
        CategoryClassifier categoryClassifier = new CategoryClassifier();
        TechnologyClassifier technologyClassifier = new TechnologyClassifier();
        WorkModeClassifier workModeClassifier = new WorkModeClassifier();

        Category category = categoryClassifier.classify(job.getDescription());
        job.setCategory(category);

        Set<Technology> technologies = technologyClassifier.classify(job.getDescription());
        job.setTechnologies(technologies);

        Set<WorkMode>  workModes = workModeClassifier.classify(job.getDescription());
        job.setWorkModes(workModes);
    }
}
