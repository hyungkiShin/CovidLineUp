
package com.proj.covidgetline.domain;

import com.proj.covidgetline.constant.EventStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Event {

    private Long id;
    private Long placeId;
    private EventStatus eventStatus;

    private LocalDateTime eventStartDateTime;
    private LocalDateTime eventEndDateTime;
    private Integer currentNumberOfPeople;
    private Integer capacity;
    private String name;

    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;
}
