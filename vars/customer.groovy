
def call() {
    def asset = ['Stacy', 'Ajay','Alexy','Vladmir','Li']
    def env = ['ns001','ns002','alx01','vld004','stcy01']
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
