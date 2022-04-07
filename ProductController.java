package Springbootcrud.components;


import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpHeaders;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
   @Autowired
   private ProductRepository productRepository;

   @CrossOrigin
   @GetMapping("/products")
   public List<Products> fetchProducts(Products products){
     return productRepository.findAll();
   }

      @GetMapping(
      value = "/get-image-with-media-type", 
      produces = MediaType.IMAGE_PNG_VALUE
    )
    public @ResponseBody byte[] getImageWithMediaType() throws IOException {
        InputStream in = getClass()
          .getResourceAsStream("/com/baeldung/produceimage/image.jpg");
        return IOUtils.toByteArray(in);
    }
   
}
