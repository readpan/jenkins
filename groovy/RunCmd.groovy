class RunCmd {

    def script

    RunCmd(script) {
        this.script = script
    }

    def boolean runCmd(String command) {
        if (isWindows()) {
            script.bat script: command, returnStatus: returnStatus
        } else {
            script.sh script: command, returnStatus: returnStatus
        }
    }

    private boolean isWindows() {
        return script.env.PATH.contains('C:\\')
    }
}
return new RunCmd(this)