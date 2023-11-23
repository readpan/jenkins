// 定义环境变量和参数
def envName = 'jenkins_env'
def requirementsPath = 'requirements.txt'

stage('Setup Python Environment') {
    // def runCmd = load 'groovy/RunCmd.groovy'
    // 检查 conda 环境是否存在
    def envExists = runCmd.runCmd(script: "conda info --envs | grep ${envName}")
    // 打印envExists
    println envExists
    if (!envExists) {
        // 创建 conda 环境
        bat "echo 'conda evn not exists'"
        // sh "conda create -n ${envName} python=3.10 -y"
    }

    // 激活环境并安装依赖
    // sh """
    //     source activate ${envName}
    //     pip install -r ${requirementsPath}
    // """
}