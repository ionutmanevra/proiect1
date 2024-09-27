import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        ArrayList<Client> clienti=new ArrayList<>();
        ArrayList<Produs> produse=new ArrayList<>();

        produse.add(new Produs(50,"Parmezan","Branza mautarata, clasic italiana","Branzeturi"));
        clienti.add(new Client("Ion Popescu", "ion.popescu@gmail.com"));

        int meniuPrincipal = -1;

        while(meniuPrincipal != 0){
            System.out.println("Meniu principal:");
            System.out.println("1.Client");
            System.out.println("2.Administrator");
            System.out.println("0.Iesire");
            System.out.print("Alege o opțiune: ");
            meniuPrincipal = scanner.nextInt();

            switch (meniuPrincipal){
                case 1: {
                    int meniuClient=-1;
                    while (meniuClient!=0) {
                        System.out.println("Va rugam sa introduceti datele cerute!");
                        System.out.println("Introduceti numele apoi mail-ul personal: ");


                        System.out.println("Meniu client:");
                        System.out.println("1.Vizualizare produse");
                        System.out.println("2.Incepe cumparaturile");
                        System.out.println("0.Inapoi la meniul principal");
                        System.out.print("Alege o opțiune: ");
                        meniuClient = scanner.nextInt();

                        switch (meniuClient) {
                            case 1:
                                System.out.println("Lista produselor disponibile:");
                                if (produse.isEmpty()) {
                                    System.out.println("Nu exista produse inregistrate.");
                                } else {
                                    for (int i = 0; i < produse.size(); ++i) {
                                        System.out.println("Produsul: " + (i + 1));
                                        produse.get(i).arataProduse();
                                    }
                                }
                                break;
                            case 2:

                            case 0:
                                System.out.println("Inapoi la meniul principal...");
                                break;
                            default:
                                System.out.println("Optiune invalida.");
                                break;
                        }
                    }
                    break;
                }
                case 2: {
                    int meniuAdmin = -1;
                    int parolaAdmin=9876;
                    int parolaCitita;

                    System.out.println("Introduceti parola admin:");
                    parolaCitita=scanner.nextInt();

                    if(parolaCitita!=parolaAdmin){
                        System.out.println("Parola incorecta!");
                        break;
                    }

                    while (meniuAdmin != 0) {
                        System.out.println("Meniu administrator:");
                        System.out.println("1. Adauga produse noi");
                        System.out.println("2. Sterge produse existente");
                        System.out.println("0. Inapoi la meniul principal");
                        System.out.print("Alege o opțiune: ");
                        meniuAdmin = scanner.nextInt();

                        switch (meniuAdmin) {
                            case 1:
                                System.out.println("Introduceti numele produsului nou: ");
                                String numeNouProdus = scanner.nextLine();

                                System.out.println("Introduceti pretul produsului: " + numeNouProdus);
                                int pretProdusNou = scanner.nextInt();

                                System.out.println("Adaugati descrierea produsului: " + numeNouProdus);
                                String descriereProdusNou = scanner.nextLine();

                                System.out.println("Adaugati categoria produsului: " + numeNouProdus);
                                String categorieProdusNou = scanner.nextLine();

                                produse.add(new Produs(pretProdusNou, numeNouProdus, descriereProdusNou, categorieProdusNou));
                                System.out.println("Produs adaugat cu succes.");
                                break;
                            case 2:
                                System.out.println("Lista produselor existente:");
                                for (int i = 0; i < produse.size(); ++i) {
                                    System.out.println((i + 1) + ". " + produse.get(i).getNume());
                                }
                                System.out.println("Introduceti numarul produsului de sters: ");
                                int indexProdusSters = scanner.nextInt() - 1;
                                if (indexProdusSters >= 0 && indexProdusSters < produse.size()) {
                                    System.out.println("Produsul " + produse.get(indexProdusSters).getNume() + " a fost sters.");
                                    produse.remove(indexProdusSters);
                                } else {
                                    System.out.println("Numar de produs invalid.");
                                }
                                break;
                            case 0:
                                System.out.println("Inapoi la meniul principal...");
                                break;
                            default:
                                System.out.println("Optiune invalida.");
                                break;
                        }
                    }
                    break;
                }
                case 0:
                    System.out.println("La revedere!");
                    break;
                default:
                    System.out.println("Optiune invalida.");
                    break;
            }
        }
    }
}