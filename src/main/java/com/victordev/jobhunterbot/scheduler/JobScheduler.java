package com.victordev.jobhunterbot.scheduler;

import com.victordev.jobhunterbot.service.JobSearchService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobScheduler {
    private JobSearchService jobSearchService;

    @Scheduled(fixedRate = 1800000)
    public void run(){
        jobSearchService.searchJobs();
    }
}
