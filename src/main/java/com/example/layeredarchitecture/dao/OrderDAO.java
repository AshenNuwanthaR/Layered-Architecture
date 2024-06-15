package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface OrderDAO {
    public String generateNewOrderId() throws SQLException, ClassNotFoundException ;
    public void getOrderId(String orderId) throws SQLException, ClassNotFoundException ;
    public boolean findOrderId(String orderId) throws SQLException, ClassNotFoundException ;
    public boolean saveOrder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;
}
