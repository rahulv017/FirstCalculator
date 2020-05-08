pipeline {

environment{
       registry="rahulv017/firstcalpipline"
       registryCredential='dockerhub'
       dockerImage='' 
       dockerImageLatest=''
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
                      dockerImage=docker.build registry + ":$BUILD_NUMBER"
                      dockerImageLatest=docker.build registry + ":latest"
                   }
               }
         }

          stage('Deploy Image') {
             steps{
                 script{
                      docker.withRegistry('',registryCredential){
                      dockerImage.push()
                      dockerImageLatest.push()
                     }
                 }
             }
          }
    
           stage('Removing Unused docker image'){
            steps{
                sh "docker rmi $registry:$BUILD_NUMBER"
            }
        }

             stage('Executing Rundeck Jobs'){
                  steps{
                     script{
                           step([$class: "RundeckNotifier",
                                 includeRundeckLogs:true,
                                 jobId: "38e01ca7-0fbc-4736-846b-9bbf4dbb2ac9",
                                 rundeckInstance: "Rundeck",
                                 shouldFailTheBuild:true,
                                 shouldWaitForRundeckJob:true,
                                 tailLog:true])
                             }
                      }
                }
                                 

     
  


        
    }
       post { 
        always { 
            echo 'I will always say Hello again!'
                
        }
    }
}
