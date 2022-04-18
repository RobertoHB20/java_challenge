package Patterns.Behavior.Command.Exercise;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class OficinaTest {

    PedidoPeligroso pedidoPeligroso;
    Pedido pedido_1;
    Pedido pedido_2;
    Oficina oficina;

    @BeforeAll
    public void init(){
        pedidoPeligroso = new PedidoPeligroso("No agitar", 100);
        pedido_1 = new Pedido(50, false);
        pedido_2 = new Pedido(120, true);
        oficina = new Oficina();
    }

    @Test
    @DisplayName("Test dangerous request is proceced correctly")
    public void TestDangerousRequest(){
        oficina.setTratamientoPedido( new TratamientoPedidoPeligroso(pedidoPeligroso) );
        assertEquals("Intrucciones: No agitar, peso: 100", oficina.run());
    }

    @Test
    @DisplayName("Test multiple request are proceced correctly")
    public void TestMultipleRequest(){
        List<Pedido> pedidos = new ArrayList<>(Arrays.asList( pedido_1, pedido_2 ) );
        oficina.setTratamientoPedido( new TratamientoPedidoMultiple( pedidos ) );

        assertEquals( "Pedido nº 1 peso: 50  urgente: false \nPedido nº 2 peso: 120  urgente: true \n", oficina.run() );

    }

}