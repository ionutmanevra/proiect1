import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Client> clienti = new ArrayList<>();
        ArrayList<Produs> produse = new ArrayList<>();

        produse.add(new Produs(50, "Parmezan", "Branza mautarata, clasic italiana", "Branzeturi"));
        produse.add(new Produs(100, "Laptop", "Laptop cu procesor i7, 16GB RAM, 512GB SSD", "Electronice"));

        clienti.add(new Client("Ion Popescu", "ion.popescu@gmail.com"));
        Produs getParmezan;
        CosCumparaturi cosImplicit = new CosCumparaturi(getParmezan=produse.get(0), getParmezan.getPret(), 1);
        clienti.get(0).cosCumparaturi.add(cosImplicit);

        int meniuPrincipal = -1;

        while (meniuPrincipal != 0) {
            System.out.println("\nMeniu principal:");
            System.out.println("1.Client");
            System.out.println("2.Administrator");
            System.out.println("0.Iesire");
            System.out.print("Alege o opțiune: ");
            meniuPrincipal = scanner.nextInt();

            switch (meniuPrincipal) {
                case 1: {
                    System.out.println("Va rugam sa introduceti datele cerute!");
                    System.out.println("Introduceti numele apoi mail-ul personal: ");
                    String numeNou;
                    String mailNou;
                    scanner.nextLine();

                    numeNou = scanner.nextLine();
                    mailNou = scanner.nextLine();
                    clienti.add(new Client(numeNou, mailNou));
                    int meniuClient = -1;
                    while (meniuClient != 0) {
                        System.out.println(
                                        "⠀⠈⠛⠻⠶⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠈⢻⣆⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⢻⡏⠉⠉⠉⠉⢹⡏⠉⠉⠉⠉⣿⡏⠉⠉⠉⠉⣿⠉⠉⠉⠉⠉⣹⠇⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠈⣿⣀⣀⣀⣀⣸⡏⠉⠉⠉⠉⣿⣧⣀⣀⣀⣀⣿⣄⣀⣀⣀⣠⡿⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠸⣧⠀⠀⠀⢸⡏⠉⠉⠉⠉⣿⡇⠀⠀⠀⠀⣿⠁⠀⠀⠀⣿⠃⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣧⣤⣤⣼⡏⠉⠉⠉⠉⣿⣧⣤⣤⣤⣤⣿⣤⣤⣤⣼⡏⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⠀⠀⢸⡇⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⣿⠀⠀⢠⡿⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣷⠤⠼⣷⠤⠼⠷⠤⠤⠤⠤⠿⠦⠤⠾⠃⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢾⣷⢶⣶⠶⠶⠶⠶⠶⠶⠶⠶⠶⣶⠶⣶⡶⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣧⣠⡿⠀⠀⠀⠀⠀⠀    ⢷⣄⣼⠇⠀⠀");



                        System.out.println("\nMeniu client:");
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
                                        System.out.println("\nProdusul: " + (i + 1));
                                        produse.get(i).arataProduse();
                                    }
                                }
                                break;
                            case 2: {
                                System.out.println("Sesiune cumparaturi inceputa!\n");

                                if (produse.isEmpty()) {
                                    System.out.println("Nu există produse disponibile.");
                                    break;
                                }

                                for (int i = 0; i < produse.size(); ++i) {
                                    System.out.println("Produsul: " + (i + 1));
                                    produse.get(i).arataProduse();
                                }

                                boolean cumparaturiActive = true;

                                ArrayList<CosCumparaturi> cosCurent = new ArrayList<>();

                                while (cumparaturiActive) {
                                    System.out.println("\nIntroduceti numarul produsului pe care doriti sa il adaugati in cos sau 0 pentru a finaliza cumpărăturile:");
                                    int numarProdus = scanner.nextInt();

                                    if (numarProdus == 0) {
                                        clienti.get(clienti.size() - 1).cosCumparaturi = cosCurent;
                                        System.out.println("Cumpărături finalizate. Produsele adăugate în coș:");
                                        for (CosCumparaturi cosProdus : cosCurent) {
                                            System.out.println("Produs: " + cosProdus.getProdus().getNume() +
                                                    ", Cantitate: " + cosProdus.getNumarProduse() +
                                                    ", Pret total: " + cosProdus.getPretCos());
                                        }
                                        break;
                                    }

                                    if (numarProdus > 0 && numarProdus <= produse.size()) {
                                        Produs produsAles = produse.get(numarProdus - 1);

                                        System.out.println("Introduceti cantitatea dorita pentru produsul " + produsAles.getNume() + ":");
                                        int cantitate = scanner.nextInt();

                                        int pretTotalProdus = produsAles.getPret() * cantitate;

                                        CosCumparaturi cosProdus = new CosCumparaturi(produsAles, pretTotalProdus, cantitate);
                                        cosCurent.add(cosProdus);

                                        System.out.println("Produsul " + produsAles.getNume() + " a fost adaugat in cos.");
                                    } else {
                                        System.out.println("Număr invalid. Vă rugăm să introduceți un număr valid.");
                                    }
                                }

                                break;
                            }
                            case 0:{
                                System.out.println("Inapoi la meniu!");
                                break;
                            }
                            default:
                                System.out.println("Optiune invalida.");
                                break;
                        }
                    }
                    break;
                }
                case 2: {
                    int meniuAdmin = -1;
                    int parolaAdmin = 9876;
                    int parolaCitita;

                    System.out.println("\nIntroduceti parola admin:");
                    parolaCitita = scanner.nextInt();

                    if (parolaCitita != parolaAdmin) {
                        System.out.println("Parola incorecta!");
                        break;
                    }

                    while (meniuAdmin != 0) {
                        System.out.println("\nMeniu administrator:");
                        System.out.println("1. Adauga produse noi");
                        System.out.println("2. Sterge produse existente");
                        System.out.println("3. Vizualizare clienti");
                        System.out.println("4. Vizualizare produse");
                        System.out.println("5. Viuzalizare cosuri atribuite clientiilor");
                        System.out.println("0. Inapoi la meniul principal");
                        System.out.print("Alege o opțiune: ");
                        meniuAdmin = scanner.nextInt();
                        scanner.nextLine();

                        switch (meniuAdmin) {
                            case 1: {
                                System.out.println("Introduceti numele produsului nou: ");
                                String numeNouProdus = scanner.nextLine();

                                System.out.println("Introduceti pretul produsului: " + numeNouProdus);
                                int pretProdusNou = scanner.nextInt();
                                scanner.nextLine();

                                System.out.println("Adaugati descrierea produsului: " + numeNouProdus);
                                String descriereProdusNou = scanner.nextLine();

                                System.out.println("Adaugati categoria produsului: " + numeNouProdus);
                                String categorieProdusNou = scanner.nextLine();

                                produse.add(new Produs(pretProdusNou, numeNouProdus, descriereProdusNou, categorieProdusNou));
                                System.out.println("Produs adaugat cu succes.");
                                break;
                            }
                            case 2: {
                                System.out.println("Lista produselor existente:");
                                for (int i = 0; i < produse.size(); ++i) {
                                    System.out.println((i + 1) + ". " + produse.get(i).getNume());
                                }
                                int produsEliminat;
                                System.out.println("Introduceti numarul produsului de eliminat:");
                                produsEliminat = scanner.nextInt();
                                if (produsEliminat > 0 && produsEliminat <= produse.size()) {
                                    produse.remove(produsEliminat - 1);
                                    System.out.println("Produs eliminat!");
                                } else {
                                    System.out.println("Numar produs gresit!");
                                }


                                break;
                            }
                            case 3: {
                                System.out.println("Lista clientilor:");
                                if (clienti.isEmpty()) {
                                    System.out.println("Nu există clienți înregistrați.");
                                } else {
                                    for (int i=0;i<clienti.size();++i) {
                                        System.out.println("Client "+(i+1)+":");
                                        clienti.get(i).arataClienti();
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            case 4:{
                                if(produse.isEmpty()){
                                    System.out.println("Lista este goala!!!");
                                }
                                else {
                                    for (int i = 0; i<produse.size();++i) {
                                        System.out.println("Produs "+(i+1)+":");
                                        produse.get(i).arataProduse();
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            case 5:{
                                for (int i=0; i<clienti.size();++i) {
                                    System.out.println("Client "+(i+1)+":");
                                    clienti.get(i).arataClienti();
                                    System.out.println();
                                    if (clienti.get(i).cosCumparaturi == null) {
                                        System.out.println("Coșul este gol.");
                                    } else {
                                        System.out.println("Produse în coș:");
                                        for (CosCumparaturi cosProdus:clienti.get(i).cosCumparaturi) {
                                            System.out.println("Produs: "+cosProdus.getProdus().getNume() +
                                                    ", Cantitate: "+cosProdus.getNumarProduse() +
                                                    ", Pret total: "+cosProdus.getPretCos());
                                        }
                                    }
                                    System.out.println();
                                }
                                break;
                            }
                            case 0: {
                                System.out.println("Inapoi la meniul principal");
                                break;
                            }
                            default:
                                System.out.println("Optiune invalida.");
                                break;
                        }
                    }
                }
                case 0: {
                    System.out.println("La revedere!");
                    break;
                }
                default: {
                    System.out.println("Optiune invalida.");
                    break;
                }
            }
        }
    }
}