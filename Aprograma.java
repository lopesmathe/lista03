import java.util.Scanner;

public class Aprograma {
    public static void main(String[] args) {
        
        Scanner Escolha = new Scanner(System.in);
        System.out.println("escolha qual ex vc vai querer!!!");
        int escolha = Escolha.nextInt();
        switch (escolha) {
            case 1:
                Ex1.run();
                break;
            case 2:
                 Ex2.run();
                 break;
            case 3:
                Ex3.run();
                break;
            case 4:
                Ex4.run();
                break;
            case 5:
                Ex5.run();
                break;
            case 6:
                Ex6.run();
                break;
            case 7:
                Ex7.run();
                break;
                /*
             * case 8:
             * Ex8.run();
             * break;
             * case 9:
             * Ex9.run();
             * break;
             * case 10:
             * Ex10.run();
             * break;
             * case 11:
             * Ex11.run();
             * break;
             * case 12:
             * Ex12.run();
             * break;
             * case 13:
             * Ex13.run();
             * break;
             * case 14:
             * Ex14.run();
             * break;
             * case 15:
             * Ex15.run();
             * break;
             * case 16:
             * Ex16.run();
             * break;
             * case 17:
             * Ex17.run();
             * break;
             * case 18:
             * Ex18.run();
             * break;
             * case 19:
             * Ex19.run();
             * break;
             * case 20:
             * Ex20.run();
             * break;
             */
        }
    }
}