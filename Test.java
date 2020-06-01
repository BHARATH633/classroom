package com.durgasoft.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.durga.pojo.Employee;

public class Test {

	public static void main(String[] args)throws Exception {
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
	Employee emp=new Employee();
	emp.setEmployeeid(111);
    emp.setEmployeename("bharath");
   
    emp.setEmployeeaddr("hyd");
    int employeeid =(Integer)ses.save(emp);
    tx.commit();
  
if(employeeid== 111) {
    	System.out.println("employee inserted sucessfully");
    	
    }
    else {
    	System.out.println("employee not inserted");
    }
    ses.close();
    sf.close();
    }
	}

