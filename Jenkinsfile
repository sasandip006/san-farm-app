{
  agent any;
  tools{
    jdk "jdk17"
    maven "mvn"
  }
  environment{
    SANDEEP = "ANY valid Message"
  }
  
  options{
    retry(1)
    //timeout=10s
  }
  
  stages{
    stage("initialize and test"){
      steps{
        sh "pwd"
        sh "rm -r *"
        sh "mkdir -p ~/sandeep/logs"
        sh "groups"
        sh "echo 'sandh' | sudo -S sleep 1 && sudo su sandh"
        //sh "docker ps"
        sh "env"
        sh "echo $SANDEEP"
        sh "mvn -v"
        sh "mvn clean install"
      }
    }
  }
  
}