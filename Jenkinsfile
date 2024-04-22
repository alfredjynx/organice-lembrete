pipeline {
    agent any
    stages {
        stage('Jenkins Lembrete') {
            steps {
                echo 'Jenkins Lembrete'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}