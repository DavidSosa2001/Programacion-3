package matriz;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Matriz 
{
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nfilas,ncolumnas;
        int diagprin=0,diagsecun=0;
        System.out.print("Digite el numero de filas de la matriz, recuerde que la matriz debe ser simetrica: ");
        nfilas=entrada.nextInt();
        System.out.print("Digite el numero de columnas de la matriz,recuerde que la matriz debe ser simetrica: ");
        ncolumnas=entrada.nextInt();
        matriz = new int[nfilas][ncolumnas];
        System.out.println("Digite los numeros de la matriz: ");
        for(int i=0;i<nfilas;i++ )
        {
            for(int j=0;j<ncolumnas;j++)
            {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j]=entrada.nextInt();
            }
        }
        System.out.println("La matriz es: ");
        for(int i=0;i<nfilas;i++)
        {
            for(int j=0;j<ncolumnas;j++)
            {
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println("");
        }
        for(int i=0;i<nfilas;i++)
        {
            for(int j=0;j<ncolumnas;j++)
            {
                if(i==j)
                {
                    diagprin+=matriz[i][j];
                }
            }
        }
        for(int i=0;i<nfilas;i++)
        {
            for(int j=0;j<ncolumnas;j++)
            {
                if((i+j)==nfilas-1)
                {
                    diagsecun+=matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: "+diagprin);
        System.out.println("La suma de la diagonal secundaria es: "+diagsecun);
        System.out.println("La suma de las diagonales es: "+(diagprin+diagsecun));
        System.out.println("La resta de las diagonales es: "+Math.abs(diagprin-diagsecun));
    } 
    
}
