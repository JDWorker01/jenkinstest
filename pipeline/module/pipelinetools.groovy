import hudson.model.*
import groovy.json.*
def find_files(filetype) {

	def files = findFiles(glob:filetype)
	for (file in files) {
		println file.name
	}
}

def read_json(jsonPath){
    def jsonSlurper = new JsonSlurper()
    def jsonObject = jsonSlurper.parseText(new File(jsonPath).getText("UTF-8"))
    println("name=${jsonObject.GENDER}")
}
