package com.ecom.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.entity.CartItems;

@Repository
public interface CartItemsRepository extends JpaRepository<CartItems, Long>{
	Optional<CartItems> findByProductIdAndOrderIdAndUserId(long productId, long orderId, long userId);
}
