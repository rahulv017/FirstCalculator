pipeline {

environment{
       registry="rahulv017/firstcalpipline"
       registryCredential='dockerhub'
       dockerImage='' 
     }
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
          
       stage ('Building image')
        {
           steps{
                 script {
                      docker.build registry + " :$BUILD_NUMBER"
                   }
               }
         }

          stage('Deploy Image') {
             steps{
                 script{
                      docker.withRegistry('',registryCredential){
                      dockerImage.push()
                     }
                 }
             }
          }
    
           stage('Removing Unused docker image'){
            steps{
                sh "docker rmi $registry:$BUILD_NUMBER"
            }
        }

     
  


        
    }
       post { 
        always { 
            echo 'I will always say Hello again!'
                
        }
    }
}
