pipeline {
    agent any

    stages {
        stage('Test') {
            steps {
                ./gradlew check
            }
        }
        stage('Build') {
            steps {
                ./gradlew jar
            }
        }
    }
}
