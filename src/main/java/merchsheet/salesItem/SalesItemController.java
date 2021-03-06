package merchsheet.salesItem;

import merchsheet.tour.Tour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"https://merchsheet.vercel.app", "http://localhost:3000"})
@RestController
@RequestMapping(path = "/sales")
public class SalesItemController {

  @Autowired
  SalesItemService salesItemService;

  /**
   * Gets all SalesItems for all Gigs
   * @return List of SalesItems
   */
  @GetMapping
  public List<SalesItem> getSalesItems() {
    return salesItemService.getSalesItems();
  }

  /**
   * Gets SalesItems relating to a particular Gig
   * @param gigId - the Id of the Gig for which SalesItems are required
   * @return List of SalesItems
   */
  @GetMapping(path = "/gig/{gigId}")
  public List<SalesItem> getSalesItemsByGig(@PathVariable int gigId) {
    return salesItemService.getSalesItemsByGig(gigId);
  }

  /**
   * Gets SalesItems relating to a particular Tour
   * @param tourId - the Id of the Tour for which SalesItems are required
   * @return List of SalesItems
   */
  @GetMapping(path = "/tour/{tourId}")
  public List<SalesItem> getSalesItemsByTour(@PathVariable int tourId) {
    return salesItemService.getSalesItemsByTour(tourId);
  }

  /**
   * Gets SalesItem by id
   * @param itemId id of the salesItem to get
   * @return a SalesItem object
   */
  @GetMapping(path = "/item/{salesItemId}")
  public SalesItem getSalesItemById(@PathVariable int salesItemId) {
    return salesItemService.getSalesItemById(salesItemId);
  }

  /**
   * Adds a SalesItem to the database
   * @param salesItem Content of the Request Body
   * @param gigId - the id of the Gig to which the SalesItem relates
   * @param productId - the id of the Product to which the SalesItem relates
   */
  @PutMapping(path = "/{gigId}/{productId}")
  public SalesItem addSalesItem(@RequestBody SalesItem salesItem, @PathVariable int gigId,  @PathVariable int productId) {
    return salesItemService.addSalesItem(salesItem, gigId, productId);
  }


}
