package com.ilsy.http.dto;

import lombok.*;

import java.util.Objects;

//@AllArgsConstructor
//@Getter
//@EqualsAndHashCode
//@ToString

//@Data

@Value
@Builder
public class FlightDto {
    Long id;
    String description;
}
