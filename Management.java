package exam2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    private ArrayList<Students> studentsList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public String createID() {
        System.out.print("Insert student ID: ");
        String ID = sc.next();
        return ID;
    }
    public String createFirstName() {
        System.out.print("Insert student first name: ");
        String fn = sc.next();
        return fn;
    }
    public String createLastName() {
        System.out.print("Insert student last name: ");
        String ln = sc.next();
        return ln;
    }
    public int createAge() {
        System.out.print("Insert student age: ");
        int age = sc.nextInt();
        return age;
    }

    public void addStudent(){
        String ID = createID();
        String fn = createFirstName();
        String ln = createLastName();
        int age = createAge();
        Students student = new Students(ID,fn,ln,age);
        studentsList.add(student);
    }

    public void showStudent() {
            System.out.println("   EnrolID     Full name    Age    ");
            System.out.print("\n-----------   ------------  --------\n");
            for (Students st : studentsList) {
                System.out.format("%10s%10s%10d\n",st.getEnrollID(),st.getFirstName() + " " + st.getLastName(),st.getAge());
            }
    }

    public void saveStudents() throws IOException {
        File file = new File("students.dat");
        FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream ojt = new ObjectOutputStream(fout);
        ojt.writeObject(studentsList);
        ojt.close();
        fout.close();
    }
}

