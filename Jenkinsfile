pipeline{
    agent any

       stages {  
        stage("Build"){
            steps{
                sh 'mvn clean'
                echo "starting with the process"
            }
        }
        stage('Test') {
            steps { 
                sh 'mvn compile test'
            }
        } 
        
        stage('Package') {
            steps {  
                sh 'mvn package'
                echo 'Deploying...'
            }
        }
    }
    
}