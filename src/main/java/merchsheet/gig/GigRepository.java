package merchsheet.gig;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GigRepository extends JpaRepository<Gig, Integer> {

  public List<Gig> findByTourIdOrderByDateAsc(int tourId);
}
