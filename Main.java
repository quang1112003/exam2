package exam2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Management std = new Management();
        Scanner sc = new Scanner(System.in);
        int st;
        while (true) {
            System.out.println("\nMenu");
            System.out.println("1.Add a new student");
            System.out.println("2.Save students");
            System.out.println("3.Student list");
            System.out.println("0.Exit");
            System.out.println("--------------------");
            do {
                System.out.print("Choose option 1-3: ");
                st = sc.nextInt();
            } while (st < 0 || st > 3); {
                switch (st) {
                    case 1: {
                        try {
                            std.addStudent();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case 2: {
                        try {
                            std.saveStudents();
                        } catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case 3: {
                        try {
                            std.showStudent();
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    }
                    case 0: {
                        System.out.println("Stop");
                        return;
                    }
                }
            }
        }

    }
}