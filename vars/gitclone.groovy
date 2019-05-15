#!/usr/bin/env groovy


def call(body) {
    echo "Disable balancer"

    ["git", "clone", "https://github.com/durgaprasad444/hello-world.git"].execute() 
        
   

    return this
}
         
