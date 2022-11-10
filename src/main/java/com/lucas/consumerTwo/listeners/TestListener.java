package com.lucas.consumerTwo.listeners;


import com.lucas.consumerTwo.client.ClientGcOne;
import com.lucas.consumerTwo.client.ClientGcTwo;
import com.lucas.consumerTwo.dtos.UserRequestDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public final class TestListener {

    private final ClientGcTwo clientGcTwo;

    private final ClientGcOne clientGcOne;

    @RabbitListener(
            queues = {"${rabbitmq.queue.test}"})
    public void consumerApprovedQueue(@Payload final UserRequestDTO userRequestDTO) {

//        System.out.println("************* enviando para o gc two ****************");
//        System.out.println(userRequestDTO);
//        clientGcTwo.sendUser(userRequestDTO);

        System.out.println("************* enviando para o gc one ****************");
        System.out.println(userRequestDTO);
        clientGcOne.sendUser(userRequestDTO);
    }

}
