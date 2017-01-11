package za.co.absa.integration;

import org.springframework.messaging.Message;
import org.springframework.messaging.support.ErrorMessage;
import org.springframework.messaging.support.GenericMessage;

import java.io.PrintStream;
import java.io.StringWriter;

/**
 * Created by aminggs on 2017/01/11.
 */
public class ErrorUnwrapperService {

    public Message unwrap(ErrorMessage errorMessage) {
        return new GenericMessage(errorMessage.getPayload().toString());
    }
}
