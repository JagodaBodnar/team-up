package teamup.backend.sport.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teamup.backend.sport.dtos.SportListDto;
import teamup.backend.sport.mapper.SportMapper;
import teamup.backend.sport.repository.SportRepository;

@Service
@RequiredArgsConstructor
public class SportService {
    private final SportRepository sportRepository;
    private final SportMapper mapper;

    public SportListDto getAllSports() {
        return mapper.mapToList(sportRepository.findAll());
    }
}
