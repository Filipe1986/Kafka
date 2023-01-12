# Kafka
kafka repository to keep notes and some code.

Kafka documentation: https://kafka.apache.org/documentation/

### What is Kafka?
    Kafka is an distributed event fault-tolerant streaming platform

#### What can I use event streaming for?
    Event streaming is applied to a wide variety of use cases as:

        - To process payments and financial transactions in real-time, such as in stock exchanges, banks, and insurances.
        - To track and monitor cars, trucks, fleets, and shipments in real-time, such as in logistics and the automotive industry.
        - To continuously capture and analyze sensor data from IoT devices or other equipment, such as in factories and wind parks.
        - To collect and immediately react to customer interactions and orders, such as in retail, the hotel and travel industry, and mobile applications.
        - To monitor patients in hospital care and predict changes in condition to ensure timely treatment in emergencies.
        - To connect, store, and make available data produced by different divisions of a company.
        - To serve as the foundation for data platforms, event-driven architectures, and microservices.


#### Kafka connect
    //TODO

#### Kafka Stream API
     Java api that handles Grouping, Aggregating, filtering, enriching in a scalable and fault-tolerant way


#### Kafka combines three key capabilities:
    1 - publish (write) and subscribe to (read) streams
    2 - store streams of events durably and reliably for as long as you want
    3 - To process streams

#### How does Kafka work?

    SERVERS: Kafka runs as a cluster of one or more servers that can span multiple datacenters or cloud regions. Some of these servers form the storage layer, called the BROKERS. Other servers run Kafka Connect to continuously import and export data as event streams to integrate Kafka with your existing systems

    CLIENTS: They allow you to write applications that read, write, and process streams of events.

#### Main Concepts and Terminology
    Event, Producer, consumers, topic, partitions, broker, 

    - An event has a key, value, timestamp, and optional metadata headers.
    - Producers are those client applications that publish (write) events to Kafka
    - Consumers are those that subscribe to (read and process) these events
    - Topic is a ordered collection of events storaged in a durable way
    - Topic's partitions are spread buckets located on different Kafka brokers



Every kafka broker is also called a bootstrap server





