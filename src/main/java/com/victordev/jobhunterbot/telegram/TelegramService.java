package com.victordev.jobhunterbot.telegram;

import com.victordev.jobhunterbot.model.Job;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TelegramService {
    @Value("${telegram.bot.token}")
    private String token;

    @Value("${telegram.bot.chatId}")
    private String chatId;

    private RestTemplate restTemplate = new RestTemplate();

    public void sendMessage(Job job){
        String message = TelegramMessageBuilder.build(job);
        String url = "https://api.telegram.org/bot" + token + "/sendMessage?chat_id=" + chatId + "&text=" + message;
        restTemplate.getForObject(url, String.class);
    }
}
