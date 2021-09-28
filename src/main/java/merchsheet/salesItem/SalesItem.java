package merchsheet.salesItem;

import merchsheet.gig.Gig;
import merchsheet.product.Product;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sales_items")
public class SalesItem implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private int openingStock;
  private int closingStock;
  private int numberFreebies;
  private int numberPaypalSales;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "gig_id")
  private Gig gig;

  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @JoinColumn(name = "product_id")
  private Product product;

  public SalesItem(int openingStock, int closingStock, int numberFreebies, int numberPaypalSales, Gig gig, Product product) {
    this.openingStock = openingStock;
    this.closingStock = closingStock;
    this.numberFreebies = numberFreebies;
    this.numberPaypalSales = numberPaypalSales;
    this.gig = gig;
    this.product = product;
  }

  public SalesItem() {
  }

  public int getOpeningStock() {
    return openingStock;
  }

  public void setOpeningStock(int openingStock) {
    this.openingStock = openingStock;
  }

  public int getClosingStock() {
    return closingStock;
  }

  public void setClosingStock(int closingStock) {
    this.closingStock = closingStock;
  }

  public int getNumberFreebies() {
    return numberFreebies;
  }

  public void setNumberFreebies(int numberFreebies) {
    this.numberFreebies = numberFreebies;
  }

  public int getNumberPaypalSales() {
    return numberPaypalSales;
  }

  public void setNumberPaypalSales(int numberPaypalSales) {
    this.numberPaypalSales = numberPaypalSales;
  }

  public Gig getGig() {
    return gig;
  }

  public void setGig(Gig gig) {
    this.gig = gig;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }
}
