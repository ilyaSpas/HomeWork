package org.example.project.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.example.project.entity.Request;
import org.example.project.repo.RequestRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RequestService {
    private final RequestRepository requestRepository;

    public void save(Request request){
        requestRepository.save(request);
    }
}
