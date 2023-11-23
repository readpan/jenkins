// RunCmd.groovy

// 定义一个类
class RunCmd {
    
    // 保存传入的脚本引用
    def script

    // 构造函数
    RunCmd(script) {
        this.script = script
    }

    // 方法用于运行命令
    def runCmd(String command) {
        if (isWindows()) {
            script.bat command
        } else {
            script.sh command
        }
    }

    // 方法用于判断是否是Windows系统
    private boolean isWindows() {
        return script.env.PATH.contains('C:\\')
    }
}
