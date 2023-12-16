# :sparkles: Kafka Based Cab Driver And User Application :sparkles:

##### The Cab Driver application publishes live locations periodically to the Kafka and the User Application listens to the live locations from the Kafka.

- [Apache Kafka Homepage](https://kafka.apache.org/)
- [Apache Kafka Downloads](https://kafka.apache.org/downloads)

- [Apache Kafka Quickstart](https://kafka.apache.org/quickstart)
	- After downloading Apache Kafka. we can **install**, **start** ZooKeeper and Kafka Servers, **create topics** and do much more using the commands available in the Quickstart page.

---

#### Details of the applications

- I have created **2 Spring Boot applications**.
	- One for the **Cab Driver application**.
	- Another one for the **User Application**.
- I have used **Gradle** build tool to manage dependencies.
- **Cab Driver application** is the **Producer** to the Kafka topic.
- **User application** is the **Consumer** of the Kafka topic.
- Cab Driver application is connected to the Kafka topic and publishes the messages to that topic.
- User application is configured to listen to that topic and consume the messages.
- Postman Collection available in the repository to trigger the Cab Driver API.
- **:information_desk_person:Note:** For configuration related to Kafka topics etc., please refer the code.

---

#### Few commands (For Windows) :computer:

- **Start Zookeeper Server** - `.\bin\windows\zookeeper-server-start.bat config\zookeeper.properties`
- **Start Kafka Server** - `.\bin\windows\kafka-server-start.bat config\server.properties`
- **Create a Kafka topic** - `.\bin\windows\kafka-topics.bat --create --topic quickstart-events --bootstrap-server localhost:9092`
- **Describe a Kafka topic** - `.\bin\windows\kafka-topics.bat --describe --topic quickstart-events --bootstrap-server localhost:9092`
- **Write events to Kafka topic** - `.\bin\windows\kafka-console-producer.bat --topic quickstart-events --bootstrap-server localhost:9092`
- **Read events from Kafka topic** - `.\bin\windows\kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092`

---

If you are here, thank you :smiley::pray:

---
