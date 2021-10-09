package merchsheet.product;

import merchsheet.tour.Tour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000, https://merchsheet.vercel.app")
@RestController
@RequestMapping(path = "/products")
public class ProductController {

  @Autowired
  ProductService productService;

  /**
   * Gets all Products for all Tours
   * @return - List of Products
   */
  @GetMapping
  public List<Product> getProducts() {
    return productService.getProducts();
  }

  /**
   * Adds a new Product to the database
   * @param product - Content of the Request Body
   * @param tourId - the id of the Tour to which the Product relates
   */
  @PostMapping(path = "/{tourId}")
  public Product addProduct(@RequestBody Product product, @PathVariable int tourId) {
    return productService.addProduct(product, tourId);
  }

  /**
   * Gets all Products on a specific Tour
   * @param tourId - the id of the Tour for which Products are required
   * @return - List of Products
   */
  @GetMapping(path = "/tour/{tourId}")
  public List<Product> getProductsByTour(@PathVariable int tourId) {
    return productService.getProductsByTour(tourId);
  }

  /**
   * Gets Product by id
   * @param productId id of the Product to get
   * @return a Product object
   */
  @GetMapping(path = "/{productId}")
  public Product getProductById(@PathVariable int productId) {
    return productService.getProductById(productId);
  }
}
