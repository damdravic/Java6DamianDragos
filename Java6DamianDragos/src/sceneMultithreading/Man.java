/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sceneMultithreading;

/**
 *
 * @author Dragos
 */
public class Man extends Thread{
    //create Television instance
    Television tv = new Television();
    //the field to ensure the synchronization of the two threads
    Television syncObject;
    
    public Man(Television television){
        syncObject = television;
    }
    @Override
    public void run(){  
        //check if favorite show started
        if (tv.isTheDesiredTvShow() == false){
            try{
                Thread.sleep(200);
                System.out.println("The man does clean with the vacuum cleaner");
               //delay thread and the favorite show begins
               Thread.sleep(1500);
               
                System.out.println("..........................................");
                 Thread.sleep(400);
                 System.out.println("Meanwhile, the woman's favorite show starts at the TV");
                 Thread.sleep(400);
                 System.out.println("..........................................");
               tv.show();
               
        }
          catch(InterruptedException e){
                e.getStackTrace();}
        }
       
        
        if (tv.isTheDesiredTvShow() == true){
            System.out.println("man    - Wake up, your favorite show started");
        synchronized(syncObject){
            //notify the woman thread to wake up
            syncObject.notify(); }
          }
        
      
}
    
    
    
    
    
    
  
}
    
