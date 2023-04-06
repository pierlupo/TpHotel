package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Demo implements IHM {




        String firstName;
        String lastName;
        long tel;


        List<Customer> listeCustomer = new ArrayList<>();
        Customer customer = new Customer(1, "Michel", "Tete", 0321212121);
        Customer customer1 = new Customer(2, "Philippe", "Tutu", 0324242424);
        Customer customer2 = new Customer(3, "Paul", "Tata", 0325252525);
        Customer customer3 = new Customer(4, "Pierre", "Toto", 03202020220);
        Customer customer4 = new Customer(5, "Jacques", "Titi", 0322222222);


        public void proposition () {
            listeCustomer.add(customer);
            listeCustomer.add(customer1);
            listeCustomer.add(customer2);
            listeCustomer.add(customer3);
            listeCustomer.add(customer4);
            Scanner sc = new Scanner(System.in);
            System.out.println("==== Gestion des clients et des réservations ====");
            System.out.println();

            String[] propositions = {"1- Ajouter un client", "2- Ajouter une réservation", "3- Annuler une réservation", "4- Afficher la liste des réservations", "0- Quitter", "Entrez votre choix : "};

            for (String prop : propositions) {
                System.out.println(prop);
            }

            String answer = sc.next();

            switch (answer) {
                case "1":
                    menuCustomer();
                    proposition();

                case "2":
                    System.out.println("==== ajouter une réservation ====");
                    System.out.println();
                case "3":
                    System.out.println("==== annuler une réservation ====");
                    System.out.println();
                    System.out.println("Merci de saisir le nom : ");

                    sc.nextLine();
                    proposition();

                case "0":
                    break;

                default:
                    System.out.println("Je n'ai pas compris votre demande ");
                    proposition();


            }


        }


        public void menuCustomer () {
            Scanner sc = new Scanner(System.in);
            System.out.println("==== Gestion des Clients ====");
            System.out.println();

            String[] propositions = {"1-- Ajouter un client", "2- Afficher la liste des clients", "3-- Afficher les réservations d'un client", "0-- Retour", "Entrez votre choix : "};

            for (String prop : propositions) {
                System.out.println(prop);
            }

            String answer = sc.next();


            switch (answer) {
                case "1":
                    ajouterCustomer();
                    int id = 0;
                    Customer customer = new Customer(id, firstName, lastName, tel);
                    listeCustomer.add(customer);
                    menuCustomer();

                case "2":
                    afficherListeCustomer();
                    menuCustomer();

                case "3":

                    proposition();
                    menuCustomer();

                case "0":
                    break;

                default:
                    System.out.println("Je n'ai pas compris votre demande ");
                    menuCustomer();
            }
            proposition();
        }

        public void ajouterCustomer () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Merci de saisir votre nom");
            lastName = sc.nextLine();
            System.out.println("Merci de saisir votre prénom");
            firstName = sc.nextLine();
            //  sc.nextLine();
            System.out.println("Merci de saisir votre téléphone");
            long tel = Long.parseLong(sc.next());

        }

        @Override
        public void afficherListeCustomer () {
            for (Customer c : listeCustomer) {
                System.out.println(c);


            }
        }

        public void afficherResaCustomer () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Merci de saisir votre téléphone");
            tel = Long.parseLong(sc.nextLine());
        }

        @Override
        public void ajouterResa () {

        }

        @Override
        public void annulerResa () {

        }
    }

