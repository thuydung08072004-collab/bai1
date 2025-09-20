package Class;
import java.util.Scanner;

public class PhanSo {
    private int tuso;
    private int mauso;
    public PhanSo(){
        tuso=0;
        mauso=1;
    }
    public PhanSo(int tuso, int mauso){
        this.mauso=mauso;
        this.tuso=tuso;
    }
    public void nhapPS(Scanner sc){
        int a;
        int b;
        do{
            System.out.println("\tNhap tu so: ");
            a=sc.nextInt();
            System.out.println("\tNhap mau so: ");
            b=sc.nextInt();
            if (b==0){
                System.out.println("Mau so khong duoc bang 0. Hay nhap lai!");
            }
            else {
                tuso=a;
                mauso=b;
            }
        }
        while(b==0);
    }
    public void hienthiPS(){
        if (mauso*tuso<0 ){
            System.out.println("\t- "+Math.abs(tuso)+"/"+Math.abs(mauso) );  
    } else {
            System.out.println("\t "+Math.abs(tuso)+"/"+Math.abs(mauso) );  
        }
}
    public  PhanSo congPS(PhanSo ps2){
        if (mauso!=ps2.mauso){
            int a= tuso*ps2.mauso + ps2.tuso*mauso;
        int b= mauso*ps2.mauso;
           return new PhanSo(a,b);
       }
        else{
         int a= tuso+ps2.tuso;
            int b=mauso;
            return new PhanSo(a,b);
        }
        
    }
    public  PhanSo truPS(PhanSo ps2){
        if (mauso!=ps2.mauso){
        int a= tuso*ps2.mauso - ps2.tuso*mauso;
        int b= mauso*ps2.mauso;
        return new PhanSo(a,b);
        }
        else{
            int a= tuso-ps2.tuso;
            int b=mauso;
            return new PhanSo(a,b);
        }
    }
    public  PhanSo nhanPS(PhanSo ps2){
        int a= tuso*ps2.tuso;
        int b= mauso*ps2.mauso;
        return new PhanSo(a,b);
    }
    public  PhanSo chiaPS(PhanSo ps2){
        int a= tuso*ps2.mauso;
        int b= mauso*ps2.tuso;
        return new PhanSo(a,b);
    }
    private int timUSCLN(int a, int b){
        int r= a%b;
        while (r!=0){
            a=b;
            b=r;
            r=a%b;
        }
        return b;
    }
    public boolean kiemtratoigian(){
       if( timUSCLN (tuso, mauso)==1) {
           return true;
       }
       return false;
    }
    public void toigianPS(){
        int x=timUSCLN(tuso, mauso);
        tuso/=x;
        mauso/=x;
    }
}