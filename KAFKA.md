### How to run Kafka server on Windows
https://www.geeksforgeeks.org/how-to-install-and-run-apache-kafka-on-windows/
Enter to Kafka folder and execute in two separate console
C:\Users\kamil\kafka
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
.\bin\windows\kafka-server-start.bat .\config\server.properties

Now kafka is running and ready to stream data.