
import hudson.model.*;

println env.JOB_NAME
println env.BUILD_NUMBER
println env.WORKSPACE

pipeline {
    agent any
    stages {
        stage("init") {
            steps {
                script {
                    model_test = load env.WORKSPACE + "/pipeline/module/pipelinetools.groovy"
                    println "欢迎来到Anthony的Pipeline教程。"
                }
            }
        }
        stage("Test Method") {
            steps {
                script {
                    println "欢迎来到Anthony的Pipeline教程2"
                }
            }
        }
    }
}