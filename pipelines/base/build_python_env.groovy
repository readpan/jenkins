def call(RunCmd runCmd) {
    def envName = 'jenkins_env'
    def requirementsPath = 'requirements.txt'

    stage('Setup Python Environment') {
        // 使用传入的 runCmd 实例
        // 检查 conda 玡境是否存在
        def envExists = runCmd.runCmd("conda info --envs | grep ${envName}")
        // 打印envExists
        println envExists
        if (!envExists) {
            // 创建 conda 环境
            bat "echo 'conda env not exists'"
            // sh "conda create -n ${envName} python=3.10 -y"
        }

        // 激活环境并安装依赖
        // sh """
        //     source activate ${envName}
        //     pip install -r ${requirementsPath}
        // """
    }
}