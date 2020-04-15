pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo "building the code"
                def mvnHome = tool name: 'maven', type: 'maven'
                sh "${mvnHome}/bin/mvn clean"
            }
        }

            stage('compile') {
                steps {
                    echo "compiling the code"
                    def mvnHome = tool name: 'maven', type: 'maven'
                    sh "${mvnHome}/bin/mvn compile"

                }
            }

}
}