pipeline {
    agent any
  
   tools {
        maven "Maven"
    }
    stages {
        stage ('Compile Stage') {

            steps {
                
                    sh 'mvn clean compile'
                
            }
        }

        stage ('Testing Stage') {

            steps {
                
                    sh 'mvn test'
                
            }
        }


        
    }
       post { 
        always { 
            echo 'I will always say Hello again!'
   sh 'java -cp target/Calculator-0.0.1-SNAPSHOT.jar Calculator.Calculator.App'
        }
    }
}
