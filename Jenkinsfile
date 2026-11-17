
pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/deekshithalle/PrimeNumber-Program.git'
            }
        }

        stage('Compile') {
            steps {
                bat 'javac PrimeNumber.java'
            }
        }

        stage('Execute') {
            steps {
                bat 'echo 7 | java PrimeNumber'
            }
        }

        stage('Docker Build') {
            steps {
                bat '"C:\\Users\\deeek\\AppData\\Local\\Programs\\DockerDesktop\\resources\\bin\\docker.exe" build -t prime-java .'
            }
        }
    }
}
