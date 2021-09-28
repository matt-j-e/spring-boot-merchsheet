package merchsheet.salesItem;

import merchsheet.gig.Gig;
import merchsheet.gig.GigRepository;
import merchsheet.product.Product;
import merchsheet.product.ProductRepository;
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

  public void addSalesItem(SalesItem salesItem, int gigId, int productId) {
    Gig gig = gigRepository.findById(gigId).get();
    Product product = productRepository.findById(productId).get();
    salesItem.setGig(gig);
    salesItem.setProduct(product);
    salesItemRepository.save(salesItem);
  }
}
