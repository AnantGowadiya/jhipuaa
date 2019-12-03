# jhipuaa

## Steps to follow to replicate this work and deploy on kubernetes

1)Start dockerhub on your pc

2)run ``` docker-compose -f src/main/docker/jhipster-registry.yml up ``` to start the JHipster Registry. It will be available on port 8761 of your Docker host, so if it runs on your machine it should be at http://127.0.0.1:8761/.

3)Follow this link https://www.baeldung.com/jhipster-uaa-secured-micro-service to create jhipster projects

### Following jhipster projects will be created 
a) UAA server

b) Gateway

c) Quotes microservice 

4) Open command prompt and change to directory consisting of your uaa project 

5) Run command *jhipster kubernetes*

6) It will ask various questions where u need to select all the thre porjects (uaa, quotes, gateway)

7) Provide ingress ip of your cluster and give a namepsace (final-cluster ip is 34.67.38.135)

8) After that push your entire code to github. (This repo contains the entire code with namepsace *marvel* )

9) Open vm instance.

10) Clone this project into your vm instance

### 10) run following commands 

i) docker login

ii) sudo chmod +x sys.logs

iii) ./mvnw -ntp -Pprod verify jib:build -Djib.to.image=anantgowadiya/gateway  (inside gateway dir)

iv) ./mvnw -ntp -Pprod verify jib:build -Djib.to.image=anantgowadiya/quotes (inside quotes dir)

v) ./mvnw -ntp -Pprod verify jib:build -Djib.to.image=anantgowadiya/uaa (inside uaa dir)

vi) kubectl-apply.sh

vii) kubectl get svc  gatewway -n marvel

### 11) to get the logs of a container run this command kubectl logs pod-name container-name -n namespace

In my case to get the logs of gatway I run the following command *kubectl logs gateway-5db79f558d-fpn8t gateway-app -n marvel*

To save output to a file run this command *kubectl logs gateway-5db79f558d-fpn8t gateway-app -n marvel > filename.txt*


