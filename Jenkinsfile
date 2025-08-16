pipeline {
    agent any

    tools {
        maven 'Maven3'   // 👈 nombre configurado en Jenkins
    }

    stages {
        stage('Compilar') {
            steps {
                bat 'mvn clean compile'
            }
        }
        stage('Pruebas') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
