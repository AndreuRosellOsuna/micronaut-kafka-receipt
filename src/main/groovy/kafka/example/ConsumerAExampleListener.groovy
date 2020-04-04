package kafka.example

import io.micronaut.configuration.kafka.annotation.KafkaKey
import io.micronaut.configuration.kafka.annotation.KafkaListener
import io.micronaut.configuration.kafka.annotation.OffsetReset
import io.micronaut.configuration.kafka.annotation.Topic

@KafkaListener(offsetReset = OffsetReset.LATEST, groupId = "groupA")
class ConsumerAExampleListener {

    @Topic("\${kafka.prefix}topic1")
    void receiveMessage(@KafkaKey String brand, String name) {
        println "got message $name by $brand in consumer A"
    }
}