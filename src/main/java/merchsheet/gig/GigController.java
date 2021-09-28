package merchsheet.gig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/gigs")
public class GigController {

  @Autowired
  GigService gigService;

  /**
   * Gets all Gigs for all Tours
   * @return - List of Gigs
   */
  @GetMapping
  public List<Gig> getGigs() {
    return gigService.getGigs();
  }

  /**
   * Gets all Gigs on a specific Tour
   * @param tourId - the id of the Tour for which Gigs are required
   * @return - List of Gigs
   */
  @GetMapping(path = "/{tourId}")
  public List<Gig> getGigsByTour(@PathVariable int tourId) {
    return gigService.getGigsByTour(tourId);
  }

  /**
   * Adds a new Gig to the database
   * @param gig - Content of the request Body
   * @param tourId - the id of the Tour to which the Gig relates
   */
  @PostMapping(path = "/{tourId}")
  public void addGig(@RequestBody Gig gig, @PathVariable int tourId) {
    gigService.addGig(gig, tourId);
  }
}
