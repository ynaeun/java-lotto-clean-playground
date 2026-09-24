import domain.Lotto;
import domain.LottoMachine;
import domain.Lottos;
import domain.PurchaseAmount;
import java.util.List;
import java.util.Scanner;
import view.InputView;
import view.ResultView;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PurchaseAmount purchaseAmount = new PurchaseAmount(InputView.readPrice(sc));
        LottoMachine lottoMachine = new LottoMachine();

        List<Lotto> lottoList= lottoMachine.purchase(purchaseAmount.getLottosCount());
        Lottos lottos=new Lottos(lottoList);

        ResultView.printLottoResult(lottoList);

        List<Integer> winnerNumbers = InputView.readWinnerNumber(sc);
        List<Integer> matchCount= lottos.getMatchCount(winnerNumbers);

        ResultView.printStats(matchCount, purchaseAmount.getLottosCount());
    }
}
