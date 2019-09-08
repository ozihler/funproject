

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
            }
        }
         stage('Deploy') {
                    steps {
                        sh 'chmod +x var/jenkins_home/workspace/funproject/backend/build/libs/backend-0.1.0-SNAPSHOT.jar'
                        sh 'java var/jenkins_home/workspace/funproject/backend/build/libs/backend-0.1.0-SNAPSHOT.jar'
                    }
                }
    }
}
