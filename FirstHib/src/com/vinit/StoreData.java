package com.vinit;

import javax.security.auth.login.Configuration;

public class StoreData {  
public static void main(String[] args) {  
      
    //creating configuration object  
    Configuration cfg=new Configuration();  
    ((Object) cfg).configure("hibernate.cfg.xml");//populates the data of the configuration file  
      
    //creating seession factory object  
    SessionFactory factory=cfg.buildSessionFactory();  
      
    //creating session object  
    Session session=factory.openSession();  
      
    //creating transaction object  
    Transaction t=session.beginTransaction();  
          
    Employee e1=new Employee();  
    e1.setId(115);  
    e1.setFirstName("sonoo");  
    e1.setLastName("jaiswal");  
      
    session.persist(e1);//persisting the object  
      
    t.commit();//transaction is committed  
    session.close();  
      
    System.out.println("successfully saved");  
      
}  
}  
