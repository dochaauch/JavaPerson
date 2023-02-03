package profJava.lesson230130.testClasses.mockTest;

//@ExtendWith(MockitoExtension.class)
//public class SimpleTradingServiceTest {
//
//    @Mock
//    TradeRepository tradeRepository;
//
//    @Mock
//    AuditService auditService;
//
//    @Mock
//    Trade trade;
//
//    @Test
//    public void testAuditLogEntryMadeForNewTrade() {
//        //Trade trade = new Trade("Test", "Test"); // вместо этого
//        Mockito.when(tradeRepository.createTrade(trade))
//                .thenReturn(anyLong());
//        TradingService tradingService
//                = new SimpleTradingService(tradeRepository,
//                auditService);
//        tradingService.createTrade(trade);
//        Mockito.verify(auditService).logNewTrade(trade);
//    }
//}
