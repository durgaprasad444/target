#!/usr/bin/env groovy


def call(body) {
    echo "Disable balancer"

    node {
        sh 'rm -rf hello-world'
        sh 'git clone https://github.com/durgaprasad444/hello-world.git'
        sh 'cd hello-world'
        
    }
        
   

    return this
}
         
