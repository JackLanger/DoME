#
# This Dockerfile creates a docker image of the main VFL-application.
#
# author: Maximilian Kratz <maximilian.kratz@stud.tu-darmstadt.de>
# version: 2021-02-25
#

#FROM openjdk:14.0.2-jdk-buster
FROM registry.git-ce.rwth-aachen.de/etit/docker-cache/openjdk:15.0.2-jdk-buster
LABEL maintainer="Maximilian Kratz <maximilian.kratz@stud.tu-darmstadt.de"

# Upgrade base image to latest version
RUN apt-get update -q && \
    apt-get upgrade -yq

# Create workdir and copy jar file
RUN mkdir -p /app
COPY ./build/libs/${APP_FILENAME} /app
WORKDIR /app

# Create symlink from specific filename ${APP_FILENAME} to generic name.
# This is later used to start the java application *without* knowing its
# specific version (e.g. in release candidate images).
# The use of a symbolic link gives us the possibility to also start the
# image with the specific app filename, as before.
ENV GENERIC_APP_FILENAME VFL.jar

# Important: This matches on every jar file with the name "VFL<something>.jar" except for
# the one with "plain" in it. Keep in mind that this will break, if there are more than
# one matching jar files!
RUN ln -s $(find -type f -name "DoME*.jar" | grep -v "plain") ${GENERIC_APP_FILENAME}

# Expose port 8080 for web access
EXPOSE 8080

# Set spring boot environment to docker container
ENV SPRING_PROFILES_ACTIVE container

# Start java with build jar file
# (Used shell form of entrypoint to get access to envs here!)
#ENTRYPOINT java -jar ${APP_FILENAME}
ENTRYPOINT java -jar ${GENERIC_APP_FILENAME}
