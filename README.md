# jaafar-calculator-service

-Plant uml
https://plantuml.com/mindmap-diagram

-Run Spring boot application
mvn clean install

mvn spring-boot:run

- Endpoint
http://localhost:8080/sum?num1=1&num2=3

#docker cmds
docker image build -t mjaafar91/calculator-service .
docker push mjaafar91/calculator-service

#aws
EC2 -> instances -> connect
cmd --> ssh -i "test.pem" ec2-user@ec2-54-244-215-222.us-west-2.compute.amazonaws.com

- Add security groups with your instance to define the allowed ports to run the docker container later 

update ec2 instances
sudo yum update -u

install docker
sudo yum install docker -y

start docker
sudo service docker start

run docker image
sudo docker run -d -p 80:8080 mjaafar91/calculator-service

access
<public IP from EC2 instance>/<yourendpoint>