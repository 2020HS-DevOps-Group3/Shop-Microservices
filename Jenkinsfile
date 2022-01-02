pipeline {
  
  agent any
  
  tools {
    maven 'Maven'
  }
  
  stages {
    stage("Build") {
      steps {
        echo 'Build the project...'
        sh "mvn compile"
      }
    }
    
    stage("Test") {
      steps { 
        echo 'Test the project...'
      }
    }

    stage("SonarQube") {
      agent any
      steps {
        withSonarQubeEnv('SonarCloud') {
          sh 'mvn clean package sonar:sonar'
        }
      }
    }

    // stage("Quality Gate") {
    //   steps {
    //     timeout(time: 10, unit: 'MINUTES') {
    //       waitForQualityGate abortPipeline: true
    //     }
    //   }
    // }

    stage("Deploy") {
      steps {
        echo 'Deploy the project...'
      }
    }
  }
}
