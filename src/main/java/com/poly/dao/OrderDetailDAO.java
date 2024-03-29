package com.poly.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long> {
    @Query(value = "SELECT COALESCE(SUM(od.price), 0) AS totalCount FROM orderdetails od", nativeQuery = true)
    Double getTotalRevenue();
}

