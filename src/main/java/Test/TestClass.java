package Test;
import java.util.Scanner;
import Class.PhanSo;
public class TestClass {   
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    PhanSo ps1=new PhanSo();
    PhanSo ps2=new PhanSo();
    PhanSo psTong=new PhanSo();
    PhanSo psTru=new PhanSo();
    PhanSo psNhan=new PhanSo();
    PhanSo psChia=new PhanSo();
    
    System.out.println("Nhap vao phan so thu nhat: ");
    ps1.nhapPS(sc);
    System.out.println("Nhap vao phan so thu hai: ");
    ps2.nhapPS(sc);
    psTong=ps1.congPS(ps2);
    psTru=ps1.truPS(ps2);
    psNhan=ps1.nhanPS(ps2);
    psChia=ps1.chiaPS(ps2);
     System.out.println("Phan so thu nhat la:  ");
     ps1.hienthiPS();
     System.out.println("Phan so thu hai la:  ");
     ps2.hienthiPS();
     System.out.println("Tong la:  ");
     psTong.hienthiPS();
     System.out.println("Hieu la:  ");
     psTru.hienthiPS();
     System.out.println("Tich la:  ");
     psNhan.hienthiPS();
     System.out.println("Thuong la:  ");
     psChia.hienthiPS();   
    sc.close();
}
}