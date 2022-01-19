cd ../consumer
docker rmi -f consumer
docker build --tag=consumer:latest .
cd ../producer
docker rmi -f producer
docker build --tag=producer:latest .
cd ../docker
