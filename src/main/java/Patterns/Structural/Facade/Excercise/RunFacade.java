package Patterns.Structural.Facade.Excercise;

public class RunFacade {

    public static void main(String[] args) {
        IWebFacade webFacade = new WebFacade();
        System.out.println("-----------  IMPLEMENTATION A  -------------");
        webFacade.doBillingSystem();
        webFacade.doCRMSystem();
        webFacade.doEmailSystem();

        System.out.println("\n-----------  IMPLEMENTATION B  -------------");
        IWebFacade webFacade_b = new WebFacade_B();
        webFacade_b.doBillingSystem();
        webFacade_b.doCRMSystem();
        webFacade_b.doEmailSystem();
    }

}
