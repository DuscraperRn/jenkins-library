
def call() {
    asset = ['Stacy', 'Ajay','Alexy','Vladmir','Li']
    return [
        greet: {
            sh 'echo "Library has been imported successfully."'
        },
        getList: {
            return asset
        }
    ]
}
