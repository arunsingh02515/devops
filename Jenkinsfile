pipeline {
    agent any
     tools {
         maven 'maven123'
         jdk    'jdk1.8'
         }
    stages {
     stage ('Initialize') {
                 steps {
                     sh '''
                         echo "PATH = ${PATH}"
                         echo "M2_HOME = ${M2_HOME}"
                     '''
                 }
             }
        stage('Build') {
            steps {
                echo "building the code"
                sh "mvn clean"
            }
        }

            stage('compile') {
                steps {
                    echo "compiling the code"
                    sh "mvn compile"
                }
            }

}
}