import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        String actions = "İşlemler\n"
                +"1.Yazılımcı işlemleri\n"
                +"2.Yönetici işlemleri\n"
                +"Çıkış için q'ya basın";
        System.out.println(actions);

        while(true){
            System.out.println("Yapamk istediğiniz işlemi saçin (1,2 veya q )");
            String action = scr.nextLine();

            if(action.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }

            else if (action.equals("1")){
                Programmer programmer = new Programmer("Asya","Yılmaz",13,"Java,Python,Go");
                String softwareActions = "1.Sistem Güncelleme\n"
                        +"2. Bilgileri Göster\n"
                        +"Çıkış için q'ya bas";
                System.out.println(softwareActions);
                while (true){
                    System.out.println("Yapamk istediğiniz işlemi saçin (1,2 veya q )");
                    String softwareProcess = scr.nextLine();
                    if(softwareProcess.equals("q")){
                        System.out.println("Çıkış Yapılıyor");
                        break;
                    }
                    else if (softwareProcess.equals("1")) {
                        System.out.print("İşletim Sistemi : ");
                        String operatingSystem = scr.nextLine();
                        programmer.formatIt(operatingSystem);

                     }
                    else if(softwareProcess.equals("2")){
                        programmer.showInformation();

                    }
                    else{
                        System.out.println("Geçersiz İşlem Seçimi");
                    }
                }


            }

            else if (action.equals("2")){
                Manager manager = new Manager("Aslı","Kaya",11,8);
                String managerActions = "1.Zam Yap\n"
                        +"2.Bilgileri göster\n"
                        +"Çıkış için q'ya bas";
                System.out.println(managerActions);
                while (true){
                    System.out.println("Yapamk istediğiniz işlemi saçin (1,2 veya q )");
                    String managerProcess = scr.nextLine();

                    if(managerProcess.equals("q")){
                        System.out.println("Çıkış Yapılıyor...");
                        break;
                    }
                    else if(managerProcess.equals("1")){
                        System.out.println("Yapılması istenen zam miktarı : ");
                        int amount = scr.nextInt();
                        scr.nextLine();
                        manager.makeARaise(amount);
                    }
                    else if(managerProcess.equals("2")){
                        manager.showInformation();
                    }
                    else{
                        System.out.println("Geçersiz işlem seçimi ...");
                        break;
                    }

                }

            }

            else{
                System.out.println("Geçersiz işlem seçimi ...");
            }






        }





    }
}