package teamup.backend.city.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import teamup.backend.city.model.City;

import java.util.List;
import java.util.UUID;

@Repository
public interface CityRepository extends JpaRepository<City, UUID> {
    @Query("SELECT distinct l from City l JOIN l.cityNames t WHERE VALUE(t) LIKE %:city%")
    List<City> findAllByTag(String city);
}
