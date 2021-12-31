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
    
    stage("deploy") {
      
      steps {
        
        echo 'deploying the project...'
      }
    }
  }
}
