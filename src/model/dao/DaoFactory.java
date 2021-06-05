package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	/*
	 * Aux class responsible for instantiating DAOs
	 */
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
	
}
