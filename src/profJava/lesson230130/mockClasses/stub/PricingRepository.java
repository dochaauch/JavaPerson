package profJava.lesson230130.mockClasses.stub;

public class PricingRepository {

    // [... other methods ...]

    public Price getPriceForTrade(Trade trade) {
        return trade.price;
    }
}