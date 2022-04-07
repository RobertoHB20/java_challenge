package Patterns.Structural.Facade.Excercise;

public class WebFacade implements IWebFacade{

    private final ISystem billingSystem;
    private final ISystem crmSystem;
    private final ISystem emailSystem;

    public WebFacade(){
        this.billingSystem = new BillingSystem("Billing system implementation A");
        this.crmSystem = new CRMSystem("CRM System implementation A");
        this.emailSystem = new EmailSystem("Email system, gmail implementation");
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
