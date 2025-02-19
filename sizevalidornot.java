import java.util.Scanner;
class sizevalidornot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a size:");
        int size=scan.nextInt();
        switch(size){
            case 29:
              System.out.println("SMALL");
              break;
            case 30:
                System.out.println("Medium");
                break;
                case 38:
                    System.out.println("LARGE");
                    break;
                    case 42:
                        System.out.println("xlarge");
                        break;
                        default:
                            System.out.println("invalid");
        }

    }
} 
