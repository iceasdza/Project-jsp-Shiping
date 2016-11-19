/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Warhead_TH
 */
class TestThread implements Runnable{
    public static String now;
    public static String setTime = "08/11/2559 23:37";
    Date d = null;
    
    public TestThread(){
        d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(d.getTime()));
        now = format.format(cal.getTime());
        this.now = now;
    }   
    
    public TestThread(String now){
        d = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date(d.getTime()));
        now = format.format(cal.getTime());
        this.now = now;
    }

    public static String getNow() {
        return now;
    }

    public static String getSetTime() {
        return setTime;
    }

    public Date getD() {
        return d;
    }


    
   
    
    public void run() {
        while(!now.equals(setTime)){
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            Calendar cal = Calendar.getInstance();
            now = format.format(cal.getTime());
            System.out.println("Time is: "+now);
            try {
                Thread.sleep((1000*60));
            } catch (Exception e) {
            }
            cal.add(Calendar.MINUTE,1);
        }
        if(now.equals(setTime)){
               System.out.print("In Time!!");
           }
        
    }
     
    
    public void main(String[] args){
            //Thread t1 = new Thread(new TestThread(now));
            Thread t1 = new Thread();
            //t1.start();
            t1.run();
        }

    
}
