pipeline {
    agent any
    environment {
    PATH= "/home/oracle/Downloads/apache-maven/bin:$PATH"
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