package Springbootcrud.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DbSeeder implements CommandLineRunner {
   
    @Autowired
    private ProductRepository productRepository;
    
    public  DbSeeder(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String...strings) throws Exception{


        productRepository.save( new Products("0001", "Dry fish","2", "fish", "./shoes.png"));
        productRepository.save( new Products("0003", "Zamgold cooking oil", "4", "cooking oil", "" ));
        productRepository.save(new Products("0004", "buya bamba potato", "3", "potato", "image"));
        productRepository.save(new Products("0002", "mothers pride 10 kg", "2", "mealie meal", "image" ));
        productRepository.save(new Products("0005", "tomato", "4", "vegies", "image"));

    }
}
