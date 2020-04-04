package kafka.example


import io.micronaut.scheduling.annotation.Scheduled

import javax.inject.Singleton

@Singleton
class MessageSenderScheduler {

    ProducerExampleProducer producer

    MessageSenderScheduler(ProducerExampleProducer producer) {
        this.producer = producer
    }

    @Scheduled(fixedRate = "1s")
    void everySecond() {
        Date now = new Date()
        producer.sendMessage("key", "Send message at ${now.toString()}")
    }
}
