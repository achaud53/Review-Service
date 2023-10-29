# Review Service
Basic app to provide event details via REST API

## Getting Started
Clone the github Repo and import in intellij (or your choice of IDE) \
**Notes:**
- If you have the zipped project, just unzip it and import in any IDE
- The config file for main program can be found in `src/main/config/` folder
- The config files for test program can be found in `src/test/config/` folder

## Built With
* Java 17
* [Maven](https://maven.apache.org/)

### Prerequisites
- Java 17
- Maven
- Intellij (or your choice of IDE)

### Installing
- Install java 17 \
  You can use [sdman](https://sdkman.io/install) and choose 11.0.9.j9-adpt as java<br>
  `sdk install java 17.0.9-zulu`
- Install Maven \
  Visit [this link](https://maven.apache.org/install.html) in order to install maven in your local.

### Running the project
- To run the program, execute below commands in terminal at root level
    ```
    mvn clean install
    java -jar target/review-service.jar
    ```

### Deploying on Kubernetes Minikube
**NOTE** - Kindly install the below software before moving ahead
- minikube
- kubectl
- docker

Once you have installed above software, run below commands to get this application deployed
- `mvn clean install`
- `docker build -t review-service-docker:event-service . `
- `minikube image load review-service-docker:event-service`
- Check if the images is available in minikube by running below command
    - `minikube image ls --format table`
- Once image is available run below command
    - `kubectl apply -f deployment.yaml`
- If its your first time deploying the run below command
    - `kubectl expose deployment review-service --type=NodePort`
- Lastly run this command - `minikube service review-service`

## Acknowledgments
- [Baeldung](https://www.baeldung.com)
- [StackoverFlow](https://stackoverflow.com/)
