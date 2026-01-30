pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                echo 'Checking out source code from GitHub'
                git branch: 'main', url: 'https://github.com/2300033279/cdd.git'
            }
        }

        stage('Compile') {
            steps {
                echo 'Compiling Java program'
                bat 'javac src\\HelloWorld.java'
            }
        }

        stage('Run') {
            steps {
                echo 'Running Java program'
                bat 'java -cp src HelloWorld'
            }
        }
    }

    post {
        success {
            echo '✅ Pipeline executed successfully'
        }
        failure {
            echo '❌ Pipeline failed'
        }
    }
}
