#!/usr/bin/env groovy


def call(body) {
    echo "Disable balancer"
    node {
    sh 'mvn package -DskipTests=true'
    }
   

    return this
}
