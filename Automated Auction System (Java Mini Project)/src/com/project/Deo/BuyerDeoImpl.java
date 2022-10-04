package com.project.Deo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.project.Utility.DBUtil;
import com.project.beam.Buyer;

public class BuyerDeoImpl implements Buyer_Deo{

	@Override
	public String registeredAsBuyer(Buyer buyer) {
		
		String message = "Oops! Buyer Registering Unsucessfull";
	    
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps =  conn.prepareStatement("insert into Buyer(buyerName,buyerEmail,buyerPhone,buyerAddress) values(?,?,?,?)");
			
			ps.setString(1, buyer.getBuyerName());
			ps.setString(2, buyer.getBuyerEmail());
			ps.setLong(3, buyer.getBuyerPhone());
			ps.setString(4, buyer.getBuyerAddress());
			
			int x = ps.executeUpdate();
			
			if(x>0) {
				message = "Buyer Registered Successfully";
			}
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		return message;
		
	}
}
