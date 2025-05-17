
def call() {
    def asset = ['Stacy', 'Ajay','Alexy','Vladmir','Li','Seimens','Nokia']
    def env = ['ns001','ns002','alx01','vld004','stcy01','seim','noki']
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
