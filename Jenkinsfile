pipeline {
    agent any
    environment {
    PATH= "/home/oracle/Downloads/apache-maven/bin:$PATH"
    }
    stages {
    stage('Checkout') {
                steps {
                    echo "checkout code"
                    git 'https://github.com/arunsingh02515/devops.git'
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