package merchsheet.tour;

import merchsheet.gig.Gig;
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

  public Tour addTour(Tour tour) {
    return tourRepository.save(tour);
  }

  public Tour getTourById(int id) {
    return tourRepository.findById(id).get();
  }
}
