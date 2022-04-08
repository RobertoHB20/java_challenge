package Patterns.Behavior.ChainOfResponsability.Excercise;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ApproverTest {

    Approver laura;
    Approver samuel;
    Approver alejandro;


    @BeforeAll
    void init(){
        laura = new Director("Laura");
        samuel = new VicePresident("Samuel");
        alejandro = new President("Alejandro");

        laura.setSuccessor(samuel);
        samuel.setSuccessor(alejandro);
    }

    @Test
    @DisplayName("Director Laura should approve request")
    public void TestDirectorApprovesPurchase(){
        Purchase purchase = new Purchase(2034,320,"Supplies");
        assertEquals("Laura approved request# 2034", laura.processRequest(purchase));
    }

    @Test
    @DisplayName("Vice president Samuel should approve request")
    public void TestVicePresidentApprovesPurchase(){
        Purchase purchase = new Purchase(2035,24789,"App project");
        assertEquals("Samuel approved request# 2035", laura.processRequest(purchase));
    }

    @Test
    @DisplayName("President Alejandro should approve request")
    public void TestPresidentApprovesPurchase(){
        Purchase purchase = new Purchase(2036,86120,"Infrastructure project");
        assertEquals("Alejandro approved request# 2036", laura.processRequest(purchase));
    }

    @Test
    @DisplayName("Test request needs attention")
    public void TestPurchaseNeedsAttention(){
        Purchase purchase = new Purchase(3000,559892,"Infrastructure project");
        assertEquals("Request# 3000 requires an executive meeting!", laura.processRequest(purchase));
    }

}