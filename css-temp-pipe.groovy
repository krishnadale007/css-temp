css-temp-pipe
pipeline{
    agent any
    stages{
        stege('pull'){
        steps{
            git branch: 'main', url: 'https://github.com/krishnadale007/css-temp.git'
        }
    }
    stege('build in docker'){
    setps{
        sh '''docker build -t krishna/krishnadale .
        '''
        }
    }
    stage('push docker hub'){
        steps{
            withDockerRegistry(credentialsId: 'docker-creds', url: 'https://hub.docker.com/repository/docker/') {
            sh```
            docker push krishna/krishnadale
            ```
            }   
        }
    }

    }
}
