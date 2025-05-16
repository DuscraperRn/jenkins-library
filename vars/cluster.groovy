def call(){
	def cluster_list = ['eastus-01','westeurope01','eastus02','northeurope01']
	return [
		msg: {
			echo "Initializing cluster list..."
		},
		getCluster: {
			return cluster_list
		}
	]
}
