
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
                    model_test.testFile()
                    model_test.readJson("/root/.jenkins/workspace/test2/testdata/test_json.json")
                    println "欢迎来到Anthony的Pipeline教程。"
                }
            }
        }
        stage("Test Method") {
            steps {
                script {
                    properties_file = env.WORKSPACE + "/testdata/test_json.json"
                    model_test.readJson(properties_file)
                    println(properties_file)
                    println "欢迎来到Anthony的Pipeline教程2"
                }
            }
        }
    }
}