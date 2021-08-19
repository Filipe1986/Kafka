
import model.Account;
import model.Transaction;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.math.BigDecimal;
import java.util.Properties;

public class DummyBankTransactionProducer {

    public static void main(String[] args) {


        Properties properties = new Properties();
        properties.setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, Constants.BOOTSTRAP_SERVERS);
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());


        KafkaProducer<String, String> producer = new KafkaProducer<String, String>(properties);

        ProducerRecord<String, String> record =
                new ProducerRecord<String, String>(Constants.TOPIC_NAME,
                        new Transaction().builder()
                                .id("1")
                                .payer(new Account().builder()
                                        .balance(new BigDecimal(100))
                                        .email("abc@google.com")
                                        .password("123456")
                                        .build())
                                .payee(new Account().builder()
                                        .balance(new BigDecimal(100))
                                        .email("xyz@google.com")
                                        .build())
                                .amount(new BigDecimal(10))
                                .build().toString());

        // send data - asynchronous
        producer.send(record);
        producer.flush();
        producer.close();

    }
}