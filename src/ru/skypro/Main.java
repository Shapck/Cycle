package ru.skypro;

public class Main {

    public static void main(String[] args) {
//   №1
        int j = 0;
        while(j < 10){
            j++;
            System.out.println(j);
        }
        System.out.println(" ");
        for(int i = 10; 1 <= i;i-- ){
            System.out.println(i);
        }
//    №2
        for (int day = 5 ; day <= 31; day += 7){
            System.out.println("Сегодня пятница, "+day+"-е число. Необходимо подготовить отчет");}
//    №3
        int firstYear,lastYear;
        for(lastYear = 0; lastYear <= 2022;lastYear += 79){
        }
        firstYear = lastYear - 79*2;
        for(firstYear = firstYear; firstYear <= lastYear; firstYear+= 79 ){
            System.out.println(firstYear);
        }
    }
}
