#!/usr/bin/env groovy


stage("clone code") {
                
                    
                    // Let's clone the source
                    sh """ 
                      git clone https://github.com/durgaprasad444/${APP_NAME}.git            
                      cd ${APP_NAME}
                      cp -r * /home/jenkins/workspace/maven-example
                    """
                }
         
