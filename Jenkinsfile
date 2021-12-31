pipeline {
  
  agent any
  
  tools {
    maven 'Maven'
  }
  
  stages {
    
    stage("build") {
      
      steps {
        
        echo 'building the project...'
        sh "mvn compile"
      }
    }
    
    stage("test") {
      
      steps {
        
        echo 'testing the project...'
      }
    }

    stage("SonarQube analysis") {
      agent any
      steps {
        withSonarQubeEnv('SonarCloud') {
          sh 'mvn sonar:sonar'
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

    stage("deploy") {
      
      steps {
        
        echo 'deploying the project...'
      }
    }
  }
}
