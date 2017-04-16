//Maryna Burge
/*Создать консольное приложение, которое запрашивает имя пользователя. После ввода имени выводит строку: Hello, <введённое имя>
Пример:

        Enter Your name:
        Eugene

        Hello, Eugene*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String namePrompt="Enter Your Name:";
        String outPrompt="Hello ";

        System.out.print(namePrompt);
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print(outPrompt + name);
    }

}
