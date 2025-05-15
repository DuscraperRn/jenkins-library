def customers = ['Stacy', 'Ajay','Alexy','Vladmir','Li']
def call(){
	sh 'echo "Library has been imported successfully." '
}

def getCustomers() {
    return customers
}
