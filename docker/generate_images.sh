cd ../consumer
docker rmi -f consumer
gradle clean build
docker build --tag=consumer:latest .
cd ../producer
docker rmi -f producer
gradle clean build
docker build --tag=producer:latest .
cd ../docker

# generate stubs
#cd ../producer
#gradle publishStubsPublicationToMavenLocal
