FROM alpine

RUN apk update \
	&& apk add openjdk8-jre

COPY target/metodos-ensamble-client-azureml-0.0.1-SNAPSHOT.jar backend/backend.jar

EXPOSE 8181

CMD ["java", "-jar", "backend/backend.jar"]