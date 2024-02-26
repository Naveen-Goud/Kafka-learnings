package com.consumers.cosumers.config;

import com.consumers.cosumers.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic[] topics() {
        NewTopic[] newTopics = new NewTopic[AppConstant.Topic.length];
        for (int i = 0; i < AppConstant.Topic.length; i++) {
            newTopics[i] = createNewTopic(AppConstant.Topic[i]);
        }
        return newTopics;
    }

    private NewTopic createNewTopic(String topicName) {
        return TopicBuilder
                .name(topicName)
                .partitions(10)
                .replicas(2)
                .build();
    }
}
