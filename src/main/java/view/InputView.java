package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    public static int readPrice(Scanner scanner) {
        System.out.println("구입금액을 입력해 주세요.");
        int price = Integer.parseInt(scanner.nextLine().trim());
        return price;
    }

    public static List<Integer> readWinnerNumber(Scanner scanner) {
        System.out.println("지난 주 당첨번호를 입력해 주세요.");
        return Arrays.stream(scanner.nextLine().split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .toList();

    }
}
