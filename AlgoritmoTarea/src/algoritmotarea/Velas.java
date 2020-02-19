
package algoritmotarea;

public class Velas 
{
    public int velas = 0, apagadas = 0;
    public int[] velash = new int[100];
    public int maximo = velash[0];
    public void setnvelas(int x)
    {
        this.velas=x;
    }
    public int getnvelas()
    {
        return this.velas;
    }
    public void valt()
    {
        for(int i=0;i<velas;i++)
        {
            velash[i]=(int)(Math.random()*velas+1);
        }
    }
    public int getvalt()
    {
        return this.velash[100];
    }
    public void vpan()
    {
        System.out.print("\nLa altura de las velas es: ");
        for(int i=0;i<velas;i++)
        {
            System.out.print(+velash[i]+"");
        }
    }
    public void vapag()
    {
        for(int i=0;i<velas;i++)
        {
            if(maximo<velash[i])
                maximo=velash[i];
        }
        for(int i=0;i<velas;i++)
        {
            if(maximo==velash[i])
                apagadas+=1;
        }
        System.out.println("El numero de las velas que se apagron fueron: "+apagadas);
    }
}
