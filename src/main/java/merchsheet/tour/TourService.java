package merchsheet.tour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourService {

  @Autowired
  private TourRepository tourRepository;


  public List<Tour> getTours() {
    return tourRepository.findAll();
  }

  public void addTour(Tour tour) {
    tourRepository.save(tour);
  }
}
