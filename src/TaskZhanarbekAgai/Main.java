package TaskZhanarbekAgai;

import java.io.IOException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[scanner.nextInt()];

        for (int i = 0; i < employees.length ; i++) {
            employees[i] = new Employee();
            employees[i].setFirstName(writeName(Names.FIRST_NAME));
            employees[i].setSecondName(writeName(Names.SECOND_NAME));
            employees[i].setWasBorn(writeYear());
            employees[i].setStartWork(writeWorkStart(employees[i]));
        }
        System.out.println("------------------------EMPLOYEE INFORMATION------------------------");
        for (Employee i:employees) {
            System.out.println("name = " + i.getFirstName());
            System.out.println("secondName = " + i.getSecondName());
            System.out.println("was born = " + i.getWasBorn());
            System.out.println("Start work = ");
            i.getStartWork();
            System.out.println("----------------------------------------------------------------");
        }
    }
public static String writeName(Names names){
        Scanner scanner = new Scanner(System.in);
    while (true){
        System.out.printf("\nВведите %s работника: ", names.getWord());
        String name = scanner.nextLine();
        try{
            if (checkName(name)){
                return name;
            }
            throw new InputMismatchException();
        }catch(InputMismatchException e){
            System.out.print("Не правильно");
        }
    }
}
public static boolean checkName(String name){
        int counter = 0;

    for (int i = 0; i < name.length(); i++) {
        if (Character.isLetter(name.charAt(i)))
            counter++;
    }

    return counter == name.length();
 }
public static int writeYear() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
        try {
            System.out.println("Введите год рождения работника:");
            int year = scanner.nextInt();
            int localYear = LocalDate.now().getYear();
            if (year > 1900 && year < localYear) {
                return year;
            }
        } catch (InputMismatchException e) {
            scanner.next();
        }
    }
}

public static int GetAnInteger() {
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Введите год рождения работника:");
                int year = sc.nextInt();
                int localYear = LocalDate.now().getYear();
                 if (year>1900 && year < localYear){
                     return year;
                 }
            }
            catch (InputMismatchException e)
            {
                sc.next();
            }
        }
    }
public static int writeWorkStart(Employee employee){
    Scanner scanner = new Scanner(System.in);
//        try{
//            int localYear = LocalDate.now().getYear();
//            if (employee.getWasBorn()+18 <= localYear){
//                return employee.getWasBorn()+18 ;
//            }
//            throw new RuntimeException();
//        } catch (RuntimeException e){
//            return 0;
//        }

        try {
            System.out.println("Введите год начало работы:");
            int year = scanner.nextInt();
            int localYear = LocalDate.now().getYear();
            if (year>=employee.getWasBorn()+18 && year <=localYear){
                return year;
            }
        }
        catch (InputMismatchException e)
        {
            scanner.next();
        }
    return 0;
}



}
