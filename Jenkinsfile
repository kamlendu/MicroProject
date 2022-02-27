pipeline {
    agent any
 stages {
      

  stage('Docker Build and Tag') {
           steps {
                dir('MSAProject'){     
                 sh "/usr/local/bin/docker-compose down"         
                sh "/usr/local/bin/docker-compose up -d"
                }
             
          }
        }

    }
	}
