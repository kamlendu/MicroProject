pipeline {
    agent any
 stages {
      

  stage('Docker Build and Tag') {
           steps {
                dir('MSAProject'){
                sh "docker-compose up -d"
                }
             
          }
        }

    }
	}
