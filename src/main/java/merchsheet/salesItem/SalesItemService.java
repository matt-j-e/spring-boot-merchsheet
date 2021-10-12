package merchsheet.salesItem;

import merchsheet.gig.Gig;
import merchsheet.gig.GigRepository;
import merchsheet.product.Product;
import merchsheet.product.ProductRepository;
import merchsheet.tour.Tour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesItemService {

  @Autowired
  private SalesItemRepository salesItemRepository;
  @Autowired
  private GigRepository gigRepository;
  @Autowired
  private ProductRepository productRepository;


  public List<SalesItem> getSalesItems() {
    return salesItemRepository.findAll();
  }

  public List<SalesItem> getSalesItemsByGig(int gigId) {
    return salesItemRepository.findByGigId(gigId);
  }

  public List<SalesItem> getSalesItemsByTour(int tourId) {
    return salesItemRepository.findByGigTourId(tourId);
  }

  public SalesItem addSalesItem(SalesItem salesItem, int gigId, int productId) {
    Gig gig = gigRepository.findById(gigId).get();
    Product product = productRepository.findById(productId).get();
    salesItem.setGig(gig);
    salesItem.setProduct(product);
    return salesItemRepository.save(salesItem);
  }

  public SalesItem getSalesItemById(int id) {
    return salesItemRepository.findById(id).get();
  }
}
