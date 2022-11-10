package task221104;

public class TestModificator {
    abstract static class TaxService {
        private double taxRate = 0.2;
        protected int amount;

        public double getTax() {
            return taxRate * amount;
        }
    }
}
