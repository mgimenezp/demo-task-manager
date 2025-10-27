
pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/mgimenezp/demo-task-manager.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                bat 'deploy.bat'
            }
        }
    }
}
