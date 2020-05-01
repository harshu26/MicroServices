package org.cap.service;

import org.cap.dao.ICartDao;
import org.cap.entities.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements ICartService {
    private ICartDao cartDao;

    public ICartDao getCartDao() {
        return cartDao;
    }

    @Autowired
    public void setCartDao(ICartDao dao) {
        this.cartDao = dao;
    }

	@Override
	public List<Cart> fetchCartDetails(int userId) {
		List<Cart>list = cartDao.fetchCartDetails(userId);
		return list;
	}

	@Override
	public Cart add(Cart item) {
		item = cartDao.add(item);
		return item;
	}
    

  
}
