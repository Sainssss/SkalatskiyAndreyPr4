import java.util.Scanner;

class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть першу дату (день.місяць.рік): ");
        String[] firstDate = scanner.nextLine().split("\\.");
        int day1 = Integer.parseInt(firstDate[0]);
        int month1 = Integer.parseInt(firstDate[1]);
        int year1 = Integer.parseInt(firstDate[2]);

        System.out.print("Введіть другу дату (день.місяць.рік): ");
        String[] secondDate = scanner.nextLine().split("\\.");
        int day2 = Integer.parseInt(secondDate[0]);
        int month2 = Integer.parseInt(secondDate[1]);
        int year2 = Integer.parseInt(secondDate[2]);

        if (year1 < year2 || (year1 == year2 && month1 < month2) || (year1 == year2 && month1 == month2 && day1 < day2)) {
            System.out.println("Перша дата раніша.");
        } else if (year1 > year2 || month1 > month2 || day1 > day2) {
            System.out.println("Друга дата раніша.");
        } else {
            System.out.println("Дати однакові.");
        }
    }
}
