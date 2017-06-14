pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                sh './gradlew check'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew jar'
            }
        }
    }
    post {
        always {
            archive 'build/libs/*.jar'
            junit 'build/test-results/**/*.xml'
        }
    }
}
