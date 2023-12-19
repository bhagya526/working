package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;

    public boolean saveItem(String code, String description, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException;


    public boolean existItem(String code) throws SQLException, ClassNotFoundException;

    public boolean updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException ;

        public ItemDTO findItem(String newItemCode) throws SQLException, ClassNotFoundException;


    public ResultSet loadAllItems() throws SQLException, ClassNotFoundException;
}
