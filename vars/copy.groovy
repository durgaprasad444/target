#!/usr/bin/env groovy


def call(body) {
    echo "Disable balancer"

    sh 'mvn clean package'
        
   

    return this
}
