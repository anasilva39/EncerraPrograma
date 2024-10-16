
package encerraprograma;

import java.util.Scanner;


public class EncerraPrograma {

    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        
        Scanner teclado = new Scanner(System.in);

        while(cc<10){
            cc++;
            System.out.println("Informe o Numero:");
            cc = teclado.nextInt();
            
            if(cc==10){
            break;
            
        }   
        }
    }
    
}
