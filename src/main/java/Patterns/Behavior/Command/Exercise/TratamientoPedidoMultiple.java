package Patterns.Behavior.Command.Exercise;


import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class TratamientoPedidoMultiple implements TratamientoPedido{

    private List<Pedido> pedidos;

    @Override
    public String tratar() {
        if(pedidos == null){
            pedidos = new ArrayList<>();
        }

        String result = "";

        for(int i = 0 ; i < pedidos.size() ; i++){

            result += String.format( "Pedido nº %d peso: %d  urgente: %b \n", i+1, pedidos.get(i).getPeso(), pedidos.get(i).isUrgente() );
        }

        return result;
    }
}
