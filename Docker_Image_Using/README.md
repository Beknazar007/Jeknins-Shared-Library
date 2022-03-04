This folder has three jenkins files
## Jenkinsfile-1
        It contains just pulling docker image from dockerhub and check images version

        SUCCESS

## Jenkinsfile-2 
        You can run image for frontend and backend

        FAILED
## Jenkinsfile-3 
        This file will run your own docker file which located in your repository you can write to this image whatever you want.

        SUCCESS
    
I have done this project in 2 days . First day I had error with Docker in my worker node . In second day i fixed it and it works

# I installed Plugins for this 

1. Docker Compose Build Step Plugin
2. Docker plugin
3. docker-build-step
4. Docker Slaves Plugin
[Tutorial for this](https://www.youtube.com/watch?v=QNZNfvrFBMo&list=PLvBBnHmZuNQJeznYL2F-MpZYBUeLIXYEe&index=44)