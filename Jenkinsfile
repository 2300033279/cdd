pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/2300033279/cdd.git'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java source file'
                sh 'javac sample.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running Java program'
                sh 'java sample'
            }
        }
    }

    post {
        success {
            echo 'Pipeline executed successfully'
        }
        failure {
            echo 'Pipeline failed'
        }
    }
}
