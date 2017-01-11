package za.co.absa.integration;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.GenericMessage;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by barry on 2017/01/11.
 */

public class Publisher {

    public void startPublishService(MessageChannel channel, MessageChannel errorChannel){
        Random random = new Random();

        HashMap<String, Object> headers = new HashMap<String, Object>();
        headers.put(MessageHeaders.ERROR_CHANNEL,errorChannel);
        GenericMessage msg;
        for( int i=1; i <= 100; i++){
            String textMessage = "This is message number " + i;
            if (random.nextBoolean()){
                msg = new GenericMessage(textMessage);
            }else{
                msg = new GenericMessage(textMessage, headers);
            }

            boolean sent = channel.send(msg);
            System.out.printf("managed to publish the message [%s] [%b]\n", textMessage, sent);
        }
    }

}
