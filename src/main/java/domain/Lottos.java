package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lottos {

    private final List<Lotto> lottos;

    public Lottos(List<Lotto> lottos) {
        this.lottos = new ArrayList<>(lottos);
    }

    public List<Integer> getMatchCount(List<Integer> winnerLotto) {

        List<Integer> matchCount = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0, 0));

        for (Lotto lotto : lottos) {
            int count = 0;

            for (int num : lotto.getNumbers()) {
                if (winnerLotto.contains(num)) {
                    count++;
                }
            }

            matchCount.set(count, matchCount.get(count) + 1);
        }

        return matchCount;
    }

}
