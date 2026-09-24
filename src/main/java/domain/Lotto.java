package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

    private final List<Integer> lotto;
    public Lotto(List<Integer> numbers) {
        this.lotto = numbers;
    }

    public List<Integer> getNumbers(){
        return lotto;
    }


}
