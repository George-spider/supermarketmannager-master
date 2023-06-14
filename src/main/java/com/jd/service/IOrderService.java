package com.jd.service;

import com.jd.domain.Order;
import com.jd.query.OrderQuery;

import java.util.List;

public interface IOrderService {
    List<Order> findAll() ;

    Order findOne(Long id);

    void add(Order order);

    void update(Order order);

    void delete(Long id);

    List<Order> query(OrderQuery orderQuery);
}
