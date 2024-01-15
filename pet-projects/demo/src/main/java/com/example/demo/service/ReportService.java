package com.example.demo.service;

import com.example.demo.model.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {
    @Autowired
    private ParticipantService participantService;

    public String getReportById(Long id){
        List<Participant> participants = participantService.findByEventId(id);
        StringBuilder stringBuilder = new StringBuilder("ID\tNAME\n");
        for (Participant participant : participants) {
            stringBuilder.append(participant.getId() + "\t");
            stringBuilder.append(participant.getFirstName() + "\t");
            stringBuilder.append("\n");
        }
        return String.valueOf(stringBuilder);
    }
}
