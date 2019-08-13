package chap4;
import java.util.Scanner;
public class Ems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //****Delivery Price****
        //NPS = Normal price starts
        //EPS = EMS price starts
        //regis = Registration price
        int NPS = 3;
        int EPS = 27;
        int regis = 13;
        int category;
        int Exit = 0;
        int wight;
        
        System.out.println("********George Express********");
        do{        
        System.out.println("");
        System.out.println("โปรดเลือกประเภทการส่ง");
        System.out.println("1.ธรรมดา 2.ลงทะเบียน 3.EMS 4.ออก");
        System.out.println("******************************");
        System.out.print("เลือก : ");
        category = sc.nextInt();
        //ScanCategory
        switch(category){
            case 1:
                System.out.println("******************************");
                System.out.print("โปรดระบุน้ำหนัก (g) : ");
                wight = sc.nextInt();
                System.out.println("=============================");
                    if(wight<=20){
                        int total = (NPS);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=100){
                        int total = (2+NPS);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=250){
                        int total = (6+NPS);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=500){
                        int total = (12+NPS);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=1000){
                        int total = (22+NPS);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=2000){
                        int total = (42+NPS);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }
                    break;
            case 2:
                System.out.println("******************************");
                System.out.print("โปรดระบุน้ำหนัก (g) : ");
                wight = sc.nextInt();
                System.out.println("=============================");
                    if(wight<=20){
                        int total = (NPS+regis);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=100){
                        int total = (2+NPS+regis);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=250){
                        int total = (6+NPS+regis);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=500){
                        int total = (12+NPS+regis);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=1000){
                        int total = (22+NPS+regis);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=2000){
                        int total = (42+NPS+regis);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }
                    break;
            case 3:
                System.out.println("******************************");
                System.out.print("โปรดระบุน้ำหนัก (g) : ");
                wight = sc.nextInt();
                System.out.println("=============================");
                    if(wight<=20){
                        int total = EPS;
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=100){
                        int total = (5+EPS);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=250){
                        int total = (10+EPS);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=500){
                        int total = (20+EPS);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=1000){
                        int total = (35+EPS);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }else if(wight<=2000){
                        int total = (50+EPS);
                        System.out.print("ราคาจัดส่ง ");
                        System.out.print(+total);
                        System.out.println(" บาท");
                        System.out.println("=============================");
                    }
                    break;
            case 4:
                    System.out.println("ออกจากระบบ");
                    category = Exit;
                    break;
            }
        }while (category !=0);
    }
}
