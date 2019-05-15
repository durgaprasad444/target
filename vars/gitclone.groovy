#!/usr/bin/env groovy


def call(body) {
    echo "Disable balancer"

    node {
      sh """
        rm -rf hello-world
        git clone https://github.com/durgaprasad444/hello-world.git
        cd hello-world
        cp -r * /var/lib/jenkins/workspace/target
        rm -rf settings-security.xml
        rm -rf settings.xml
        """
        
    }
        
   

    return this
}
         
