package com.ashokit.generator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator{
	private static final String query="SELECT ORDER_ID_SEQ.NEXTVAL FROM DUAL";

	@Override
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
		String prefix="OD";
		String suffix="";
		try {
			Connection con = session.connection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			if(rs.next()) {
				suffix=String.valueOf(rs.getInt(1));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return prefix+suffix;
	}

}
