package org.cap.service;

import org.cap.dao.IProductDao;
import org.cap.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    private IProductDao productDao;

    public IProductDao getProductDao() {
        return productDao;
    }

    @Autowired
    public void setProductDao(IProductDao dao) {
        this.productDao = dao;
    }

    @Override
    public void add(Product product) {
        productDao.add(product);
    }

    @Override
    public List<Product> fetchAll() {
        List<Product> products = productDao.fetchAll();
        return products;
    }

    @Override
    public Product findById(String id) {
        Product product=productDao.findById(id);
        return product;
    }
}
