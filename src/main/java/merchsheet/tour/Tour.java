package merchsheet.tour;

import com.fasterxml.jackson.annotation.JsonIgnore;
import merchsheet.gig.Gig;
import merchsheet.product.Product;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "tours")
public class Tour implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;

  @JsonIgnore
  @OneToMany(mappedBy = "tour", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<Gig> gigs;

  @JsonIgnore
  @OneToMany(mappedBy = "tour", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<Product> products;

  public Tour() {
  }

  public Tour(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
