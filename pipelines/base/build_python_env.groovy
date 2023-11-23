// scriptA.groovy

node {
    // 定义环境变量和参数
    def envName = 'jenkins_env'
    def requirementsPath = 'requirements.txt'

    stage('Setup Python Environment') {
        bat "echo 'aa'"
        bat "conda info --envs"
        // // 检查 conda 环境是否存在
        // def envExists = sh(script: "conda info --envs | grep ${envName}", returnStatus: true) == 0
        // if (!envExists) {
        //     // 创建 conda 环境
        //     sh "conda create -n ${envName} python=3.10 -y"
        // }

        // // 激活环境并安装依赖
        // sh """
        //     source activate ${envName}
        //     pip install -r ${requirementsPath}
        // """
    }
}
