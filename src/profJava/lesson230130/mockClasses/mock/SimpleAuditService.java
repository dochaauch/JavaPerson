package profJava.lesson230130.mockClasses.mock;

public class SimpleAuditService implements AuditService {
    @Override
    public void logNewTrade(Trade trade) {
        throw new RuntimeException("implement logNewTrade() in SimpleAuditService");
    }
}
