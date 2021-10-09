package merchsheet.tour;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TourRepository extends JpaRepository<Tour, Integer> {

  public List findAllByOrderByIdDesc();
}
