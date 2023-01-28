def call() {
    pipeline {
        agent {
            label 'workstation1'
        }
        stages {
            stage('compile/build') {
                steps {
                    echo 'compute'
                }
            }
            stage('Unit tests') {
                steps {
                    echo 'compute'
                }
            }
            stage('Quality Control') {
                steps {
                    echo 'compute'
                }
            }
            stage('Uplaod to centralised place') {
                steps {
                    echo 'Upload'
                }
            }
        }

}

