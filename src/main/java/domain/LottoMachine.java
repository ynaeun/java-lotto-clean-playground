package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LottoMachine {

    public List<Lotto> purchase(int lottoCount) {
       List<Lotto> lottoList = new ArrayList<>();
        for (int i = 0; i < lottoCount ; i++) {

            lottoList.add(new Lotto(generateLotto()));
        }
        return lottoList;
    }

    public List<Integer> generateLotto(){
        List<Integer> numbers=createNumbers();
        Collections.shuffle(numbers);
        List<Integer> lotto= numbers.subList(0,6);
        Collections.sort(lotto);
        return lotto;
    }

    private List<Integer> createNumbers() {
        List<Integer> numbers=new ArrayList<>();
        for (int count = 1; count <= 45; count++) {
            numbers.add(count);
        }
        return numbers;
    }


}
