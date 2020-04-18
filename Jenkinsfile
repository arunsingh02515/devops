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
               stage('deploy on kube ') {
                         steps {
                              echo "deploy on kube"
                              sh "chmod +x changeTag.sh"
                              sh "./changeTag.sh ${env.BUILD_NUMBER}"
                              sshagent(['kube-ssh']) {
                                     sh scp -o StrictHostKeyChecking=no services.yml node-app-pod.yml admin@13.234.111.92:/home/admin
                                     script {
                                         try {
                                          sh "ssh admin@13.234.111.92 kubectl apply -f ."
                                            }
                                         catch(error) {
                                            sh "ssh admin@13.234.111.92 kubectl create -f ."
                                            }

                                          }
                                      }
                                }
                       }






}
}

