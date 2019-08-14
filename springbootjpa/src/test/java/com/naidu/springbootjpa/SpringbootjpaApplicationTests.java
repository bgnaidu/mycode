package com.naidu.springbootjpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.naidu.springbootjpa.entities.Product;
import com.naidu.springbootjpa.repository.ProductRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootjpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	public void saveProduct() {
		ProductRepo repository = context.getBean(ProductRepo.class);
		Product product=new Product();
		product.setId(1l);
		product.setName("Nokia");
		product.setDescription("awesome");
		product.setPrice(17000d);
		repository.save(product);
		System.out.println(product);
	}

}
