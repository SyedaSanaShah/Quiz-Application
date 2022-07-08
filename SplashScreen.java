/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author Nasir Abbas Mangrio
 */
public class SplashScreen {
    public static void main(String[]args){
        NewJFrame frame=new NewJFrame();
         StatusWindow status;
        frame.setVisible(true);
        
        try{
            for(int i=0; 100>=i; i++ ){
                Thread.sleep(70);
                frame.jLabel2.setText(Integer.toString(i)+"%");
                frame.jProgressBar3.setValue(i);
              if(i==100){
                  frame.setVisible(false);
                  status =new StatusWindow();                
              }    
            }             
        }
        catch(Exception e){
            
        }
    }
    
}
