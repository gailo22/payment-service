# Payment Service application

### Build jar
```
$ ./gradlew build

```

### Run mongodb service
```
$ openssl rand -base64 741 > key.txt

$ kubectl create secret generic shared-bootstrap-data --from-file=internal-auth-mongodb-keyfile=key.txt

$ kubectl exec -it mongod-0 -c mongod-container bash

$ mongo

```

### Build docker image
```
$ eval $(minikube docker-env)

$ docker build -t payment-service .

$ docker run -v ${PWD}/tmp:/tmp -p 9090:8080 payment-service

```

### Deploy to Kubernetes
```
$ kubectl run payment-service --image=payment-service --replicas=1

$ kubectl apply -f workloads.yml

$ kubectl apply -f services.yml

or

$ kubectl expose deployment payment --type=NodePort
```

### Access service via minikube
```
$ minikube service payment --url
http://192.168.99.100:30230

$ curl http://192.168.99.100:30230/pay/123
```