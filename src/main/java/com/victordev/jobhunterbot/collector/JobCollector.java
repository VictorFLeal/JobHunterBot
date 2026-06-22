package com.victordev.jobhunterbot.collector;

import com.victordev.jobhunterbot.model.Job;

import java.util.List;

public interface JobCollector {
    List<Job> collect();
}
