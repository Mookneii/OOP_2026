import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        while(true){

        System.out.println("Phone Setting:\r\n" + //
                        "1. General >\r\n" + //
                        "2. Wi-Fi >\r\n" + //
                        "3. Bluetooth >\r\n" + //
                        "4. Mobile Data >\r\n" + //
                        "5. Hotspot >\r\n" + //
                        "6. Notification >\r\n" + //
                        "0. Quit");
        System.out.print("Choice: ");
        int choice = input.nextInt();
        switch(choice){
            case 1:
                while(true){
                    System.out.println("General:\r\n" + //
                                                "1. About >\r\n" + //
                                                "2. Software update >\r\n" + //
                                                "3. Storage >\r\n" + //
                                                "0. Back");
                    System.out.print("Choice: ");
                    int choice1 = input.nextInt();
                    input.nextLine();
                    if(choice1 == 0){
                        break;
                    }
                    else if(choice1 == 1){
                        while(true){
                        System.out.println("General > About:\r\n" + //
                                                        "Name iPhone\r\n" + //
                                                        "Model IXs\r\n" + //
                                                        "Version 18.5\r\n" + //
                                                        "0. Back\r\n" + //
                                                        "");
                        System.out.print("Choice: ");
                        int choice2 = input.nextInt();
                        input.nextLine();
                        if(choice2 == 0){break;}
                        else{System.out.println("Invalid choice!");}
                        }
                    }
                    else if(choice1 ==2){
                         while(true){
                        System.out.println("General > Software Update:\r\n" + //
                                                        "======================\r\n" + //
                                                        "Software is up to date\r\n" + //
                                                        "======================\r\n" + //
                                                        "0. Back");
                        System.out.print("Choice: ");
                        int choice2 = input.nextInt();
                        input.nextLine();
                        if(choice2 == 0){break;}
                        else{System.out.println("Invalid choice!");}
                        }
                    }
                    else if(choice1 == 3){
                        while(true){
                        System.out.println("Title:\r\n" + //
                                                        "============================\r\n" + //
                                                        "The Feature is not available\r\n" + //
                                                        "============================\r\n" + //
                                                        "0. Back");
                        System.out.print("Choice: ");
                        int choice2 = input.nextInt();
                        input.nextLine();
                        if(choice2 == 0){break;}
                        else{System.out.println("Invalid choice!");}
                        }
                    }else{
                        System.out.println("Invalid choice!");
                    }
                }
                break;
            case 2: 
             while(true){
                    System.out.println("Wi-Fi:\r\n" + //
                                                "Status On\r\n" + //
                                                "Network I-Coffee\r\n" + //
                                                "1. Other networks >\r\n" + //
                                                "0. Back");
                    System.out.print("Choice: ");
                    int choice1 = input.nextInt();
                    input.nextLine();
                    if(choice1 == 0){
                        break;
                    }
                    else if(choice1 == 1){
                        while(true){
                        System.out.println("Wi-Fi > Other networks:\r\n" + //
                                                        "Bayon coffee *****\r\n" + //
                                                        "Angkor coffee **\r\n" + //
                                                        "Brown coffee ****\r\n" + //
                                                        "Koi *\r\n" + //
                                                        "0. Back");
                        System.out.print("Choice: ");
                        int choice2 = input.nextInt();
                        input.nextLine();
                        if(choice2 == 0){break;}
                        else{System.out.println("Invalid choice!");}
                        }
                    }else{
                        System.out.println("Invalid choice!");
                    }
                    
                }
                break;
            
            case 3: 
             while(true){
                    System.out.println("Title:\r\n" + //
                                                "============================\r\n" + //
                                                "The Feature is not available\r\n" + //
                                                "============================\r\n" + //
                                                "0. Back");
                    System.out.print("Choice: ");
                    int choice1 = input.nextInt();
                    input.nextLine();
                    if(choice1 == 0){
                        break;
                    }
                    else{
                        System.out.println("Invalid choice!");
                    }
                    
                }
                break;
            case 4:
                while(true){
                    System.out.println("Title:\r\n" + //
                                                "============================\r\n" + //
                                                "The Feature is not available\r\n" + //
                                                "============================\r\n" + //
                                                "0. Back");
                    System.out.print("Choice: ");
                    int choice1 = input.nextInt();
                    input.nextLine();
                    if(choice1 == 0){
                        break;
                    }
                    else{
                        System.out.println("Invalid choice!");
                    }
                    
                }
                break;
            case 5: 
            while(true){
                    System.out.println("Title:\r\n" + //
                                                "============================\r\n" + //
                                                "The Feature is not available\r\n" + //
                                                "============================\r\n" + //
                                                "0. Back");
                    System.out.print("Choice: ");
                    int choice1 = input.nextInt();
                    input.nextLine();
                    if(choice1 == 0){
                        break;
                    }
                    else{
                        System.out.println("Invalid choice!");
                    }
                    
                }
                break;
            case 6:
                while(true){
                    System.out.println("Title:\r\n" + //
                                                "============================\r\n" + //
                                                "The Feature is not available\r\n" + //
                                                "============================\r\n" + //
                                                "0. Back");
                    System.out.print("Choice: ");
                    int choice1 = input.nextInt();
                    input.nextLine();
                    if(choice1 == 0){
                        break;
                    }
                    else{
                        System.out.println("Invalid choice!");
                    }
                    
                }
                break;
            case 0:
                System.out.println("Programming end...");
                System.exit(0);
            default:
                System.out.println("Invalid Choice!");
        }
                        }
    }
}

