package merchsheet.product;

import merchsheet.tour.Tour;
import merchsheet.tour.TourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

  @Autowired
  private ProductRepository productRepository;
  @Autowired
  private TourRepository tourRepository;


  public List<Product> getProducts() {
    return productRepository.findAll();
  }

  public List<Product> getProductsByTour(int tourId) {
    return productRepository.findByTourId(tourId);
  }

  public void addProduct(Product product, int tourId) {
    Tour tour = tourRepository.findById(tourId).get();
    product.setTour(tour);
    productRepository.save(product);
  }
}
