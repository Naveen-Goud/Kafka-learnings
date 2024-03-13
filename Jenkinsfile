pipeline{
    agent any

       stages {  

        stage("Build"){
            steps{
                  sh """
                    cd final-Assignment/producer &&
                    mvn clean
                """
                echo "starting with the process"
            }
        }
        stage('Test') {
            steps { 
                sh """cd final-Assignment/producer && mvn -B verify """
            }
        } 
        
        stage('Deploy') {
            steps {  
                echo 'Deploying...'
            }
        }
    }
    
}