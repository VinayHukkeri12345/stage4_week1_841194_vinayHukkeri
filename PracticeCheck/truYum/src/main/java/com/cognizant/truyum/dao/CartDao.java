package com.cognizant.truyum.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.cognizant.truyum.exception.CartEmptyException;
import com.cognizant.truyum.model.MenuItem;

public interface CartDao {

	public void addCartItem(String userId, long menuItemId);

	public ArrayList<MenuItem> getAllCartItems(String userId) throws CartEmptyException;

	public void removeCartItem(String userId, long menuItemId);
}
