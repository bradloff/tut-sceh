import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.PollableChannel;
import za.co.absa.integration.Publisher;

/**
 * Created by barry on 2017/01/11.
 */
public class Main {

    public static void main(String[] args){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("integration/channelconfig.xml");

        // Get the channel.
        PollableChannel channel = ctx.getBean("channel", PollableChannel.class);

        new Publisher().startPublishService(channel);


    }
}
