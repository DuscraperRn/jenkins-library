
def call() {
    def asset = ['Stacy', 'Ajay','Alexy','Vladmir','Li','Seimens','Nokia','dsdd','Samsung','Ashish']
    def env = ['ns001','ns002','alx01','vld004','stcy01','seim','noki','mkm','ssng','kuchbhi']
    return [
        greet: {
            sh 'echo "Library has been imported successfully."'
        },
        getList: {
            return asset
        },
	getEnv: {
	    return env
	}
    ]
}
