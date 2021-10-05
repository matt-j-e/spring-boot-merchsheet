package merchsheet.product;

import com.fasterxml.jackson.annotation.JsonIgnore;
import merchsheet.salesItem.SalesItem;
import merchsheet.tour.Tour;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "products")
public class Product implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String name;
  private int price;
  private int fatCatShare;
  private int chrisPercentage;
  private int juliePercentage;

//  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @ManyToOne
  @JoinColumn(name = "tour_id", nullable = false)
  private Tour tour;

  @JsonIgnore
  @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<SalesItem> salesItems;

  public Product() {
  }

  public Product(String name, int price, int fatCatShare, int chrisPercentage, int juliePercentage, Tour tour) {
    this.name = name;
    this.price = price;
    this.fatCatShare = fatCatShare;
    this.chrisPercentage = chrisPercentage;
    this.juliePercentage = juliePercentage;
    this.tour = tour;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getFatCatShare() {
    return fatCatShare;
  }

  public void setFatCatShare(int fatCatShare) {
    this.fatCatShare = fatCatShare;
  }

  public int getChrisPercentage() {
    return chrisPercentage;
  }

  public void setChrisPercentage(int chrisPercentage) {
    this.chrisPercentage = chrisPercentage;
  }

  public int getJuliePercentage() {
    return juliePercentage;
  }

  public void setJuliePercentage(int juliePercentage) {
    this.juliePercentage = juliePercentage;
  }

  public Tour getTour() {
    return tour;
  }

  public void setTour(Tour tour) {
    this.tour = tour;
  }

  public Set<SalesItem> getSalesItems() {
    return salesItems;
  }

  public void setSalesItems(Set<SalesItem> salesItems) {
    this.salesItems = salesItems;
  }

  public int getId() {
    return id;
  }
}
