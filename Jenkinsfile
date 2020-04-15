pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "building the code"
                sh "mvn clean"
            }
        }


    stage {
            stage('compile') {
                steps {
                    echo "compiling the code"
                    sh "mvn compile"
                }
            }
        }
}
}