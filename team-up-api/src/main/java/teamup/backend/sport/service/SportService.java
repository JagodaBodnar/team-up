package teamup.backend.sport.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import teamup.backend.sport.dtos.SportDto;
import teamup.backend.sport.repository.SportRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SportService {
    private final SportRepository sportRepository;

    public List<SportDto> getAllSports() {
        return sportRepository.findAll().stream().map(SportDto::toSportDto).toList();
    }
}
