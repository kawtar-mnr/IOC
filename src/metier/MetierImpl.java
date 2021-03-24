package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.IDao;

@Service("metier")
public class MetierImpl implements IMetier {
//Couplage faible
	@Autowired
	private IDao dao;
	@Override
	public double calcul() {
		// TODO Auto-generated method stub
		double data=dao.getData();
		double res=data*Math.PI;
		return res;				
	}
	
	//Pour injecter (affecter) une valeur à la variable dao 
	
	public void setDao(IDao dao) {
		this.dao = dao;
		
	}
	
	
	
	

}
