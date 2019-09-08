

pipeline {
     agent any
     tools { // this is the jdk specified in global configurations
        jdk 'JDK11'
      }

    stages {
        stage('Clean Build') {
            steps {
                    sh "chmod +x gradlew"
                    sh "./gradlew clean build"
                    sh "mv ../build/libs/backend-0.1.0-SNAPSHOT.jar ../app.jar"
            }
        }
         stage('Deploy') {
                    steps {
                         sh 'app.jar'
                    }
                }
    }
}
