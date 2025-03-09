#!/bin/bash

docker-compose up -d
chmod +x gradlew
./gradlew bootrun
