package merchsheet.salesItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/sales")
public class SalesItemController {

  @Autowired
  SalesItemService salesItemService;

  @GetMapping
  List<SalesItem> getSalesItems() {
    return salesItemService.getSalesItems();
  }
}
