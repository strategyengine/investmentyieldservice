mvn clean compile install
docker build -t investmentyieldservice .
docker tag investmentyieldservice gcr.io/flarestrategyengine/investmentyieldservice
docker push gcr.io/flarestrategyengine/investmentyieldservice