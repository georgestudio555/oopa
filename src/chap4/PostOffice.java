package chap4;
import java.util.Scanner;
public class PostOffice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         //****Delivery Price****
        //NPS = Normal price starts
        //EPS = EMS price starts
        //regis = Registration price
        int NPS = 3;
        int EPS = 27;
        int regis = 13;
        
        System.out.println("Songkhla Post Office");
        System.out.println("Program is created by Thawatchai");
        System.out.println("------------- Menu -------------");
        System.out.println("0 : Exit");
        System.out.println("1 : Normal Letter");
        System.out.println("2 : Register Letter");
        System.out.println("3 : EMS Letter");
        System.out.println("--------------------------------");
        do{
        System.out.println("Please Enter Menu : ");
        int Menu = sc.nextInt();
        switch(Menu){
            case 1:
                System.out.println("บวกเพิ่มค่าลงทะเบียน 13 บาท");
                    if(wight<=20){
                        int total = (NPS+regis);
                        System.out.println("ราคาจัดส่ง "+total);
                    }else if(wight<=100){
                        int total = (2+NPS+regis);
                        System.out.println("ราคาจัดส่ง "+total);
                    }else if(wight<=250){
                        int total = (6+NPS+regis);
                        System.out.println("ราคาจัดส่ง "+total);
                    }else if(wight<=500){
                        int total = (12+NPS+regis);
                        System.out.println("ราคาจัดส่ง "+total);
                    }else if(wight<=1000){
                        int total = (22+NPS+regis);
                        System.out.println("ราคาจัดส่ง "+total);
                    }else if(wight<=2000){
                        int total = (42+NPS+regis);
                        System.out.println("ราคาจัดส่ง "+total);
                    }
                    break;
            case 2:
                    if(wight<=20){
                        int total = EPS;
                        System.out.println("ราคาจัดส่ง "+total);
                    }else if(wight<=100){
                        int total = (5+EPS);
                        System.out.println("ราคาจัดส่ง "+total);
                    }else if(wight<=250){
                        int total = (10+EPS);
                        System.out.println("ราคาจัดส่ง "+total);
                    }else if(wight<=500){
                        int total = (20+EPS);
                        System.out.println("ราคาจัดส่ง "+total);
                    }else if(wight<=1000){
                        int total = (35+EPS);
                        System.out.println("ราคาจัดส่ง "+total);
                    }else if(wight<=2000){
                        int total = (50+EPS);
                        System.out.println("ราคาจัดส่ง "+total);
                    }
                    break;
        }while (menu !=0);
    }
    
}
