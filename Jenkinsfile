pipeline {
    agent any

    environment {
        DOCKER_IMAGE_NAME = 'calculator_img'
        GITHUB_REPO_URL = 'https://github.com/JoshiRiya0110/SPE_MiniProject.git'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // Checkout the code from the GitHub repository
                    git branch: 'master', url: "${GITHUB_REPO_URL}"
                }
            }
        }
    }
}
