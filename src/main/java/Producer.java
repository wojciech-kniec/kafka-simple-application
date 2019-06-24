import org.apache.kafka.clients.producer.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Producer {
    public static void main(String[] args) {
        final KafkaProducer<String, String> mProducer;
        final Logger logger = LoggerFactory.getLogger(Producer.class);
    }
}
