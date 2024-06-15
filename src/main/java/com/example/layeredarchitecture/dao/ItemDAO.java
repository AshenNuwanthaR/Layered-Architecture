package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    public void deleteItem(String code) throws SQLException, ClassNotFoundException;

    public void saveItem(String code, String description, BigDecimal unitPrice, int qtyOnHand) throws SQLException, ClassNotFoundException;

    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;

    public void updateItem(String description,BigDecimal unitPrice,int qtyOnHand,String code) throws SQLException, ClassNotFoundException;

    public boolean existItem(String code) throws SQLException, ClassNotFoundException;

    public String genaralId() throws SQLException, ClassNotFoundException;

    public ItemDTO findItem(String newItemCode) throws SQLException, ClassNotFoundException ;

    public boolean updateItem(ItemDTO item) throws SQLException, ClassNotFoundException ;
}
