pipeline{
    agent any

       stages {  

        stage("Build"){
            steps{
                  sh """
                    cd final-Assignment/producer-cab_driver &&
                    mvn clean
                """
                echo "starting with the process"
            }
        }
        stage('Test') {
            steps { 
                sh 'cd final-Assignment/producer-cab_driver && mvn compile test'
            }
        } 
        
        stage('Package') {
            steps {  
                sh 'cd final-Assignment/producer-cab_driver && mvn package'
                echo 'Deploying...'
            }
        }
    }
    
}