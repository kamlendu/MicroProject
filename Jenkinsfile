pipeline {
    agent any
 stages {
      

  stage('Docker Build and Tag') {
           steps {
                dir('MSAProject'){     
                 sh "/usr/bin/docker-compose down"         
                sh "/usr/bin/docker-compose up -d"
                }
             
          }
        }

    }
	}
