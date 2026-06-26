package com.victordev.jobhunterbot.telegram;

import com.victordev.jobhunterbot.model.Job;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TelegramService {
    @Value("${telegram.bot.token}")
    private String token;

    @Value("${telegram.bot.chatId}")
    private String chatId;

    Job sendMessage(String message){
        Job job = new Job();
        return job;
    }
}
