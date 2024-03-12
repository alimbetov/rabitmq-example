package rabitmq.test.producer.demo.services;

public interface RabbitMQProducerService {

    void sendMessage(String message, String routingKey);
}