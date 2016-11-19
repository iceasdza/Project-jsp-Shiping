
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author SBANG_VNP
 */
public class TestS implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Thread t1 = new Thread(new TestThread("a"));
        t1.start();
        if ((t1 == null) || (!t1.isAlive())) {
            t1 = new Thread(new TestThread("a"));            
            t1.start();
        }       
        String ans=TestThread.getNow();
        ServletContext sc=sce.getServletContext();
        sc.setAttribute("time",ans );    
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
