package com.soumya.jdbcframework.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.soumya.jdbcframework.entity.EProduct;

@Repository
public class EProductDaoImpl implements EProductDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	class EProductRowMapper implements RowMapper<EProduct>{

		@Override
		public EProduct mapRow(ResultSet rs, int rowNum) throws SQLException {
			EProduct eproduct = new EProduct();
			
			eproduct.setProductId(rs.getLong("id"));
			eproduct.setProductName(rs.getString("pname"));
			eproduct.setProductPrice(rs.getDouble("price"));
			eproduct.setDateAdded(rs.getTimestamp("dateadded"));
			
			return eproduct;
		}
		
	}
	
	@Override
	public List<EProduct> getAllProducts() {
		
		return jdbcTemplate.query (" SELECT * FROM PRODUCTS ", new EProductRowMapper());
	}

}
