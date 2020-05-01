package org.cap.dao;

import org.cap.entities.Cart;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CartDaoImpl implements ICartDao {
    private Map<Integer, Cart> store = new HashMap<>();

	@Override
	public List<Cart> fetchCartDetails(int userId) {
		Collection<Cart>cart = store.values();
		List<Cart>cart2 = new ArrayList<Cart>();
		for(Cart cart3:cart) {
			if(cart3.getUserId()==userId) {
				cart2.add(cart3);
			}
		}
		return cart2;
	}

	@Override
	public Cart add(Cart item) {
		store.put(item.getId(),item);
		return item;
	}

    
}
