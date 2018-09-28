/*
 *Java 1 Home Work 5 ООП
 * @author Gaponov Lavrenty
 * @version Date 26.09.2018
 */

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Home_Work_5 {
    public static void main(String[] args) {
        //создаю обект.
        Workers workers1 = new Workers("Sergeev Sergy", "Stagor", "stagop@ilbox.com", 862358136, 5000, 20);
        System.out.println(workers1.toString());
        workers1.setPaycheck(0);
        System.out.println(workers1.getPaycheck());
        workers1.setPaycheck(10000);
        System.out.println(workers1.getPaycheck());
        System.out.println(workers1.toString());
        System.out.println();
        Workers[] workersArray = new Workers[5];
        workersArray[0] = new Workers("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", 892312312, 30000, 45);
        workersArray[1] = new Workers("Lavrov Lavrenty", "Programist", "Lav@mailbox.com", 892312313, 150000, 25);
        workersArray[2] = new Workers("Zuev Ivan", "Zam. Director", "zuivan@mailbox.com", 892312314, 100000, 41);
        workersArray[3] = new Workers("Ivanov Pavel", "Manager", "ivpavel@mailbox.com", 892312315, 60000, 30);
        workersArray[4] = new Workers("Petrov Nikolay", "Director", "kola@mailbox.com", 892312316, 300000, 40);

       /* try (FileWriter file = new FileWriter("text.txt")) {
            for (int i = 0; i < workersArray.length; i++) {
                file.write(workersArray[i].toString());
            }
            //file.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        // reading from file
        try (FileReader file = new FileReader("text.txt")) {
            int b;
            while ((b = file.read()) != -1)
                System.out.print((char) b);
            //file.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/
         for (int i = 0; i < workersArray.length; i++) {
    }       if (workersArray[i].getAge() > 40) System.out.println(workersArray[i].toString());}//}
}

//Создать класс "Сотрудник"
class Workers{
    //с полями: ФИО, должность, email, телефон, зарплата, возраст;
    private String name_surname;
    private String position;
    private String email;
    private int phone;
    private int paycheck;
    private int age;
    //* Конструктор класса должен заполнять эти поля при создании объекта
    Workers(String name_surname, String position, String email, int phone, int paycheck, int age){
        this.name_surname = name_surname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.paycheck = paycheck;
        this.age = age;
    }


// Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    public void name_surname(String name_surname) {
        if (name_surname != null)
            this.name_surname = name_surname;
    }

    public void setPosition(String position) {
        if (position != null)
            this.position = position;
    }

    public void setEmail(String email) {
        if (email != null)
            this.email = email;
    }

    public void setPhone(int phone) {
        if (phone != 0)
            this.phone = phone;
    }

    public void setPaycheck(int paycheck) {
        if (paycheck != 0)
            this.paycheck = paycheck;
    }

    public void setAge(int age) {
        if (age != 0)
            this.age = age;
    }

    public String getName_surname() {
        return name_surname;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    public int getPaycheck() {
        return paycheck;
    }

    public int getAge() {
        return age;
    }
    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    @Override
    public String toString() {
        return "Workers{" +
                "name_surname='" + name_surname + '\"' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", paycheck=" + paycheck +
                ", age=" + age +
                '}';
    }
}

