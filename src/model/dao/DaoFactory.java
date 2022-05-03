package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	// é um forma de injeção de dependencia implicita
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
