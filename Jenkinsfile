pipeline {
    agent any
 stages {
      

  stage('Docker Build and Tag') {
           steps {
                 sh "docker run --name=database -p 3406:3306 --network mynet -v /var/data:/var/lib/mysql -d mysql/mysql-server:5.7" 
                sh "docker run --name appcontainer --network mynet -d -p 7080:8080 appimage"  
                sh "docker run --name client --network mynet -d -p 7060:8080 climage"  
               
               
             
          }
        }

    }
	}
