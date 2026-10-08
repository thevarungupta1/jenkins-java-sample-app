pipeline {

    agent any

    tools {
        maven 'Maven-3.9'
    }

    environment {
        APP_NAME = 'quickcart-order-service'
    }

    stages {

        stage('Build') {

            steps {

                echo "Building ${APP_NAME}"

                sh 'mvn clean compile'
            }
        }
    }

    post {

        success {
            echo 'QuickCart Maven build successful'
        }

        failure {
            echo 'QuickCart Maven build failed'
        }
    }
}