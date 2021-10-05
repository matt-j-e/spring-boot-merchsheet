package merchsheet.gig;

import com.fasterxml.jackson.annotation.JsonIgnore;
import merchsheet.salesItem.SalesItem;
import merchsheet.tour.Tour;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "gigs")
public class Gig implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String venue;
  private String date;
  private double venueCut;

//  @ManyToOne(fetch = FetchType.LAZY, optional = false)
  @ManyToOne
  @JoinColumn(name = "tour_id", nullable = false)
  private Tour tour;

  @JsonIgnore
  @OneToMany(mappedBy = "gig", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  private Set<SalesItem> salesItems;

  public Gig() {
  }

  public Gig(String venue, String date, double venueCut, Tour tour) {
    this.venue = venue;
    this.date = date;
    this.venueCut = venueCut;
    this.tour = tour;
  }

  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public double getVenueCut() {
    return venueCut;
  }

  public void setVenueCut(double venueCut) {
    this.venueCut = venueCut;
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

  public Integer getId() {
    return id;
  }
}
