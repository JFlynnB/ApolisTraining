package com.example.RESTController.config;

import com.example.RESTController.model.Prompt;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.DeadLetterPublishingRecoverer;
import org.springframework.kafka.listener.DefaultErrorHandler;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.util.backoff.FixedBackOff;

import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableKafka
public class KafkaConfiguration {



    @Bean
    public ConsumerFactory<String, Prompt> consumerFactory() {

        JsonDeserializer<Prompt> deserializer = new JsonDeserializer<>(Prompt.class);
        deserializer.setRemoveTypeHeaders(false);
        deserializer.addTrustedPackages("*");

        Map<String, Object> configs = new HashMap<>();
        configs.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        configs.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        configs.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        configs.put(ConsumerConfig.GROUP_ID_CONFIG, "group_one");
        configs.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true"); // Auto-commit offset as a default
        configs.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
        return new DefaultKafkaConsumerFactory<String, Prompt>(configs, new StringDeserializer(), new JsonDeserializer<>(Prompt.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Prompt> kafkaListenerContainerFactory(){
        ConcurrentKafkaListenerContainerFactory<String, Prompt> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }
}