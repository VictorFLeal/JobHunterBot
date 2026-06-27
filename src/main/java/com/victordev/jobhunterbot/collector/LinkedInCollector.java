package com.victordev.jobhunterbot.collector;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;
import com.victordev.jobhunterbot.model.Job;
import com.victordev.jobhunterbot.parser.LinkedInParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LinkedInCollector implements JobCollector {
    private LinkedInParser linkedInParser = new LinkedInParser();

    @Value("${linkedin.email}")
    private String email;

    @Value("${linkedin.password}")
    private String password;

    @Override
    public List<Job> collect() {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            com.microsoft.playwright.Page page = browser.newPage();

            page.navigate("https://www.linkedin.com/login");
            page.fill("#username", email);
            page.fill("#password", password);
            page.click("[type=submit]");

            page.waitForLoadState();
            page.navigate("https://www.linkedin.com/jobs/search/?keywords=Java&location=Campo+Grande");
            page.waitForLoadState();

            String html = page.content();

            Job job = linkedInParser.parse(html);
            return List.of(job);
        }
    }
}