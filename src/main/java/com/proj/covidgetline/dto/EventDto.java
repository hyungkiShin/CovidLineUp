package com.proj.covidgetline.dto;

import com.proj.covidgetline.constant.EventStatus;
import com.proj.covidgetline.domain.Event;
import com.proj.covidgetline.domain.Place;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
public class EventDto {
    private Long id;
    private PlaceDto placeDto;
    private String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDatetime;
    private LocalDateTime eventEndDatetime;
    private Integer currentNumberOfPeople;
    private  Integer capacity;
    private String memo;
    private  LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public static EventDto of(Event event) {
        return new EventDto(
                event.getId(),
                PlaceDto.of(event.getPlace()),
                event.getEventName(),
                event.getEventStatus(),
                event.getEventStartDatetime(),
                event.getEventEndDatetime(),
                event.getCurrentNumberOfPeople(),
                event.getCapacity(),
                event.getMemo(),
                event.getCreatedAt(),
                event.getModifiedAt()
        );
    }

    public Event toEntity(Place place) {
        return Event.of(
                place,
                eventName,
                eventStatus,
                eventStartDatetime,
                eventEndDatetime,
                currentNumberOfPeople,
                capacity,
                memo
        );
    }

    public Event updateEntity(Event event) {
        if (eventName != null) {
            event.setEventName(eventName);
        }
        if (eventStatus != null) {
            event.setEventStatus(eventStatus);
        }
        if (eventStartDatetime != null) {
            event.setEventStartDatetime(eventStartDatetime);
        }
        if (eventEndDatetime != null) {
            event.setEventEndDatetime(eventEndDatetime);
        }
        if (currentNumberOfPeople != null) {
            event.setCurrentNumberOfPeople(currentNumberOfPeople);
        }
        if (capacity != null) {
            event.setCapacity(capacity);
        }
        if (memo != null) {
            event.setMemo(memo);
        }

        return event;
    }
}
