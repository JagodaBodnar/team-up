package teamup.backend.sport.mapper;

import org.mapstruct.Mapper;
import teamup.backend.sport.dtos.SportDto;
import teamup.backend.sport.dtos.SportListDto;
import teamup.backend.sport.model.Sport;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SportMapper {

    List<SportDto> map(List<Sport> sports);

    default SportListDto mapToList(List<Sport> sports) {
        return new SportListDto(map(sports));
    }

}
