package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public interface PlaceOrderDAO {
    public String generateNewOrderId() throws SQLException, ClassNotFoundException;
    public boolean placeOrder(String orderId, String itemCode, BigDecimal unitPrice, int qty) throws SQLException, ClassNotFoundException;
    public boolean SearchOrder(String orderId) throws SQLException, ClassNotFoundException;
    boolean saveorder(String orderId, LocalDate orderDate, String customerId) throws SQLException, ClassNotFoundException;
}