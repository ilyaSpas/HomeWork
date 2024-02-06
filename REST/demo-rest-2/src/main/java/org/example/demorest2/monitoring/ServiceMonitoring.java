package org.example.demorest2.monitoring;

import lombok.RequiredArgsConstructor;
import org.example.demorest2.service.TaskService;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Endpoint(id = "monitoring")
@RequiredArgsConstructor
public class ServiceMonitoring {
    private final TaskService taskService;

    @ReadOperation
    public Map<String, Boolean> servicesEndpoint(){
        Map<String, Boolean> map = new HashMap<>();
        map.put("Server status:", taskService.isTaskServiceGood());
        return map;
    }
}
