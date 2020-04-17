pipeline {
    agent any
     tools {
         maven 'maven123'
         jdk    'jdk1.8'
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
                    sh "docker build . -t arunksingh015/kubernet:${env.BUILD_NUMBER}"
                }
            }
             stage('docker push images') {
                   steps {
                     echo "pushing images to docker hub"
                      withCredentials([string(credentialsId: 'dockerHub', variable: 'dockerPassword')]) {
                           sh "docker login -u arunksingh015 -p ${dockerPassword}"
                           sh "docker push arunksingh015/kubernet:${env.BUILD_NUMBER}"
                                 }

                            }
                        }




}
}

