pipeline {
    agent any
     tools {
         maven 'maven123'
         jdk    'jdk 1.8'
         }
    stages {

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