package org.cap.service;

import org.cap.entities.Cart;

import java.util.List;

public interface ICartService {
	List<Cart>fetchCartDetails(int userId);
    Cart add(Cart item);
}
