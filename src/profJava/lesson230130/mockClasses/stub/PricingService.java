package profJava.lesson230130.mockClasses.stub;

import java.util.Collection;

public interface PricingService {

    // [... other methods ...]

    Price getHighestPricedTrade(Collection<Trade> trades);
}