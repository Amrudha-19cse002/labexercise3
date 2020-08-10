/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labex3;

/**
 *
 * @author Desktop Pc
 */
public class statandnonstat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         aaa obj=new aaa();
  obj.incr();
  
  aaa obj1 =new aaa();
  obj1.incr();
  
  aaa obj2 =new aaa();
  obj2.incr();
  
    }
    
}
class aaa
{
     static int i=30;
            int j=10;
            void incr()
            {
                i=i+10;
                j=j+10;
                System.out.println(i);
                System.out.println(j);
                
            }
}
    
