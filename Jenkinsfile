pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "building the code"
                sh "mvn clean"
            }
        }
    }

    stages {
            stage('compile') {
                steps {
                    echo "compiling the code"
                    sh "mvn compile"
                }
            }
        }
}