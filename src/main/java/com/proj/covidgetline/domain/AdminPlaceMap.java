package com.proj.covidgetline.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AdminPlaceMap {

    private Long id;
    private Long placeId;

    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;
}
