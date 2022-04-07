package Patterns.Structural.Facade.Excercise;

public class WebFacade_B implements IWebFacade{
    private final ISystem billingSystem;
    private final ISystem crmSystem;
    private final ISystem emailSystem;

    public WebFacade_B(){
        this.billingSystem = new BillingSystem("Billing system implementation B");
        this.crmSystem = new CRMSystem("CRM System implementation B");
        this.emailSystem = new EmailSystem("Email system, hotmail implementation");
    }


    @Override
    public void doBillingSystem() {
        this.billingSystem.doSomething();
    }

    @Override
    public void doCRMSystem() {
        this.crmSystem.doSomething();
    }

    @Override
    public void doEmailSystem() {
        this.emailSystem.doSomething();
    }
}
