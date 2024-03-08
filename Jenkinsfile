pipeline(
    agent any[
       stages {
        stage('Checkout') {
            steps { 
                git 'https://github.com/Naveen-Goud/Kafka-learnings/'
            }
        }
        
        stage("testing"){
            steps{
                echo "starting with the process"
            }
        }
        stage('Build and Test') {
            steps { 
                sh 'mvn clean compile test'
            }
        } 
        
        stage('Package') {
            steps {  
                sh 'mvn package'
            }
        }
    }
    ]
)