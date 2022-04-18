package Patterns.Behavior.Command.Exercise;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TratamientoPedidoPeligroso implements TratamientoPedido{

    private PedidoPeligroso pedidoPeligroso;

    @Override
    public String tratar() {
        return String.format("Intrucciones: %s, peso: %d", pedidoPeligroso.getInstrucciones(), pedidoPeligroso.getPeso());
    }
}
