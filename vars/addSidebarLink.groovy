def call(Map config = [:]) {
    def action = new hudson.plugin.sidebar_link.LinkAction(config.url,config.text,config.icon)
    currentBuild.rawBuild.addAction(action)
}