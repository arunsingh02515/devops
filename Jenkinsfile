pipeline {
    agent any
 tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
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