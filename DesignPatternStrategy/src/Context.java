public class Context {

    private IStrategy strategy = new StrategyImpl1();
    public void appliquerStrategy(){
        System.out.println("Intitialisation");
        strategy.appliquerStrategy();
        System.out.println("999999999");
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}
