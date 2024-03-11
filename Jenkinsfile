pipeline{
    agent any

       stages {  
        stage("Build"){
            steps{
                sh 'cd Kafka-learnings && mvn clean'
                echo "starting with the process"
            }
        }
        stage('Test') {
            steps { 
                sh 'cd Kafka-learnings && mvn compile test'
            }
        } 
        
        stage('Package') {
            steps {  
                sh 'cd Kafka-learnings && mvn package'
                echo 'Deploying...'
            }
        }
    }
    
}