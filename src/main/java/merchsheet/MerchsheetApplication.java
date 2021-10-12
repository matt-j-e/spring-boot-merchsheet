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

//	@Bean
//	public CommandLineRunner commandLineRunner(TourRepository tourRepository,
//																						 GigRepository gigRepository,
//																						 ProductRepository productRepository,
//																						 SalesItemRepository salesItemRepository) {
//		return args -> {
//			// create a tour
//			Tour test = new Tour("Test Tour");
//			// save the tour
//			tourRepository.save(test);
//
//			// create and save some gigs
//			Gig gig1 = new Gig("Pompeii", "2021-10-01", 5000, test);
//			Gig gig2 = new Gig("Sydney Opera House", "2021-10-02", 3000, test);
//			Gig gig3 = new Gig("Hanging Gardens of Babylon", "2021-10-03", 0, test);
//			gigRepository.save(gig1);
//			gigRepository.save(gig2);
//			gigRepository.save(gig3);
//
//			// create and save some products
//			Product revolution = new Product("Revolution Calls", 1200, 600, 50, 50, test);
//			Product shoulder = new Product("Shoulder To Shoulder", 1000, 400, 50, 50, test);
//			Product bestOf1 = new Product("Best of W&M Vol.1", 1000, 400, 50, 50, test);
//			Product bestOf2 = new Product("Best of W&M Vol.2", 1000, 400, 50, 50, test);
//			Product bag = new Product("Bag", 500, 0, 50, 50, test);
//			Product book = new Product("Book - Secret Adventures", 1250, 0, 0, 100, test);
//			Product designs = new Product("Chris designs 25", 2500, 0, 100, 0, test);
//			productRepository.save(revolution);
//			productRepository.save(shoulder);
//			productRepository.save(bestOf1);
//			productRepository.save(bestOf2);
//			productRepository.save(bag);
//			productRepository.save(book);
//			productRepository.save(designs);
//
//			// create and save some salesItems
//			salesItemRepository.save(new SalesItem(20, 10, 1, 2, gig1, revolution));
//			salesItemRepository.save(new SalesItem(18, 10, 0, 3, gig1, shoulder));
//			salesItemRepository.save(new SalesItem(10, 8, 0, 0, gig1, bag));
//			salesItemRepository.save(new SalesItem(10, 7, 0, 3, gig1, book));
//			salesItemRepository.save(new SalesItem(10, 8, 0, 0, gig1, designs));
//
//			// create and save some salesItems for another gig
//			salesItemRepository.save(new SalesItem(20, 10, 1, 2, gig2, bestOf1));
//			salesItemRepository.save(new SalesItem(18, 10, 0, 3, gig2, bestOf2));
//			salesItemRepository.save(new SalesItem(15, 10, 1, 1, gig2, revolution));
//			salesItemRepository.save(new SalesItem(10, 8, 0, 0, gig2, bag));
//
//			// ACTUAL AUTUMN 2021 TOUR DETAILS
//			Tour autumn2021 = new Tour("2021 Autumn Tour");
//			tourRepository.save(autumn2021);
//
//			productRepository.save(new Product("Revolution Calls", 1200, 600, 50, 50, autumn2021));
//			productRepository.save(new Product("Shoulder To Shoulder", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Best of W&M Vol.1", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Best of W&M Vol.2", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Box Set", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Hitting The Ground Running", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Stages", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Infinite Sky", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Who We Are", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Here And Now", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Perfect Mistake", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Quest", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Together Alone", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Chris - Double", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("In The Big Room", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Rosella Red", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Slow", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Such Is Life", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Lies & Alibis", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Intuition", 1000, 400, 50, 50, autumn2021));
//			productRepository.save(new Product("Songbook", 500, 200, 50, 50, autumn2021));
//			productRepository.save(new Product("Tea Towel", 500, 0, 50, 50, autumn2021));
//			productRepository.save(new Product("Bag", 500, 0, 50, 50, autumn2021));
//			productRepository.save(new Product("Book - Secret Adventures", 1250, 0, 0, 100, autumn2021));
//			productRepository.save(new Product("Book - Happy Together", 1250, 0, 0, 100, autumn2021));
//			productRepository.save(new Product("Songcard - Single", 350, 0, 0, 100, autumn2021));
//			productRepository.save(new Product("Songcard - 4 deal", 1200, 0, 0, 100, autumn2021));
//			productRepository.save(new Product("Chris Designs 25", 2500, 0, 100, 0, autumn2021));
//			productRepository.save(new Product("Chris Designs 20", 2000, 0, 100, 0, autumn2021));
//			productRepository.save(new Product("Chris Designs 18", 1800, 0, 100, 0, autumn2021));
//			productRepository.save(new Product("Chris Designs 14", 1400, 0, 100, 0, autumn2021));
//			productRepository.save(new Product("Chris Designs 10", 1000, 0, 100, 0, autumn2021));
//			productRepository.save(new Product("Chris Designs 8", 800, 0, 100, 0, autumn2021));
//			productRepository.save(new Product("Chris Designs 5", 500, 0, 100, 0, autumn2021));
//
//			gigRepository.save(new Gig("Carlisle", "2021-10-01", 0, autumn2021));
//			gigRepository.save(new Gig("Barton Upon Humber", "2021-10-03", 0, autumn2021));
//			gigRepository.save(new Gig("Birmingham", "2021-10-07", 0, autumn2021));
//			gigRepository.save(new Gig("West Kirby", "2021-10-08", 0, autumn2021));
//			gigRepository.save(new Gig("Marlborough", "2021-10-13", 0, autumn2021));
//			gigRepository.save(new Gig("Banbury", "2021-10-14", 0, autumn2021));
//			gigRepository.save(new Gig("Painswick", "2021-10-15", 0, autumn2021));
//			gigRepository.save(new Gig("Honiton", "2021-10-16", 0, autumn2021));
//			gigRepository.save(new Gig("Cambridge", "2021-10-23", 0, autumn2021));
//			gigRepository.save(new Gig("Hitchin", "2021-10-24", 0, autumn2021));
//			gigRepository.save(new Gig("Nettlebed", "2021-10-25", 0, autumn2021));
//			gigRepository.save(new Gig("Bromsgrove", "2021-10-28", 0, autumn2021));
//			gigRepository.save(new Gig("Birdwell", "2021-10-29", 0, autumn2021));
//			gigRepository.save(new Gig("Threlkeld", "2021-10-30", 0, autumn2021));
//
//		};
//	}

}
