import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void pierwszeITrzecieZadanieString(Scanner scanner){
        System.out.println("Podaj imię i nazwiosko w formacie IMIE NAZWISKO: ");
        String[] podanyString = scanner.nextLine().split(" ");

        if(podanyString.length >= 2){
            System.out.println("Witaj " + podanyString[0] + " i masz nazwisko " + podanyString[1]);
        }else {
            System.out.println("Witaj, " + podanyString[0]);
        }
        System.out.println("Długość twojego imienia to: " + podanyString[0].length());
    }

    public static void czwarteZadanieString(){
        String haslo = "Veni, Vidi, Vici";
        int firstIndex = haslo.indexOf("Vidi");
        System.out.println(haslo.substring(firstIndex,firstIndex+4));
    }

    public static void piateZadanieString(){
        String hasloDrugie = "si vis pacem para bellum";
        System.out.println(hasloDrugie.toUpperCase());
    }

    public static void pierwszeZadanieIfy(Scanner scanner){
        try{
            System.out.println("Podaj liczba: ");
            int podanaLiczba = scanner.nextInt();
            System.out.println((podanaLiczba < 0) ? "Mniejsza od zera":"Większa od zera");
        }catch (Exception e){
            System.out.println("Podales cos innego niz liczbe");
            scanner.nextLine();
        }
    }

    public static void drugieZadanieIfy(Scanner scanner){
        int podanyWiek = -1;
        try{
            System.out.println("Podaj swoj wiek:");
            podanyWiek = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Podales znak");
            scanner.nextLine();
        }
        if(podanyWiek < 0) System.out.println("Czy aby napewno?");
        else if (podanyWiek < 18) System.out.println("Jestes mlody");
        else if (podanyWiek < 65) System.out.println("Jestes w srednim wieku");
        else System.out.println("Jestes starszy");
    }

    public static void trzecieZadanieIfy(Scanner scanner){
        try {
            System.out.println("Podaj liczbe, a powiem czy ona jest w przedziale od 39 do 55: ");
            int podaneLiczbaDruga = scanner.nextInt();
            if(podaneLiczbaDruga >= 39 && podaneLiczbaDruga <= 55) System.out.println("Jestes w przedziale od 39 do 55");
            else System.out.println("Nie jestes w przedziale od 39 do 55");
        }catch (Exception e){
            System.out.println("Podales znak");
            scanner.nextLine();
        }
    }

    public static void pierwszeZadanieFor(){
        for(int i = 0; i < 31; i++) System.out.println(i);
    }

    public static void drugieZadanieFor(){
        String result = "";
        for(int i = 3; i < 35; i++){
            if(i % 2 == 0) {
                result += i;
                if(i < 34) result += ", ";
            }
        }
        System.out.println(result);
    }

    public static void trzecieZadanieFor(){
        for(int i = 20; i > - 11; i--) System.out.println(i);
    }

    public static void czwarteZadanieFor(){
        String result = "";
        int zmiennaPomocniczna = 1;
        for(int i = 0; i < 51; i++){
            if(i % 8 == 0) {
                if(zmiennaPomocniczna % 2 == 0) {
                    result += i + " ";
                }
                zmiennaPomocniczna++;
            }
        }
        System.out.println(result);
    }

    public static void kwadrat(char znak, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                System.out.print(znak);
            System.out.println();
        }
    }

    public static void trojkat(char znak, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++)
                System.out.print(znak);
            System.out.println();
        }
    }

    public static void piramida(char znakDoZadan, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i  - 1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i + 1; k++){
                System.out.print(znakDoZadan);
            }
            System.out.println();
        }
    }

    public static String dodaj_puste(int i, int spacja) {
        String result = i + "";
        while (result.length() < spacja)
        {
            result += " ";
        }
        return result;
    }

    public static int obliczWartosc(int wiersz, int kolumna)
    {
        if (kolumna == 1 || kolumna == wiersz) {
            return 1;
        }
        else
        {
            return obliczWartosc(wiersz-1, kolumna-1)+ obliczWartosc(wiersz-1, kolumna);
        }
    }

    public static void trojkatPascala(){
        for (int i=1; i<=6; i++)
        {
            for (int j=1; j<=6-i; j++)
            {
                System.out.print("   ");
            }
            for (int k=1; k<=i; k++)
            {
                System.out.print(dodaj_puste(obliczWartosc(i, k), 6));
            }
            System.out.println();
        }
    }

    public static void piewszeWhile(){
        int i = 15;
        while(i <= 75){
            System.out.println(i++);
        }
    }

    public static void drugiWhile(Scanner scanner){
        scanner.nextLine();
        int result = 11;
        boolean isNotNumber = false;
        while(!(result > 0 && result < 10)){
            try {
                System.out.println("Zgadnij liczbe");
                result = scanner.nextInt();
                isNotNumber = false;
            } catch (Exception e) {
                isNotNumber = true;
                scanner.nextLine();
            }
            if (isNotNumber) {
                System.out.println("Podaj liczbe");
            } else {
                if (result < 0) {
                    System.out.println("Podaj wieksze liczbe");
                } else if (result > 11) {
                    System.out.println("Podaj mniejsze liczbe");
                } else {
                    System.out.println("Brawo zgadles");
                    //break;
                }
            }
        }
    }

    public static void trzeciWhile(){
        int x = 5, y = 10;
        for(int n = 10; n > 0 ; n--){
            System.out.println(x + y);
        }
    }

    public static void czwartyWhile(){
        int suma = 0;
        int i = 0;
        while(suma < 100){
            i += 3;
            suma += i;
        }
    }

    public static void piatyWhile(Scanner scanner){
        scanner.nextLine();
        int result = -1;
        Random rand = new Random();
        int random = rand.nextInt(10);
        while(result!=random) {
            try {
                System.out.println("Zgadnij liczbe");
                result = scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine();
            }
        }
        System.out.println("Brawo zgadles");
    }

    public static void pierwszyDoWhile(){
            int i = 0;
        do{
            System.out.println(i++);
        }while (i < 11);
    }

    public static void drugiDoWhile(){
        int value = 10;
        int i = 1;
        do {
            value *= 3;
            System.out.println(value);
            i++;
        }while (i < 11);
    }

    public static void trzeciDoWhile(Scanner scanner){
        scanner.nextLine();
        System.out.println("Napisz ile chcesz zatankowac litrow");
        int chcicianeLitry = 0;
        try{
            chcicianeLitry = scanner.nextInt();
        }catch (Exception e){
            System.out.println("Minimalne tankujemy litr");
        }

        int litry = 0;
        float cena = 6.5f;
        float suma = 0f;
        do{
            suma = ++litry * cena;
            System.out.println("Zatankowales: " + litry + "\nDo zaplaty: " + suma);
        }while(litry < chcicianeLitry);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        pierwszeITrzecieZadanieString(scanner);

        czwarteZadanieString();

        piateZadanieString();

        pierwszeZadanieIfy(scanner);

        drugieZadanieIfy(scanner);

        trzecieZadanieIfy(scanner);

        pierwszeZadanieFor();

        drugieZadanieFor();

        trzecieZadanieFor();

        czwarteZadanieFor();


        System.out.println("Podaj znak jakim mam narysować zadania: ");
        char znakDoZadan = scanner.next().charAt(0);
        System.out.println("KWADRAT: ");
        kwadrat(znakDoZadan, 5);
        System.out.println("TROJKAT PROSTOKATNY:");
        trojkat(znakDoZadan,5);
        System.out.println("CHOINKA:");
        int rozmiarPiramdy = 5;
        piramida(znakDoZadan,rozmiarPiramdy);
        for(int j = 0; j < rozmiarPiramdy - 1; j++){
            System.out.print(" ");
        }
        System.out.println(znakDoZadan);
        System.out.println("PIRAMIDA: ");
        piramida(znakDoZadan,rozmiarPiramdy);
        trojkatPascala();

        piewszeWhile();
        drugiWhile(scanner);
        trzeciWhile();
        czwartyWhile();
        piatyWhile(scanner);
        pierwszyDoWhile();
        drugiDoWhile();
        trzeciDoWhile(scanner);
    }
}