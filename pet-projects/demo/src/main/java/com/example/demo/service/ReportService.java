package com.example.demo.service;

import com.example.demo.model.Participant;
import com.example.demo.util.DateParserUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReportService {
    @Autowired
    private ParticipantService participantService;

    public String getReportById(Long id){
        List<Participant> participants = participantService.findByEventId(id);
        StringBuilder stringBuilder = new StringBuilder("ID\tФИО\tАптека\tАдрес аптеки\tДолжность" +
                                                        "\tНомер телефона\tПочта\tГород\tДата проведения\tВремя регистрации\n");
        for (Participant participant : participants) {
            stringBuilder.append(participant.getId() + "\t");
            stringBuilder.append(participant.getFirstName() + " " +
                                 participant.getLastName() + " " +
                                 participant.getPatronymic() + "\t" +
                                 participant.getPharmacy() + "\t" +
                                 participant.getPharmacyAddress() + "\t" +
                                 participant.getPosition() + "\t" +
                                 participant.getPhoneNumber() + "\t" +
                                 participant.getEmail() + "\t" +
                                 participant.getEvent().getTown() + "\t" +
                                 DateParserUtil.parseDate(LocalDate.parse(participant.getEvent().getDate())) + "\t" +
                                 DateParserUtil.parseDateToTime(participant.getTimeOfRegistration()));
            stringBuilder.append("\n");
        }
        return String.valueOf(stringBuilder);
    }
}
