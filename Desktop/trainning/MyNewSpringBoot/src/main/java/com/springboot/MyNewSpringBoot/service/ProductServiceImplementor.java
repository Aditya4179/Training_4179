package com.springboot.MyNewSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.MyNewSpringBoot.excpetions.ProductNotFoundException;
import com.springboot.MyNewSpringBoot.model.Product;
import com.springboot.MyNewSpringBoot.repo.ProductRepository;

@Service
public class ProductServiceImplementor implements ProductService {

	@Autowired
	private ProductRepository prodrepo;
	@Override
	public Product savProduct(Product product) {
		// TODO Auto-generated method stub
		return prodrepo.save(product);
	}

	@Override
	public List<Product> fetchProductList() {
		// TODO Auto-generated method stub
		return prodrepo.findAll();
	}

	@Override
	public Product updateProduct(Product product, Long productId) {
		// TODO Auto-generated method stub
		Product p=prodrepo.findById(productId).get();
		if(p.getProductId()== productId) {
			p.setProductName(product.getProductName());
			p.setProductType(product.getProductType());
		}else {
			//throw new ProductNotFoundException();
		}
		Product saveProduct=prodrepo.save(p);
		return saveProduct;
	}

	@Override
	public void deleteProduct(Long productId) {
		// TODO Auto-generated method stub
		prodrepo.deleteById(productId);
	}

}
