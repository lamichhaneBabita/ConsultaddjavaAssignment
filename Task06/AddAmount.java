package Task06;

import com.sun.xml.internal.ws.addressing.WsaTubeHelperImpl;

public class AddAmount {
    int amount = 50;
    int count = 0;

    public AddAmount() {

    }

    public AddAmount(int amt) {

        this.amount += amt;
        count += 1;

    }

    public void addAmount(int amount) {
        this.amount += amount;
        count += 1;
    }

    public int transaction() {
        return count;


    }

    public int finalAmount() {
        int old = amount;
        int newAmt = 0;
        if (count == 1)
            return amount;
        else {
            for (int i = 0; i < count; i++) {
                newAmt = old + newAmt;
            }
        }
        return newAmt;
    }

    public static void main(String[] args) {

        AddAmount addAmount = new AddAmount();
        AddAmount addAmount1 = new AddAmount(100);

        addAmount.transaction();
        addAmount1.transaction();
        addAmount1.addAmount(200);
        addAmount1.addAmount(200);
        addAmount1.addAmount(500);

        addAmount1.finalAmount();
        System.out.println("Total number of Transaction/Transactions: " +addAmount1.count);
        System.out.println("Total amount in Saving box is: " + addAmount1.amount);
        System.out.println("Initial Transaction: " + addAmount.amount);

    }
}
