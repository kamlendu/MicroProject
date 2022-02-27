pipeline {
    agent any
 stages {
      

  stage('Docker Build and Tag') {
           steps {
               
                sh "docker run --name appcontainer --network mynet -d -p 7080:8080 kamlendupandey/appimage"  
                sh "docker run --name client --network mynet -d -p 7060:8080 kamlendupandey/climage"  
                sh "docker run --name client --network mynet -d -p 3406:3306 kamlendupandey/mysqldata"
               
             
          }
        }

    }
	}
