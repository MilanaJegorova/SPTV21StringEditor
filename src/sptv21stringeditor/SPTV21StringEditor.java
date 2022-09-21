package sptv21stringeditor;
         
import java.util.Scanner;

         
public class SPTV21StringEditor {


    public static void main(String[] args) {
        System.out.println("----- Работа со строкой -----");
        System.out.print("Введите строку (используйте латиницу): ");
        Scanner scanner = new Scanner (System.in);
        String str = scanner.nextLine();
        do{
            System.out.println("Функции программы: ");
            System.out.println("0. Выйти из програмы");
            System.out.println("1. Посчитать количество символов в строке");
            System.out.println("2. посчитать количество слов в строке");
            System.out.println("4. Найти подстроку в строке");
            System.out.println("4. Заменить подстроку в строке на указанную");
            System.out.print("Выберите номер функции: ");
            int numFunc = scanner.nextInt();
            scanner.nextLine();
            if (numFunc == 0) {
                break;
            }else if(numFunc == 1) {
                System.out.println("Вы выбрали пункт: "+numFunc);
                int countCharInStr=0;
                char[] chars = str.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if(chars[i] != ' '){
                        countCharInStr++;
                    }
                }
                System.out.println("В строке: " +countCharInStr + " символов.");
            }else if(numFunc ==2) {
                System.out.println("Вы выбрали пункт: " +numFunc);
            }else if(numFunc ==3) {
                System.out.println("Вы выбрали пункт: " +numFunc);
            }else if(numFunc ==4) {
                System.out.println("Вы выбрали пункт: " +numFunc);
            }
            System.out.println("+++++++++++++++++++++++++++++++++++++++");
        }while(true);
    }
}