
import java.util.Scanner;

 

public class Main 
{
    public static void main(String[] args) {

        /* 1 a*/
        if(6<6*5)
             System.out.println("Hello");
             System.out.println(" There");
        // Respuesta: Hello
        // there
         
        
        /* 1 b*/
        int x=1, y=2, z=3;

          if(x>y)
          if(x>z)
              System.out.println("11111");
          else 
              System.out.println("22222");
        //Respuesta: No imprime nada
        
        
        /* 1 c*/
        if (x < z)
          System.out.println("*");
        else if  (x == z)
          System.out.println("&");
        else 
          System.out.println("$");
        //Respuesta: (los valores x,y y z ya estan difinidos, por eso no se incluye de nuevo en esta sentencia)
        //imprime "*"
        
        
        /* 1 d*/
        if(x<y)
          System.out.println("####");
        else
          System.out.println("&&&&");
          System.out.println("****");
        //Respuesta: ####
        //****
        
        
        /* 1 e*/
        if(x>y)
          System.out.println("####");
        else
          System.out.println("&&&&");
          System.out.println("****");
        //Respuesta: &&&&
        //****
        
        
        /* 1 f*/
        int al=100; int a2=200;
        
        if(al>100 && a2<=200)
          System.out.print(al+" "+a2+" "+(al+a2));
        else
          System.out.print(al+" "+a2+" "+(2*al-a2));
        //Respuesta: 100 200 0 
        
        
        
        /* 1 g*/
        if(++x > y++ || x-- > 0)
            z++;
        else 
            z--;
        System.out.println(x+" "+y+" "+z); 
        //Respuesta: (no hay salto y se junto la respuesta anterior y esta, aqui imprime es 1 3 4)

        
        /* 1 h*/
        if(x<y){
            System.out.println("####");
            System.out.println("****");
        }
        else
            System.out.println("&&&&");
        //Respuesta: ####
        //****
        
        
        /* 1 i*/
        if ('x' > 'y' || 66 > (int)('A'))
          System.out.println("#*#");
        //Respuesta: #*#
        
        
        /* 1 j*/
        if (x < z)
          System.out.println("*");
        else if (x==z)
          System.out.println("&");
        else 
          System.out.println("$");
        //Respuesa: *
        
        
    
    }
}   
           