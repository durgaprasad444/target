#!/usr/bin/env groovy


def call(body) {
    echo "Disable balancer"

    node {
        sh 'git clone https://github.com/durgaprasad444/hello-world.git'
    }
        
   

    return this
}
         
