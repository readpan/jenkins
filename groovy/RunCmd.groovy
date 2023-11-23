class RunCmd {
    static def runCmd(def script, String command) {
        if (script.isWindows()) {
            script.bat command
        } else {
            script.sh command
        }
    }

    static def isWindows(def script) {
        return script.env.PATH.contains('C:\\')
    }
}