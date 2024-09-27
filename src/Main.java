import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        ArrayList<Client> clienti = new ArrayList<>();

        int meniu=-1;
        while(meniu!=0){
            System.out.println("Meniu:");
            System.out.println("1.Interogare clienti curenti.");
            System.out.println("2.Start cumparaturi, logare client.");
            System.out.println("3.Introducere produse noi in stoc.");
            System.out.println("4.Stergere produse din stoc.");
            System.out.println("0. Iesire");
            System.out.print("Alege o opțiune: ");

            meniu = scanner.nextInt();

            switch (meniu){
                case 1:{
                    System.out.println("Lista clientilor:");
                    if (clienti.isEmpty()) {
                        System.out.println("Nu există clienți înregistrați.");
                    } else {
                        for (int i = 0; i < clienti.size(); i++) {
                            System.out.println("Client " + (i + 1) + ":");
                            clienti.get(i).arataClienti();
                            System.out.println();
                        }
                    }
                    break;
                }
                case 2:{


                    break;
                }
            }
            System.out.println();
        }
    }
}
