package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class Presentation {

	public static void main(String[] args) throws Exception {
		
	/*	//injection des dépendances par instanciation statique => new
		
		DaoImpl dao=new DaoImpl();
		
		MetierImpl metier=new MetierImpl();
		metier.setDao(dao);
		
		System.out.println(metier.calcul());
		*/
				
			Scanner scanner=new Scanner(new File("./src/config.txt"));
			
		   String daoClassName=scanner.nextLine();//1
			Class cDao=Class.forName(daoClassName);//2
			IDao dao=(IDao)cDao.newInstance();//3
			// 3 lignes = DaoImpl dao=new DaoImpl();
			//System.out.println(dao.getData());
			
			String metierClassName=scanner.nextLine();
			Class cMetier=Class.forName(metierClassName);
			IMetier metier=(IMetier) cMetier.newInstance();
			
			Method m=cMetier.getMethod("setDao",IDao.class);
			m.invoke(metier,dao);
			
			System.out.println(metier.calcul());
		
	
	}

}
