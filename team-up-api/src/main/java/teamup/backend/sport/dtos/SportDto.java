package teamup.backend.sport.dtos;

import teamup.backend.sport.model.Sport;
import teamup.backend.sport.model.SportCode;

import java.util.UUID;

public record SportDto(UUID id, SportCode code, String icon) {}
