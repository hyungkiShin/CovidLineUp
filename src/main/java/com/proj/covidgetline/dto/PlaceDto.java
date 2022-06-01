package com.proj.covidgetline.dto;


import com.proj.covidgetline.constant.PlaceType;
import com.proj.covidgetline.domain.Place;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
public class PlaceDto {

    private Long id;
    private PlaceType placeType;
    private String placeName;
    private String address;
    private String phoneNumber;
    private Integer capacity;
    private String memo;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public static PlaceDto idOnly(Long id) {
        return PlaceDto.of(id, null, null, null, null, null, null, null, null);
    }

    public static PlaceDto of(
            Long id,
            PlaceType placeType,
            String placeName,
            String address,
            String phoneNumber,
            Integer capacity,
            String memo,
            LocalDateTime createdAt,
            LocalDateTime modifiedAt
    ) {
        return new PlaceDto(id, placeType, placeName, address, phoneNumber, capacity, memo, createdAt, modifiedAt);
    }

    public static PlaceDto of(Place place) {
        return new PlaceDto(
                place.getId(),
                place.getPlaceType(),
                place.getPlaceName(),
                place.getAddress(),
                place.getPhoneNumber(),
                place.getCapacity(),
                place.getMemo(),
                place.getCreatedAt(),
                place.getModifiedAt()
        );
    }

    public Place toEntity() {
        return Place.of(placeType, placeName, address, phoneNumber, capacity, memo);
    }

    public Place updateEntity(Place place) {
        if (placeType != null) {
            place.setPlaceType(placeType);
        }
        if (placeName != null) {
            place.setPlaceName(placeName);
        }
        if (address != null) {
            place.setAddress(address);
        }
        if (phoneNumber != null) {
            place.setPhoneNumber(phoneNumber);
        }
        if (capacity != null) {
            place.setCapacity(capacity);
        }
        if (memo != null) {
            place.setMemo(memo);
        }

        return place;
    }

}
