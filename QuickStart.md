# Kafka QuickStart

### Create a topic at localhost:9092

kafka-topics.sh --create --topic quickstart-topic \
--bootstrap-server localhost:9092

### Describe the topic 
kafka-topics.sh --describe --topic quickstart-topic \
--bootstrap-server localhost:9092

Expect result:
    Topic: quickstart-topic 
    TopicId: 6nHBGxYkRaKLgXfHkCJNkg 
    PartitionCount: 1       
    ReplicationFactor: 1  
    Configs: segment.bytes=1073741824

    Topic: quickstart-topic 
    Partition: 0    
    Leader: 1001    
    Replicas: 1001  
    Isr: 1001

### Create Kafka Consumer client
kafka-console-consumer.sh --topic quickstart-topic \
--bootstrap-server localhost:9092 \
--from-beginning

### Create Kafka producer client
kafka-console-producer.sh --topic quickstart-topic \
--bootstrap-server localhost:9092