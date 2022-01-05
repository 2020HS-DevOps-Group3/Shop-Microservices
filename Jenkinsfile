pipeline {
  
  agent any
  
  tools {
    maven 'Maven'
  }

  triggers {
      pollSCM('* * * * *')
  }

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
//       steps {
//         timeout(time: 10, unit: 'MINUTES') {
//           waitForQualityGate abortPipeline: true
//         }
//       }
//     }

    stage("Deploy") {
      steps {
        echo 'Deploy the project...'
      }
    }
  }
}
