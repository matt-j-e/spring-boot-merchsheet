package merchsheet.salesItem;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SalesItemRepository extends JpaRepository<SalesItem, Integer> {

  public List<SalesItem> findByGigId(int gigId);
}
