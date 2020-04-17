pipeline {
    agent any
     tools {
         maven 'maven123'
         jdk    'jdk1.8'
         }
     environment {

       TAG=createTag()
     }
    stages {

        stage('build war') {
            steps {
                echo "building the code"
                sh "mvn clean install"
            }
        }

            stage('docker build') {
                steps {
                    echo "building images"
                    sh "docker build . -t arunksingh015/kubernet:${TAG}"
                }
            }

}
}

def createTag(){
 return "v1"+${env.BUILD_NUMBER}

}