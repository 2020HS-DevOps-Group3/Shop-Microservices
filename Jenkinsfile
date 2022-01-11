pipeline {
    agent any
  
    tools {
        maven 'Maven'
    }

    environment {
        DOCKERHUB_CREDENTIALS = credentials('generalnitin-dockerhub')
    }

//     triggers {
//         pollSCM('* * * * *')
//     }

    stages {
        stage("Compile and Build") {
            steps {
                echo 'Compile and Build the project...'
                sh "mvn clean install -DskipTests"
            }
        }
    
        stage("Test") {
            steps {
                echo 'Test the project...'
                sh "mvn test"
            }
        }

        stage("Code Analysis") {
            agent any
            steps {
                withSonarQubeEnv('SonarCloud') {
                    echo 'Static code analysis with SonarQube...'
                    sh 'mvn clean package -DskipTests sonar:sonar'
                }
            }
        }

//     stage("Quality Gate") {
//         steps {
//             timeout(time: 10, unit: 'MINUTES') {
//                 waitForQualityGate abortPipeline: true
//             }
//         }
//     }

//         stage('Deploy to Docker Hub') {
//             parallel {
                stage('Deploy Cloud-Gateway') {
                    steps {
                        sh 'docker build ./cloud-gateway -t generalnitin/devops-cloud-gateway:${GIT_COMMIT}'
                        withCredentials([string(credentialsId: 'generalnitin-dockerhub', variable: 'docker_pwd')]) {
                            sh "docker login -u generalnitin -p ${docker_pwd}"
                        }
                        sh "docker push generalnitin/devops-cloud-gateway:${GIT_COMMIT} "
                    }
                    post {
                        always {
                            sh 'docker logout'
                        }
                    }
                }

                stage('Deploy Order-Service') {
                    steps {
                        sh 'docker build ./order-service -t generalnitin/devops-order-service:${GIT_COMMIT}'
                        withCredentials([string(credentialsId: 'generalnitin-dockerhub', variable: 'docker_pwd')]) {
                            sh "docker login -u generalnitin -p ${docker_pwd}"
                        }
                        sh "docker push generalnitin/devops-order-service:${GIT_COMMIT}"
                    }
                    post {
                        always {
                            sh 'docker logout'
                        }
                    }
                }
                stage('Deploy Payment-Service') {
                    steps {
                        sh 'docker build ./payment-service -t generalnitin/devops-payment-service:${GIT_COMMIT}'
                        withCredentials([string(credentialsId: 'generalnitin-dockerhub', variable: 'docker_pwd')]) {
                            sh "docker login -u generalnitin -p ${docker_pwd}"
                        }
                        sh "docker push generalnitin/devops-payment-service:${GIT_COMMIT}"
                    }
                    post {
                        always {
                            sh 'docker logout'
                        }
                    }
                }
                stage('Deploy Product-Service') {
                    steps {
                        sh 'docker build ./product-service -t generalnitin/devops-product-service:${GIT_COMMIT}'
                        withCredentials([string(credentialsId: 'generalnitin-dockerhub', variable: 'docker_pwd')]) {
                            sh "docker login -u generalnitin -p ${docker_pwd}"
                        }
                        sh "docker push generalnitin/devops-product-service:${GIT_COMMIT}"
                    }
                    post {
                        always {
                            sh 'docker logout'
                        }
                    }
                }
                stage('Deploy Service-Registry') {
                    steps {
                        sh 'docker build ./service-registry -t generalnitin/devops-service-registry:${GIT_COMMIT}'
                        withCredentials([string(credentialsId: 'generalnitin-dockerhub', variable: 'docker_pwd')]) {
                            sh "docker login -u generalnitin -p ${docker_pwd}"
                        }
                        sh "docker push generalnitin/devops-service-registry:${GIT_COMMIT}"
                    }
                    post {
                        always {
                            sh 'docker logout'
                        }
                    }
                }
//             }
//         }
    }
}