pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/2300033279/cdd.git'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java file...'
                sh 'javac sample.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running Java program...'
                sh 'java sample'
            }
        }
    }

    post {
        success {
            echo 'Build and execution successful!'
        }
        failure {
            echo 'Build failed. Please check errors.'
        }
    }
}
