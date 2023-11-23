def call() {
    stage('Test') {
        script{
            bat "echo 'conda env not exists'"
        }
    }
}