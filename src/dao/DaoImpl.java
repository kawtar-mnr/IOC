package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DaoImpl implements IDao{

	@Override
	public double getData() {
	System.out.println("Version base de données ");
	 double data=23;
		return data;	
	}

	
}
