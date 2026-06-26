package com.victordev.jobhunterbot.classification;

import com.victordev.jobhunterbot.enums.Technology;
import com.victordev.jobhunterbot.enums.WorkMode;

import java.util.HashSet;
import java.util.Set;

public class WorkModeClassifier {
    public Set<WorkMode> classify(String text) {
        Set<WorkMode> workModes = new HashSet<>();
        String lowerText = text.toLowerCase();

        if (lowerText.contains("presencial") || lowerText.contains("onsite") || lowerText.contains("on-site")) {
            workModes.add(WorkMode.ONSITE);
        }
        if (lowerText.contains("remoto") || lowerText.contains("remote")) {
            workModes.add(WorkMode.REMOTE);
        }
        if (lowerText.contains("hibrido") || lowerText.contains("hybrid")) {
            workModes.add(WorkMode.HYBRID);
        }

        return workModes;
    }
}