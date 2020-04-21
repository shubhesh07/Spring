package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO {
		private static final String GET_INSERT_CUSTOMER_QUERY="INSERT INTO LAYERED_CUSTOMER VALUES(?,?,?,?,?)";
		private DataSource ds;
		
	public CustomerDAOImpl(DataSource ds) {
			this.ds=ds;
			// TODO Auto-generated constructor stub
		}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		System.out.println("CustomerDAOImpl.insert()");
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//Get JDBC Connection object
		con=ds.getConnection();
		//Create JDBC prepared statement object
		ps=con.prepareStatement(GET_INSERT_CUSTOMER_QUERY);
				//set values to query param
		ps.setInt(1, bo.getCustno());
		ps.setString(2, bo.getCustname());
		ps.setString(3, bo.getCustaddrs());
		ps.setFloat(4, bo.getPamt());
		ps.setFloat(5, bo.getIntramt());
		//Execute SQL Query
		count=ps.executeUpdate();
		//close JDBC Object
		ps.close();
		con.close();
		return count;
	}

}//class
