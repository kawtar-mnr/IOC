package ext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import dao.IDao;
@Repository
public class DaoImplV2 implements IDao{

	@Override
	public double getData() {
		System.out.println("version web service");
		double data=12;
		return data;
	}

}
