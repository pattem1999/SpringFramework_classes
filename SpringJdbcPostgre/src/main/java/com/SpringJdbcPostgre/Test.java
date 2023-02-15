package com.SpringJdbcPostgre;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Emp e=new Emp();
			e.setEid(100);
			e.setEname("ramana");
			e.setJob("developer");
			
			 EmpImp e1=new  EmpImp();
			 e1.insert(e);
					
	}

}
