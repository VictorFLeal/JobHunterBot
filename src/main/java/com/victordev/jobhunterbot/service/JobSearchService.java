package com.victordev.jobhunterbot.service;

import com.victordev.jobhunterbot.classification.ClassificationService;
import com.victordev.jobhunterbot.collector.LinkedInCollector;
import com.victordev.jobhunterbot.model.Job;
import com.victordev.jobhunterbot.parser.LinkedInParser;
import com.victordev.jobhunterbot.repository.JobRepository;
import com.victordev.jobhunterbot.telegram.TelegramService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSearchService {
    private LinkedInCollector linkedInCollector = new LinkedInCollector();
    private LinkedInParser linkedInParser = new LinkedInParser();
    private ClassificationService classificationService = new ClassificationService();
    private TelegramService telegramService = new TelegramService();
    private JobRepository jobRepository;

    public void searchJobs(){
        List<Job> jobs = linkedInCollector.collect();

        for (Job job : jobs) {
            Job parsedJob = linkedInParser.parse(job.getDescription());
            classificationService.classify(parsedJob);
            jobRepository.save(parsedJob);
            telegramService.sendMessage(parsedJob);
        }
    }
}