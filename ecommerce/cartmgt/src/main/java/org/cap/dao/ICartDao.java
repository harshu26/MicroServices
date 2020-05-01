package org.cap.dao;

import org.cap.entities.Cart;

import java.util.List;

public interface ICartDao {

    List<Cart>fetchCartDetails(int userId);
    Cart add(Cart item);
}
