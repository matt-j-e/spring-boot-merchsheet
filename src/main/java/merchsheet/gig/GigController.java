package merchsheet.gig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
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
  @GetMapping(path = "/tour/{tourId}")
  public List<Gig> getGigsByTour(@PathVariable int tourId) {
    return gigService.getGigsByTour(tourId);
  }

  /**
   * Gets Gig by id
   * @param gigId id of the Gig to get
   * @return a Gig object
   */
  @GetMapping(path = "/{gigId}")
  public Gig getGigById(@PathVariable int gigId) {
    return gigService.getGigById(gigId);
  }

  /**
   * Adds a new Gig to the database
   * @param gig - Content of the request Body
   * @param tourId - the id of the Tour to which the Gig relates
   */
  @PostMapping(path = "/{tourId}")
  public Gig addGig(@RequestBody Gig gig, @PathVariable int tourId) {
    return gigService.addGig(gig, tourId);
  }
}
