package kafka.example

import io.micronaut.configuration.kafka.annotation.KafkaClient
import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaClient
interface ProducerExampleProducer {

    @Topic("\${kafka.prefix}topic1")
    void sendMessage(@KafkaKey String brand, String name)
}