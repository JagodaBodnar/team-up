package teamup.backend.sport.dtos;

import teamup.backend.sport.model.Sport;

import java.util.List;

public record SportListDto(List<SportDto> listOfSports) {
}
