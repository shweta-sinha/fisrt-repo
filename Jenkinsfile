pipeline {
	 agent any 
	 
	 stages {
		stage("compile") {
			steps {
				echo "Compiling"
				bat """ javac Mydate.java """
				}
			}
			
		stage ("run") {
			steps {
				echo "Running"
				bat """ java Mydate"""
				}
			}
			
		
		}
	}
