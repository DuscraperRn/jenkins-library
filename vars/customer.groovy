def asset = ['Stacy', 'Ajay','Alexy','Vladmir','Li']

def call() {
    return [
        greet: {
            sh 'echo "Library has been imported successfully."'
        },
        getList: {
            return asset
        }
    ]
}
