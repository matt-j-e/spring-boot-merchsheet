package merchsheet.tour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

  @PostMapping
  public void addTour(@RequestBody Tour tour) {
    tourService.addTour(tour);
  }
}
