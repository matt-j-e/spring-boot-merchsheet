package merchsheet;

import merchsheet.gig.Gig;
import merchsheet.gig.GigRepository;
import merchsheet.product.Product;
import merchsheet.product.ProductRepository;
import merchsheet.salesItem.SalesItem;
import merchsheet.salesItem.SalesItemRepository;
import merchsheet.tour.Tour;
import merchsheet.tour.TourRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MerchsheetApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchsheetApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(TourRepository tourRepository,
																						 GigRepository gigRepository,
																						 ProductRepository productRepository,
																						 SalesItemRepository salesItemRepository) {
		return args -> {
			// create a tour
			Tour tour = new Tour("2021 Autumn Tour");
			// save the tour
			tourRepository.save(tour);

			// create and save some gigs
			Gig gig1 = new Gig("Gig 1", "2021-10-01", 5000, tour);
			Gig gig2 = new Gig("Gig 2", "2021-10-02", 3000, tour);
			Gig gig3 = new Gig("Gig 3", "2021-10-03", 0, tour);
			gigRepository.save(gig1);
			gigRepository.save(gig2);
			gigRepository.save(gig3);

			// create and save some products
			Product revolution = new Product("Revolution Calls", 1200, 600, 50, 50, tour);
			Product shoulder = new Product("Shoulder To Shoulder", 1000, 400, 50, 50, tour);
			Product bestOf1 = new Product("Best of W&M Vol.1", 1000, 400, 50, 50, tour);
			Product bestOf2 = new Product("Best of W&M Vol.2", 1000, 400, 50, 50, tour);
			Product bag = new Product("Bag", 500, 0, 50, 50, tour);
			Product book = new Product("Book - Secret Adventures", 1250, 0, 0, 100, tour);
			Product designs = new Product("Chris designs", 2500, 0, 100, 0, tour);
			productRepository.save(revolution);
			productRepository.save(shoulder);
			productRepository.save(bestOf1);
			productRepository.save(bestOf2);
			productRepository.save(bag);
			productRepository.save(book);
			productRepository.save(designs);

			/*
			// create and save some salesItems
			salesItemRepository.save(new SalesItem(20, 10, 1, 2, gig1, revolution));
			salesItemRepository.save(new SalesItem(18, 10, 0, 3, gig1, shoulder));
			salesItemRepository.save(new SalesItem(10, 8, 0, 0, gig1, bag));
			salesItemRepository.save(new SalesItem(10, 7, 0, 3, gig1, book));
			salesItemRepository.save(new SalesItem(10, 8, 0, 0, gig1, designs));

			// create and save some salesItems for another gig
			salesItemRepository.save(new SalesItem(20, 10, 1, 2, gig2, bestOf1));
			salesItemRepository.save(new SalesItem(18, 10, 0, 3, gig2, bestOf2));
			salesItemRepository.save(new SalesItem(15, 10, 1, 1, gig2, revolution));
			salesItemRepository.save(new SalesItem(10, 8, 0, 0, gig2, bag));
			*/
		};
	}

}
