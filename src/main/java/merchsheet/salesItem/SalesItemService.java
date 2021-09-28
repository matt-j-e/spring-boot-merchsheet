package merchsheet.salesItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesItemService {

  @Autowired
  private SalesItemRepository salesItemRepository;

  public List<SalesItem> getSalesItems() {
    return salesItemRepository.findAll();
  }
}
