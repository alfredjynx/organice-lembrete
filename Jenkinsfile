pipeline {
    agent any
    stages {
        stage('Build Account') {
            steps {
                build job: 'organice-account', wait: true
            }
        }
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