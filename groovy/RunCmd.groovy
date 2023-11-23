class RunCmd {
    static def runCmd(script, String command) {
        if (script.isWindows()) {
            script.bat command
        } else {
            script.sh command
        }
    }

    static def isWindows(script) {
        return script.env.PATH.contains('C:\\')
    }
}