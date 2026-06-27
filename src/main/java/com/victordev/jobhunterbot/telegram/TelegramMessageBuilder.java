package com.victordev.jobhunterbot.telegram;

import com.victordev.jobhunterbot.model.Job;

public class TelegramMessageBuilder {
    public static String build(Job job) {
        return "🚀 VAGA NOVA\n" +
                "🏢 Empresa: " + job.getCompany() + "\n" +
                "💼 Cargo: " + job.getPosition() + "\n" +
                "📌 Categoria: " + job.getCategory() + "\n" +
                "📈 Senioridade: " + job.getSeniority() + "\n" +
                "🛠 Tecnologias: " + job.getTechnologies() + "\n" +
                "🌎 Modalidade: " + job.getWorkModes() + "\n" +
                "📍 Localização: " + job.getLocation() + "\n" +
                "⏰ Publicado: " + job.getPublishedText() + "\n" +
                "🔗 Link: " + job.getUrl() + "\n";
    }
}
