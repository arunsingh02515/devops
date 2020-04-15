pipeline {
    agent any
    stages {
        stage('Build') {
                echo "building the code"
                def mvnHome = tool name: 'maven', type: 'maven'
                sh "${mvnHome}/bin/mvn clean"

        }

            stage('compile') {
                def mvnHome = tool name: 'maven', type: 'maven'
                steps {
                    echo "compiling the code"
                    sh "${mvnHome}/bin/mvn compile"

                }
            }

}
}