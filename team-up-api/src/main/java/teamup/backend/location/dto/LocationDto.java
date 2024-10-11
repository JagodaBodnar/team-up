package teamup.backend.location.dto;


import teamup.backend.location.model.Location;

import java.util.UUID;

public record LocationDto(UUID id, String name) {
    public static LocationDto toLocationDto(Location location) {
        return new LocationDto(location.getId(), location.getName());
    }
}
