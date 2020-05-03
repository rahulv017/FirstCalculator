pipeline {
    agent any

    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'Maven') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'Maven') {
                    sh 'mvn test'
                }
            }
        }


        
    }
       post { 
        always { 
            echo 'I will always say Hello again!'
            sh 'java -cp target/Calculator-0.0.1-SNAPSHOT.jar Calculator.Calcula            tor.App'
        }
    }
}
