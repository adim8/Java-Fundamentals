import java.util.Scanner;

public class Train {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfVagoon = Integer.parseInt(scanner.nextLine());

        int[] peopleInVagoon = new int [countOfVagoon];
        int sum = 0;

        for (int i = 0; i < countOfVagoon; i++) {

            peopleInVagoon [i] = Integer.parseInt(scanner.nextLine());

            System.out.print(peopleInVagoon[i] + " ");

            sum += peopleInVagoon [i];

        }
        System.out.printf("%n%d", sum);
    }
}