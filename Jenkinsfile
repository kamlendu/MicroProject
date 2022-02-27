pipeline {
    agent any
 stages {
      

  stage('Docker Build and Tag') {
           steps {
                dir('MSAProject'){
                sh "docker-machine start default"
                sh "docker-compose up -d"
                }
             
          }
        }

    }
	}
