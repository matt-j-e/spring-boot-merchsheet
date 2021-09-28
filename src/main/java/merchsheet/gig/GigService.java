package merchsheet.gig;

import merchsheet.tour.Tour;
import merchsheet.tour.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GigService {

  @Autowired
  private GigRepository gigRepository;
  @Autowired
  private TourRepository tourRepository;


  public List<Gig> getGigs() {
    return gigRepository.findAll();
  }

  public List<Gig> getGigsByTour(int tourId) {
    return gigRepository.findByTourId(tourId);
  }

  public void addGig(Gig gig, int tourId) {
    Tour tour = tourRepository.findById(tourId).get();
    gig.setTour(tour);
    gigRepository.save(gig);
  }
}