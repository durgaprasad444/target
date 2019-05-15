#!/usr/bin/env groovy


def call(body) {
    echo "Disable balancer"
    node {
    sh 'mvn clean package'
    }
   

    return this
}
