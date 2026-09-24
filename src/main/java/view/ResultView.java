package view;

import domain.Lotto;
import domain.LottoMachine;
import java.util.List;

public class ResultView {
    private static final List<Integer> prizes = List.of(
            5000,
            50000,
            1500000,
            2000000000
    );
    public static void printLottoResult(List<Lotto> lottos){
        System.out.println(lottos.size()+"개를 구매했습니다.");
        for (Lotto lotto : lottos) {
            System.out.println(lotto.getNumbers());
        }
    }

    public static void printStats(List<Integer> matchCount, int lottoCount){
        System.out.println("당첨 통계");
        System.out.println("----------");

        for (int match = 3; match <= 6; match++) {
            System.out.printf(
                    "%d개 일치 (%d원)- %d개%n",
                    match,
                    prizes.get(match - 3),
                    matchCount.get(match)
            );
        }

        getRevenue(lottoCount, matchCount);
    }

    public static void getRevenue(int lottoCount,List<Integer> matchCount){
        long totalPrize = 0;

        for (int match = 3; match <= 6; match++) {
            totalPrize += (long) prizes.get(match - 3) * matchCount.get(match);
        }

        long totalCost = (long) lottoCount * 1000;

        double profitRate = (double) totalPrize / totalCost *100;

        System.out.printf("총 수익률은 %.2f입니다. (기준이 1이기 때문에 결과적으로 손해라는 의미임)%n", profitRate);
    }

}
