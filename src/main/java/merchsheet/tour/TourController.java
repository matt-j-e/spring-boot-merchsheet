package merchsheet.tour;

import merchsheet.gig.Gig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"https://merchsheet.vercel.app/, http://localhost:3000"})
@RestController
@RequestMapping(path = "/tours")
public class TourController {

  @Autowired
  private TourService tourService;

  /**
   * Gets all Tours
   * @return List of Tours
   */
  @GetMapping
  public List<Tour> getTours() {
    return tourService.getTours();
  }
  /**
   * Gets Tour by id
   * @param tourId id of the Tour to get
   * @return a Tour object
   */
  @GetMapping(path = "/{tourId}")
  public Tour getTourById(@PathVariable int tourId) {
    return tourService.getTourById(tourId);
  }


  @PostMapping
  public Tour addTour(@RequestBody Tour tour) {
    return tourService.addTour(tour);
  }
}
