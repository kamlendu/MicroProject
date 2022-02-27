pipeline {
    agent any
	
	  tools
    {
       maven "Maven"
    }
 stages {
      

  stage('Docker Build and Tag') {
           steps {
                dir('MSAProject'){
                sh docker-compose up -d
                }
             
          }
        }

    }
	}
